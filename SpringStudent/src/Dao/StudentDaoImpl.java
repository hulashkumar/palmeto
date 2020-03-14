package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
//import org.springframework.jdbc.core.RowMapper;

import Data.Student1;

public  class StudentDaoImpl implements IStudentDAO {

	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Student1 student1) {
		// TODO Auto-generated method stub
		String sql="insert into student1 values('"+student1.getId()+"','"+student1.getName()+"','"+student1.getAge()+"')";
		int r=jdbcTemplate.update(sql);
		System.out.println(r+" inserted");
	}

/*	@Override
	public Student1 getStudent1() {
		// TODO Auto-generated method stub
		String sql="select * from student1";
		List<Student1>lists=jdbcTemplate.query(sql, new RowMapper<Student1>() {
			@Override
			public Student1 mapRow(ResultSet rs,int rowNum) throws SQLException{
				Student1 stu=new Student1();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				return stu;
			}
		});
			
		
		return lists;
	}*/
	
	

	/*@Override
	public List<Student1> listStudent1() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student1",new ResultSetExtractor<List<Student1>>(){
			@Override
			public List<Student1>extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Student1> list=new ArrayList<Student1>();
				while(rs.next()) {
					Student1 e=new Student1();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAge(rs.getInt(3));
					list.add(e);
					}
				return list;
			}
		});
		
	}*/

	@Override
	public int delete(Student1 s) {
		// TODO Auto-generated method stub
		String query="delete from student1 where id='"+s.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}

	@Override
	public int update(Student1 st) {
		// TODO Auto-generated method stub
		String query="update student1 set name='"+st.getName()+"',age='"+st.getAge()+"' where id='"+st.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}

	@Override
	public Student1 getStudent1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student1> listStudent1() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean saveStudentByPst(final Student1 e) {
		String query="insert into student1 values(?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setInt(3, e.getAge());
				return ps.execute();
			}
			
		});
		
	}

	

}
