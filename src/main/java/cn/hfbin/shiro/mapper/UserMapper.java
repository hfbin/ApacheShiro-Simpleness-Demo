package cn.hfbin.shiro.mapper;

import cn.hfbin.shiro.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
