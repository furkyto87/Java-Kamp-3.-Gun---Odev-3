package courseWithNLayeredApp.dataAccess.CourseDao;

import courseWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println(course.getCourseName() + " " + "JDBC ile veritabanına eklendi.\n");
	}
}