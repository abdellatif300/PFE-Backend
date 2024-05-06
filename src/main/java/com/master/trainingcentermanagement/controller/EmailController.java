package com.master.trainingcentermanagement.controller;

import com.master.trainingcentermanagement.dto.EmailDto;
import com.master.trainingcentermanagement.entity.Participant;
import com.master.trainingcentermanagement.repository.ParticipantRepo;
import com.master.trainingcentermanagement.service.impl.MailSenderServiceImp;
import com.master.trainingcentermanagement.service.impl.ParticipantServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import org.thymeleaf.context.Context;
import java.util.List;


@RestController
@RequestMapping("/api/v1/emails")
@CrossOrigin("http://localhost:4200")
@RequiredArgsConstructor
public class EmailController {


    private final MailSenderServiceImp mailSenderServiceImp;
    private final ParticipantRepo participantRepo ;


//    @PostMapping("/feedback")
    public String sendFeedbackEmailEncoded(@RequestBody EmailDto emailDto) {
           System.out.println(emailDto);
            Context context = new Context();
            context.setVariable("message", emailDto.getBody());
            mailSenderServiceImp.sendEmailWithHtmlTemplate(emailDto.getTo(), emailDto.getSubject(), "email-template", context , emailDto.getCourseId(), emailDto.getParticipantId());
            return "HTML email sent successfully!";


    }


    @PostMapping("/feedback")
    public String sendFeedbackEmail(@RequestBody EmailDto emailDto) {
        System.out.println(emailDto);
        Context context = new Context();
        context.setVariable("message", emailDto.getBody());
        mailSenderServiceImp.sendEmailWithHtmlTemplate(emailDto.getTo(), emailDto.getSubject(), "email-template", context , emailDto.getCourseId(), emailDto.getParticipantId());
        return "HTML email sent successfully!";


    }
}

