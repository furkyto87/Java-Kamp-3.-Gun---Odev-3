package courseWithNLayeredApp.dataAccess;

import courseWithNLayeredApp.entities.Category;
import courseWithNLayeredApp.entities.Course;
import courseWithNLayeredApp.entities.Educator;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course, Educator educator, Category category) {
		System.out.println(course.getCourseName() + " " + "Hibernate ile veritabanına eklendi.");
		System.out.println(educator.getFirstName() + " " + educator.getLastName() + " " + "Hibernate ile veritabanına eklendi.");
		System.out.println(category.getCategoryName() + " " + "Hibernate ile veritabanına eklendi.\n");
	}

}