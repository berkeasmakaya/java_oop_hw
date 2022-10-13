package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Hibernate ile veritabanından silindi");
		
	}

	@Override
	public void update(Instructor instrucor) {
		System.out.println("Hibernate ile veritabanında güncellendi");
		
	}
	
}
