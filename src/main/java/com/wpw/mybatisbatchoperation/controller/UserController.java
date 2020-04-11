package com.wpw.mybatisbatchoperation.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wpw.mybatisbatchoperation.entity.User;
import com.wpw.mybatisbatchoperation.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 用户控制器
 *
 * @author wpw
 */
@RestController
public class UserController {
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping(value = "/select")
    public User selectOne(@RequestParam(value = "userName") String userName, @RequestParam(value = "passWord") String passWord) {
        return userMapper.selectOne(userName, passWord);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestParam(value = "id") Integer id) {
        return userMapper.delete(id);
    }

    @PutMapping(value = "/update")
    public boolean update(@RequestBody User user) {
        return userMapper.update(user);
    }

    @PostMapping(value = "/insert")
    public int insert(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @GetMapping(value = "/selectList")
    public List<User> selectList(@RequestParam(value = "userName") String userName) {
        return userMapper.selectList(userName);
    }

    @PostMapping(value = "/batchInsert")
    public int batchInsert(@RequestBody JSONObject jsonObject) {
        return userMapper.batchInsert(jsonObject.getJSONArray("userList").toJavaList(User.class));
    }

    @DeleteMapping(value = "/batchDelete")
    public boolean batchDelete(@RequestBody JSONObject jsonObject) {
        return userMapper.batchDelete(jsonObject.getJSONArray("userList").toJavaList(User.class));
    }

    @PostMapping(value = "/batchList")
    public List<User> batchList(@RequestBody JSONObject jsonObject) {
        return userMapper.batchList(jsonObject.getJSONArray("userList").toJavaList(User.class));
    }

    @PutMapping(value = "/batchUpdate")
    public boolean batchUpdate(@RequestBody JSONObject jsonObject) {
        return userMapper.batchUpdate(jsonObject.getJSONArray("userList").toJavaList(User.class));
    }
}
