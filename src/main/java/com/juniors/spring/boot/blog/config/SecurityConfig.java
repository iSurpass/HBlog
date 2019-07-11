package com.juniors.spring.boot.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 权限安全配置类
 * @author Juniors
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 自定义配置
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //对于静态资源和首页允许无权限访问
                .antMatchers("/css/**","/js/**","/fonts/**","/index").permitAll()
                //对于用户信息需要有权限
                .antMatchers("/users/**").hasRole("ADMIN")
                .and()
                //基于 Form 表单登录验证
                .formLogin()
                .loginPage("/login");
    }

    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth    //认证信息存储在内存中
                .inMemoryAuthentication()
                    .withUser("juniors").password("123456").roles("ADMIN");
    }
}
