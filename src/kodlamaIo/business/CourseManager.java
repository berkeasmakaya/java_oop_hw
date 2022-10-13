package kodlamaIo.business;

import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	CourseDao courseDao;
	List<Course> courses;
	Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		isCourseNameValid(course);
		isCoursePriceValid(course);
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	public void delete(Course course) {
		courseDao.delete(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	public void update(Course course) {
		courseDao.update(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
	private void isCourseNameValid(Course course) throws Exception{
		for (Course existsCourse : courses) {
			if (existsCourse.getName().equals(course.getName()) && existsCourse.getName().equals(null)) {
				throw new Exception("Bu isimde bir kurs bulunmaktadır");
			}
		}
	}
	
	private void isCoursePriceValid(Course course) throws Exception {
		if (course.getPrice() < 10) {
			throw new Exception("Bir kursun fiyatı 10'dan küçük olamaz");
		}
	}

}
