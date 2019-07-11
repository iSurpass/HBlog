package com.juniors.spring.boot.blog.domin;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 用户实体类
 * @author Juniors
 */
@Entity
@XmlRootElement
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;

    // 用户唯一标识---主键
    @Id
    //自增策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "姓名不能为空")
    @Size(min = 6, max = 20)
    @Column(nullable = false,length = 20)
    private String name;

    @NotEmpty(message = "邮箱不能为空")
    @Size(max = 50)
    @Email(message = "邮箱格式不正确")
    @Column(nullable = false,length = 50,unique = true)
    private String email;

    @NotEmpty(message = "账号不能为空")
    @Size(min = 3, max = 20)
    @Column(nullable = false, length = 20, unique = true)
    private String username;

    @NotEmpty(message = "密码不能为空")
    @Size(min = 6, max = 20)
    @Column(nullable = false, length = 20)
    private String password;

    //用户头像图片地址
    @Column(length = 200)
    private String avatar;

    // JPA 的规范要求无参数构造函数
    protected User(){

    }

    public User(Long id, String name, String email, String username){
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString(){
        return String.format("User[id=%d,name='%s',email='%s',username='%s']",id,name,email,username);
    }
}
