package com.codegym.cgmailapp.controller;

import com.codegym.cgmailapp.form.EmailForm;
import com.codegym.cgmailapp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String getHome(Model model) {
        EmailForm newEmailForm = new EmailForm();
        model.addAttribute("emailForm", newEmailForm);
        return "index";
    }

    @PostMapping("/send")
    public String sendEmail(@ModelAttribute("emailForm") EmailForm emailForm) {
        emailService.sendSimpleMail(emailForm);
        return "success";
    }
}
