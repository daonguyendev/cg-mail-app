package com.codegym.cgmailapp.service;

import com.codegym.cgmailapp.form.EmailForm;

public interface EmailService {

    void sendSimpleMail(EmailForm emailForm);
}
