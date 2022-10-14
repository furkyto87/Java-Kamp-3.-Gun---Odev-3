package courseWithNLayeredApp.dataAccess.CategoryDao;

import courseWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " " + "JDBC ile veritabanına eklendi.\n");
	}
}
