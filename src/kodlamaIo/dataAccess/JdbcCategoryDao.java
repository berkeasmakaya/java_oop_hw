package kodlamaIo.dataAccess;

import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile veritabanından silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile veritabanında güncellendi");
		
	}

}
