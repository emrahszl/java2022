package kodlamaHomeWork.business;

import java.util.List;

import kodlamaHomeWork.core.logging.Logger;
import kodlamaHomeWork.dataAccess.CourseDao;
import kodlamaHomeWork.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		
		Course[] courses = {new Course(1, "Java", "Java ile Programlama","Engin Demiroğ",100), new Course(2, "C#", "C# ile Programlama","Engin Demiroğ",200), new Course(3,"Phyton", "Phyton ile Programlama","Engin Demiroğ",300), new Course(4, "C++","C++ ile Programlama","Engin Demiroğ",400)};
		for (Course course5 : courses) {
			if (course.getCourseName() == course5.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}else if(course.getCourseUnitPrice()<0) {
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
			}
		
		}
		
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
