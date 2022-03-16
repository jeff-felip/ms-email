package com.ms.email.models;
import com.ms.email.dtos.EmailDto;
import com.ms.email.enums.StatusEmail;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {

    private static final long serialVersionUID = 1L;


    public EmailModel(){}

    public EmailModel(EmailDto emailDto) {
        this.ownerRef = emailDto.getOwnerRef();
        this.emailFrom = emailDto.getEmailFrom();
        this.emailTo = emailDto.getEmailTo();
        this.subject = emailDto.getSubject();
        this.text = emailDto.getText();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;



}
