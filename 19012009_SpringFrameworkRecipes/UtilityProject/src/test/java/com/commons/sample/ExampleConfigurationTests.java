package com.commons.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commons.sample.dao.JdbcSimpleDao;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfigurationTests {
	
	@Autowired
	private JdbcSimpleDao jdbcSimpleDao;

	@Test
	public void testSimpleQuery() throws Exception {
		assertEquals(jdbcSimpleDao.getSimpleById(0).getName(), "myname0");
	}
	
	@Test
	public void testListQuery() throws Exception {
		assertEquals(2, jdbcSimpleDao.getSimples().size());
	}
	
}
