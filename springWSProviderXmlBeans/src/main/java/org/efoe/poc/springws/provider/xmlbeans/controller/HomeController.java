/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.efoe.poc.springws.provider.xmlbeans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Emmanuel
 */
@Controller
public class HomeController {
    
    @RequestMapping("/index")
    public String home(){
        return "index";
    }
}
