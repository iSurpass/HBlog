package com.juniors.spring.boot.blog.service;

import com.juniors.spring.boot.blog.domin.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Juniors
 */
public interface UserService {

    /**
     * 新建,编辑用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    User registerUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void removeUser(Long id);

    /**
     * 根据 id 获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 通过用户姓名进行模糊查询
     *
     * @param name
     * @param pageable
     * @return
     */
    public Page<User> listUserByNameLike(String name, Pageable pageable);
}
