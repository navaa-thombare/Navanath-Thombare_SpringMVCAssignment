package com.gl.fsd.gl_fsd_mvc_assign.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.gl.fsd.gl_fsd_mvc_assign.bean.Student;

public class StudentDao {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save(Student student) {
		String sql ="insert into student values("+student.getStudentId()+",'"+student.getName()+"','"+student.getDepartment()+"','"+student.getCountry()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public List<Student> getStudents(){
		return jdbcTemplate.query("select * from student", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs,int row) throws SQLException{
				Student stud = new Student();
				stud.setStudentId(rs.getInt(1));
				stud.setName(rs.getString(2));
				stud.setDepartment(rs.getString(3));
				stud.setCountry(rs.getString(4));
				return stud;
			}
		});
	}
	
	

}
