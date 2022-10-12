package courseWithNLayeredApp.dataAccess;

import courseWithNLayeredApp.entities.Category;
import courseWithNLayeredApp.entities.Course;
import courseWithNLayeredApp.entities.Educator;

public interface CourseDao {
	void add(Course course, Educator educator, Category category);
}

