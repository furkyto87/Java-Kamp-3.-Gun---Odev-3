package courseWithNLayeredApp.dataAccess;


import courseWithNLayeredApp.entities.Category;
import courseWithNLayeredApp.entities.Course;
import courseWithNLayeredApp.entities.Educator;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course, Educator educator, Category category) {
		System.out.println(course.getCourseName() + " " + "JDBC ile veritabanına eklendi.");
		System.out.println(educator.getFirstName() + " " + educator.getLastName() + " " + "JDBC ile veritabanına eklendi.");
		System.out.println(category.getCategoryName() + " " + "JDBC ile veritabanına eklendi.\n");
	}


}
 