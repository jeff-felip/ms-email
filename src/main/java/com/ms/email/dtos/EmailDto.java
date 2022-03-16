package com.ms.email.dtos;

import com.ms.email.models.EmailModel;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;


    public EmailDto(){

    }

    public EmailDto(String ownerRef, String emailFrom, String emailTo, String subject, String text) {
        this.ownerRef = ownerRef;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.subject = subject;
        this.text = text;
    }

    public EmailDto(EmailModel email) {
        this.ownerRef = email.getOwnerRef();
        this.emailFrom = email.getEmailFrom();
        this.emailTo = email.getEmailTo();
        this.subject = email.getSubject();
        this.text = email.getText();
    }

}
