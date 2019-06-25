package com.example.demo.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	public List<UserVO> listMap();
	public int insertMap(UserVO userVO);
}
