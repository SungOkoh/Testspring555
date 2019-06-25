package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	/*
	 * @Autowired private JdbcTemplate jdbctemplate;
	 * 
	 * public List<UserVO> listForBeanPropertyRowMapper(){ String query =
	 * "select * from spring.user"; return jdbctemplate.query(query, new
	 * BeanPropertyRowMapper<UserVO>(UserVO.class)); }
	 * 
	 * public int insert(UserVO userVO) { String query =
	 * "insert into spring.user values(?, ?)"; return jdbctemplate.update(query,
	 * userVO.getUserNum(), userVO.getUserName()); }
	 */
}
