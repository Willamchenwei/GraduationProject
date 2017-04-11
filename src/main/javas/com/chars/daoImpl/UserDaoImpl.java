package com.chars.daoImpl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.chars.dao.UserDao;
import com.chars.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	@Resource
	private SqlSessionTemplate sqlSession;
	public User getUser(int id) {
		return (User)sqlSession.selectOne("com.chars.mapping.UserMapper.getUser", id);
	}

}
