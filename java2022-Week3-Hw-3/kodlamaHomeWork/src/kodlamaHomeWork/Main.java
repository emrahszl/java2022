package kodlamaHomeWork;

import java.util.List;

import kodlamaHomeWork.business.CategoryManager;
import kodlamaHomeWork.business.CourseManager;
import kodlamaHomeWork.business.InstructorManager;
import kodlamaHomeWork.core.logging.DatabaseLogger;
import kodlamaHomeWork.core.logging.FileLogger;
import kodlamaHomeWork.core.logging.Logger;
import kodlamaHomeWork.core.logging.MailLogger;
import kodlamaHomeWork.dataAccess.HibernateCategoryDao;
import kodlamaHomeWork.dataAccess.HibernateCourseDao;
import kodlamaHomeWork.dataAccess.HibernateInstructorDao;
import kodlamaHomeWork.dataAccess.JdbcCourseDao;
import kodlamaHomeWork.entities.Category;
import kodlamaHomeWork.entities.Course;
import kodlamaHomeWork.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};
		
		Category category1 = new Category(111, "Robotik Kodlama");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		
		Course course1 = new Course(222,"Flutter","Flutter Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.","Engin Demiroğ",500 );
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		
		
		Instructor instructor1 = new Instructor(333,"Engin","Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
	}
}
