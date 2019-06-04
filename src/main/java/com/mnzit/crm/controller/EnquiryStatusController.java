/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.controller;

import com.mnzit.crm.base.AdminBaseController;
import com.mnzit.crm.entity.EnquirySource;
import com.mnzit.crm.entity.EnquiryStatus;
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
@RequestMapping(value = "/enquiry/statuses")
public class EnquiryStatusController extends AdminBaseController<EnquiryStatus> {

    public EnquiryStatusController() {
        header = "Enquiry Status";
        view = "enquiry/status";
        redirect = "redirect:/enquiry/statuses";
    }

//    @GetMapping(value = "/delete/{id}")
//    public String delete(@PathVariable("id") long id, Model model) {
//        EnquiryStatus status = repository.getOne(id);
//        status.setDeleted(false);
//        status.setDeletedDate(new Date());
//        repository.save(status);
//        return "redirect:/enquiry/statuses";
//    }
}
