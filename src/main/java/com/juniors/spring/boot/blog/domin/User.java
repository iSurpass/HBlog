package com.juniors.spring.boot.blog.domin;

import javax.persistence.*;
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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    // JPA 的规范要求无参数构造函数
    protected User(){

    }

    public User(Long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
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

    @Override
    public String toString(){
        return String.format("User[id=%d,name='%s',email='%s']",id,name,email);
    }
}
