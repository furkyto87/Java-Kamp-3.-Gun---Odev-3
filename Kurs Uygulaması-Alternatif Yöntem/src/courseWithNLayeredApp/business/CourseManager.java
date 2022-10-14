package courseWithNLayeredApp.business;

import java.util.List;

import courseWithNLayeredApp.core.logging.Logger;
import courseWithNLayeredApp.dataAccess.CourseDao.CourseDao;
import courseWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> newCourse;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> newCourse) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.newCourse = newCourse;
	}

	public void add(Course course) throws Exception {
		for (Course crs : newCourse) {
			if (crs.getCourseName().toLowerCase() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez !!!");
			}
		}

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz !!!");
		}

		courseDao.add(course);
		newCourse.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}
}
