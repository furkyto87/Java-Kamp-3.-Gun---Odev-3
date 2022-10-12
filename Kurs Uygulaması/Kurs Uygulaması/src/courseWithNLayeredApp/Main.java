package courseWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import courseWithNLayeredApp.business.CourseManager;

import courseWithNLayeredApp.core.logging.DatabaseLogger;
import courseWithNLayeredApp.core.logging.FileLogger;
import courseWithNLayeredApp.core.logging.Logger;
import courseWithNLayeredApp.core.logging.MailLogger;
import courseWithNLayeredApp.dataAccess.CourseDao;
import courseWithNLayeredApp.dataAccess.HibernateCourseDao;
import courseWithNLayeredApp.dataAccess.JdbcCourseDao;
import courseWithNLayeredApp.entities.Category;
import courseWithNLayeredApp.entities.Course;
import courseWithNLayeredApp.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course(1, "Java Kursu", 1000);
		Course course2 = new Course(2, "ASP.NET Kursu", 1);
		Course course3 = new Course(3, "C# Kursu", 50);
		Course course4 = new Course(4, "Javascript Kursu", 70);
		
		List<Course> newcourse = new ArrayList<Course>();
		

		Educator educator = new Educator(1, "Engin", "Demiroğ");
		

		Category category1 = new Category(1, "Junior Level");
		Category category2 = new Category(2, "Senior Level");
		Category category3 = new Category(3, "Senior-Mid Level");
		Category category4 = new Category(4, "Expert Level");
		
		List<Category> newcategory = new ArrayList<Category>();
		

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, newcourse, newcategory);

		courseManager.add(course1, educator, category1);
		courseManager.add(course2, educator, category2);
		courseManager.add(course3, educator, category3);
		courseManager.add(course4, educator, category4);
	}
}
