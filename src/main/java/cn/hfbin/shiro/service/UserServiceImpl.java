package cn.hfbin.shiro.service;

import cn.hfbin.shiro.mapper.UserMapper;
import cn.hfbin.shiro.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
