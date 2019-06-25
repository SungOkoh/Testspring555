package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public List<UserVO> getUserName() {
		return userMapper.listMap();
	}
	
	public int insertName(UserVO userVO){
		return userMapper.insertMap(userVO);
	}
}
