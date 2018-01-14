package com.yaofeng.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.yaofeng.dao.IUser;
import com.yaofeng.pojo.po.User;

@Repository
public class UserImpl extends JdbcDaoSupport implements IUser {
	
	@Autowired
	public void SetDataSource2(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	@Override
	public List<User> userlist() {
		List<User> userlist = null;
		try {
			String sql = "select * from user";
			userlist = getJdbcTemplate().query(sql,new RowMapper<User>(){
				public User mapRow(ResultSet resultSet,int i)throws SQLException{
					return mapRowHandler(resultSet);
					
				}	
			});
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return userlist;
	}

	protected User mapRowHandler(ResultSet resultSet) {
		User user = new User();
		try {
			user.setUser_id(resultSet.getInt("user_id"));
			user.setUser_name(resultSet.getString("user_name"));
			user.setUser_password(resultSet.getString("user_password"));
			user.setUser_age(resultSet.getInt("user_age"));
			user.setUser_add(resultSet.getString("user_add"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
