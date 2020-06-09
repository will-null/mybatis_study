package com.mapper;

import com.model.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UsersMapper {

    //根据ID查     @Param()注解
    Users getUsers(@Param("idu") int suibian);

    //注解开发(不推荐使用,只了解就好)可以省去UserMapper.xml,
    // mybatis-config.xml中的mapper只要class到此接口文件就可以,
    //实际开发中还是需要UserMapper.xml
    //@Select("select * from users")
    //Users getUsersByZhu();

    //增
    int addUser(Users users);

    //分页    map传参,并不正规,但很好用
    List<Users> getLimitUsers(Map<String,Integer>map);

    //多对一(两种方式:子查询/连表查询.此处用连表查询)
    //一对多不提倡使用,大部分会把控制权交给多的那一方,而不是一的那一方
    List<Users> getUsersSex();

    //动态SQL(万能的map,不合规范,但极好使用)
    List<Users> getDongTai(String word);
}
