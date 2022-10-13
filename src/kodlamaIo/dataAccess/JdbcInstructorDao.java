package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("JDBC ile veritabanından silindi");
		
	}

	@Override
	public void update(Instructor instrucor) {
		System.out.println("JDBC ile veritabanında güncellendi");
		
	}

}
