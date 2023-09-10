package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private Object1 object1;

    @Autowired
    private Object2 object2;

    @Autowired
    private EmailHandler emailHandler;

    @GetMapping("/getObjects")

    public String getObjects() {
        return "Object1 :" + object1.toString() + "\n Object2 :" + object2.toString();
    }

    @GetMapping("/sendEmail")

    @Bean
    public String sendEmail() {
        String object1String = object1.toString();
        String object2String = object2.toString();

        String subject = "Objects as Strings";
        String body = "Priyanka rai Mail : " + object1String + "\n Weekly test Assignment : " + object2String;

        emailHandler.sendEmail("divya8960rai@gmail.com", subject, body);

        return "Email sent!";
        //send
    }
}