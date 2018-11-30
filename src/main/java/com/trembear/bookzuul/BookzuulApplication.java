package com.trembear.bookzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RestController
@EnableOAuth2Client
public class BookzuulApplication {
    @RequestMapping("/public")
    public String getPublic(HttpServletRequest request){
        System.out.println(request.getRequestURI());
//        System.out.println(request.getCookies()[0].getValue());
        return "public method";
    }
    @RequestMapping("/private")
    public String getPrivate(){
        return "private method";
    }
    public static void main(String[] args) {
        SpringApplication.run(BookzuulApplication.class, args);
    }
}
