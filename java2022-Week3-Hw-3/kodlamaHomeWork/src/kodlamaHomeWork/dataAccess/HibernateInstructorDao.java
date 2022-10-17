package kodlamaHomeWork.dataAccess;

import kodlamaHomeWork.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
