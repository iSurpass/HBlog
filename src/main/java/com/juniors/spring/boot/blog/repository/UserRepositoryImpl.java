package com.juniors.spring.boot.blog.repository;

import com.juniors.spring.boot.blog.domin.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 用户持久层接口实现类
 * @author Juniors
 */
//@Repository
//public class UserRepositoryImpl implements UserRepository{
//
//    //累加器
//    private static AtomicLong counter = new AtomicLong();
//
//    //将用户数据存储在Map当中
//    private final ConcurrentMap<Long,User> userMap = new ConcurrentHashMap<>();
//
//    @Override
//    public User saveOrUpdateUser(User user) {
//
//        Long id = user.getId();
//        if (id == null){
//            id = counter.incrementAndGet();
//            user.setId(id);
//        }
//        this.userMap.put(id,user);
//        return user;
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//
//        this.userMap.remove(id);
//    }
//
//    @Override
//    public User getUserById(Long id) {
//
//        return this.userMap.get(id);
//    }
//
//    @Override
//    public List<User> listUser() {
//
//        return new ArrayList<User>(this.userMap.values());
//    }
//}
