package courseWithNLayeredApp.dataAccess.CourseDao;

import courseWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println(course.getCourseName() + " " + "Hibernate ile veritabanına eklendi.\n");

	}
}