package courseWithNLayeredApp.entities;

public class Category {
	private int categoryId;
	private String categoryName;

	public Category() {

	}

	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getcategoryId() {
		return categoryId;
	}

	public void setcategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
