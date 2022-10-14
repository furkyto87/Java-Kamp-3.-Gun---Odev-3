package courseWithNLayeredApp.business;

import java.util.List;

import courseWithNLayeredApp.core.logging.Logger;
import courseWithNLayeredApp.dataAccess.CategoryDao.CategoryDao;
import courseWithNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> newCategory;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> newCategory) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.newCategory = newCategory;
	}

	public void add(Category category) throws Exception {

		for (Category ctg: newCategory) {
			if (ctg.getCategoryName().toLowerCase() == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez !!!");
			}
		}

		categoryDao.add(category);
		newCategory.add(category);
		

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
