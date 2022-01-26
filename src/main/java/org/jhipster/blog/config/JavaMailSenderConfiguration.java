package org.jhipster.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class JavaMailSenderConfiguration {

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        //Your host - example smtp.gmail.com
        mailSender.setHost("smtp.gmail.com");
        //Your port - example 587 for gmail
        mailSender.setPort(587);

        //Your username - example test@gmail.com
        mailSender.setUsername("test@gmail.com");
        //Your password - example test
        mailSender.setPassword("test");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }
}
