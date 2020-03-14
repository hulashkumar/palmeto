package Assessment;

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

import Assessment.Student1;

public  class StudentDaoImpl implements Student1Dao {

	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	JdbcTemplate jdbcTemplate;
	
	

	@Override
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
		
	}

	
	

}
