package kodlamaHomeWork.dataAccess;

import kodlamaHomeWork.entities.Course;

public class JdbcCourseDao implements CourseDao{

	public void add(Course course){
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
