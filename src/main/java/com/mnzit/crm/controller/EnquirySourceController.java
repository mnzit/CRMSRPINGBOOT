/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.controller;

import com.mnzit.crm.base.AdminBaseController;
import com.mnzit.crm.entity.EnquirySource;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Mnzit
 */
@Controller
@RequestMapping(value = "/enquiry/sources")
public class EnquirySourceController extends AdminBaseController<EnquirySource> {

    public EnquirySourceController() {
        header = "Enquiry Source";
        view = "enquiry/source";
        redirect = "redirect:/enquiry/sources";
    }

//    @GetMapping(value = "/delete/{id}")
//    public String delete(@PathVariable("id") long id, Model model) {
//        EnquirySource source = repository.getOne(id);
//        source.setDeleted(false);
//        source.setDeletedDate(new Date());
//        repository.save(source);
//        return "redirect:/enquiry/sources";
//    }
}
