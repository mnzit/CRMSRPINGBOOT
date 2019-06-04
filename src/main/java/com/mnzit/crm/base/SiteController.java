/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.crm.base;

import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Mnzit
 */
public abstract class SiteController {

    protected String header;

    @ModelAttribute("header")
    public String setHeader() {
        return header;
    }
}
