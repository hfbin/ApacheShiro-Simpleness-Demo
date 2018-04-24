package cn.hfbin.shiro.service;

import cn.hfbin.shiro.model.User;

public interface UserService {

    User findByUsername(String username);
}
