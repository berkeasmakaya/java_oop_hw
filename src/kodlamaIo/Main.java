package kodlamaIo;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.business.CourseManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.core.logging.MessageLogger;
import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1,"JAVA",30);
		Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new MessageLogger()};
		List<Course> courses = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1);

	}

}
