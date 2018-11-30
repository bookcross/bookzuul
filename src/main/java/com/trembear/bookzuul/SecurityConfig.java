//package com.trembear.bookzuul;
//
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author Junwei.Xiong
// * @description webSecurityConfig
// * @since 2018-11-19 10:35
// */
//@Configuration
//@EnableOAuth2Sso
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    //配置Http访问的权限
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/public","/login").permitAll()
//                .anyRequest().access("@requestAuthenticationService.isPossessPermission(authentication, request)")
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/private")
//                .permitAll()
//                .and()
//                .logout().permitAll()
//                .logoutSuccessUrl("/public")
//                .and()
//                .csrf().disable() ; //注销行为任意访问
//    }
//}
