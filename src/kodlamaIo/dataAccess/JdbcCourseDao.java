package kodlamaIo.dataAccess;

import kodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC ile veritabanından silindi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC ile veritabanında güncellendi");
		
	}

}
