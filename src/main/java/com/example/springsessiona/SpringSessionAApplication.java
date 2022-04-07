package com.example.springsessiona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SpringBootApplication
public class SpringSessionAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSessionAApplication.class, args);
    }

    @RequestMapping("/get/{name}")
    public String getSesseion(HttpServletRequest request, @PathVariable("name") String name){
        HttpSession session = request.getSession();
        String value = (String)session.getAttribute(name);
        return "sessionId:"+session.getId()+" value:"+value;
    }



}
