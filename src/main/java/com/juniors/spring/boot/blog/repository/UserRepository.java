package com.juniors.spring.boot.blog.repository;

import com.juniors.spring.boot.blog.domin.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户持久层接口
 *
 * @author Juniors
 */
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 根据用户姓名分页查询用户列表
     * @param name
     * @param pageable
     * @return
     */
    Page<User> findByNameLike(String name, Pageable pageable);

    /**
     * 根据用户账号查询用户
     * @param username
     * @return
     */
    User findByUsername(String username);

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
