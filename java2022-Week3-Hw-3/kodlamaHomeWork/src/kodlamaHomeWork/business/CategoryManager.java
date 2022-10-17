package kodlamaHomeWork.business;

import java.util.Iterator;
import java.util.List;

import kodlamaHomeWork.core.logging.Logger;
import kodlamaHomeWork.dataAccess.CategoryDao;
import kodlamaHomeWork.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		
		Category[] categories = {new Category(1, "Web Programlama"), new Category(2, "Mobil Programlama"), new Category(3, "Oyun Programlama"), new Category(4, "Veritabanı Programlama")};
		for (Category category5 : categories) {
			if (category.getCategoryName() == category5.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez!");
			}
		}
		
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		
	}
	}
}