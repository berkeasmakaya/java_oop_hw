package kodlamaIo.business;

import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Category> categories;
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void add(Category category) throws Exception {
		isCategoryNameValid(category);
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	public void delete(Category category) {
		categoryDao.delete(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	public void update(Category category) {
		categoryDao.update(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	private void isCategoryNameValid(Category category) throws Exception {
		for (Category existCategory : categories) {
			if (existCategory.getName().equals(category.getName())) {
				throw new Exception("Bu isimde bir kategori mevcut");
			}
		}
	}
}
