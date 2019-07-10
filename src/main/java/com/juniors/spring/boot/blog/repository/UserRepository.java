package com.juniors.spring.boot.blog.repository;

import com.juniors.spring.boot.blog.domin.User;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户持久层接口
 *
 * @author Juniors
 */
public interface UserRepository extends CrudRepository<User,Long> {


//    /**
//     * 保存或更新用户数据
//     * @param user
//     * @return
//     */
//    User saveOrUpdateUser(User user);
//
//    /**
//     * 删除用户数据
//     * @param id
//     */
//    void deleteUser(Long id);
//
//    /**
//     * 利用 Id 主键查询用户
//     * @param id
//     * @return
//     */
//    User getUserById(Long id);
//
//    /**
//     * 获取用户列表
//     * @return
//     */
//    List<User> listUser();
}
