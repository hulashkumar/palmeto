package jdbcSpring;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee2 e){  
	    String query="insert into employee2 values('"+e.getEmpid()+"','"+e.getEname()+"','"+e.getDept()+"','"+e.getDesg()+"','"+e.getEmail()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(Employee2 e){  
	    String query="update employee2 set Ename='"+e.getEname()+"',Dept='"+e.getDept()+"',Desg='"+e.getDesg()+"',email='"+e.getEmail()+"' where Empid='"+e.getEmpid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee2 e){  
	    String query="delete from employee2 where Empid='"+e.getEmpid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  

}