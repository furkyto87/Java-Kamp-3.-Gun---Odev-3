package courseWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import courseWithNLayeredApp.business.CategoryManager;
import courseWithNLayeredApp.business.CourseManager;
import courseWithNLayeredApp.business.EducatorManager;
import courseWithNLayeredApp.core.logging.DatabaseLogger;
import courseWithNLayeredApp.core.logging.FileLogger;
import courseWithNLayeredApp.core.logging.Logger;
import courseWithNLayeredApp.core.logging.MailLogger;
import courseWithNLayeredApp.dataAccess.CategoryDao.JdbcCategoryDao;
import courseWithNLayeredApp.dataAccess.CourseDao.JdbcCourseDao;
import courseWithNLayeredApp.dataAccess.EducatorDao.HibernateEducatorDao;
import courseWithNLayeredApp.entities.Category;
import courseWithNLayeredApp.entities.Course;
import courseWithNLayeredApp.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Course course1 = new Course(1, "Java Kursu", 1000);
		Course course2 = new Course(2, "ASP.NET Kursu", 10);
		Course course3 = new Course(3, "C# Kursu", 50);
		Course course4 = new Course(4, "Javascript Kursu", 70);

		List<Course> newCourse = new ArrayList<Course>();

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, newCourse);

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);

		Educator educator1 = new Educator(1, "Engin", "Demiroğ");
		Educator educator2 = new Educator(2, "Engin", "Demiroğ");

		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);

		educatorManager.add(educator1);
		educatorManager.add(educator2);
		

		Category category1 = new Category(1, "Junior Level");
		Category category2 = new Category(2, "Senior-Mid Level");
		Category category3 = new Category(3, "Senior Level");
		Category category4 = new Category(4, "Expert Level");

		List<Category> newcategory = new ArrayList<Category>();
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, newcategory);
		
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		categoryManager.add(category4);

	}
}
