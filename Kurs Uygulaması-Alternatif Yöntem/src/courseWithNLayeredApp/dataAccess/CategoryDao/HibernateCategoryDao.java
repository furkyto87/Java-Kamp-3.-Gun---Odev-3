package courseWithNLayeredApp.dataAccess.CategoryDao;

import courseWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " " + "Hibernate ile veritabanına eklendi.\n");

	}

}