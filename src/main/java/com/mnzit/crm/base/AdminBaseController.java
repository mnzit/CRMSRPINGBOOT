/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.base;

import com.mnzit.crm.entity.EnquirySource;
import com.mnzit.crm.helper.ReflectionHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Mnzit
 */
public abstract class AdminBaseController<T> extends SiteController {

    @Autowired
    protected JpaRepository<T, Long> repository;

    protected String view = "";

    protected String redirect = "";

    @GetMapping
    public String index(Model model) {
        model.addAttribute("records", repository.findAll());
        return view + "/index";
    }

    @GetMapping(value = "/add")
    public String add() {
        return view + "/add";
    }

    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        model.addAttribute("record", repository.getOne(id));
        return view + "/edit";
    }

    @PostMapping()
    public String save(T model, @RequestParam(value = "addMore", required = false) String addMore) {
        repository.save(model);
        if (addMore == null) {
            return redirect;
        }
        return redirect + "/add";
    }

    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") long id, Model model) {
        T source = repository.getOne(id);
        ReflectionHelper.set(source, "deleted", true);
        ReflectionHelper.set(source, "deletedDate", new Date());
        repository.save(source);
        return redirect;
    }
}
