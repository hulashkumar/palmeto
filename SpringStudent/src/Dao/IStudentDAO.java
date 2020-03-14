package Dao;

import java.util.List;

import Data.Student1;

public interface IStudentDAO {
	//JdbcTemplate JdbcTemplate;
	public  void create(Student1 student1);
		/*This is the method to be used to list down a record from the Student table corresponding
		 to passed a student id*/
		 
	
	public Student1 getStudent1(); 
		/*This is the method to be used to ist down all the records from the Student table.*/
	
	public List<Student1>listStudent1();
		/*This is the method to be uswd to delete a record from the Student table*/
	
	public int delete(Student1 s);
	//This method will update 
	public int update(Student1 student1);

	public boolean saveStudentByPst(final Student1 e);
	
}
