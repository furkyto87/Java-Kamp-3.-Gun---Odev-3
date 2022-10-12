package courseWithNLayeredApp.business;

import java.util.List;

import courseWithNLayeredApp.core.logging.Logger;
import courseWithNLayeredApp.dataAccess.CourseDao;

import courseWithNLayeredApp.entities.Category;
import courseWithNLayeredApp.entities.Course;
import courseWithNLayeredApp.entities.Educator;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	private List<Category> categories;
	

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses, List<Category> categories) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
		this.categories = categories;
	}

	public void add(Course course, Educator educator, Category category) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz !!!");
		}

		for (Course crs : courses) {
			if (crs.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez !!!");
				
			}
		}
		
		for (Category ctg : categories) {
			if(ctg.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez !!!");
			}
		}

			courseDao.add(course, educator, category);
			courses.add(course);
			categories.add(category);


			for (Logger logger : loggers) {
				logger.log(course.getCourseName() + ", " + educator.getFirstName() + " " + educator.getLastName() + ", "
						+ category.getCategoryName());
			}
		}
	}

