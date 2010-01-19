package com.commons.sample.dao;

import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class JdbcSimpleDao extends SimpleJdbcDaoSupport implements SimpleDao {

	final static String single 	= "select id, name from test where id = ?"; 
	final static String list 	= "select id, name from test"; 

	public Simple getSimpleById(int id) {
		return getSimpleJdbcTemplate().queryForObject(single, 
				ParameterizedBeanPropertyRowMapper.newInstance(Simple.class), id);
	}

	public List<Simple> getSimples() {
		return getSimpleJdbcTemplate().query(list, 
				ParameterizedBeanPropertyRowMapper.newInstance(Simple.class));
	}

}
