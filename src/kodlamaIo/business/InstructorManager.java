package kodlamaIo.business;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager {
	InstructorDao instructorDao;
	Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + instructor.getLastName());
		}
	}
	
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + instructor.getLastName());
		}
	}
	
	public void update(Instructor instructor) {
		instructorDao.update(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + instructor.getLastName());
		}
	}
}
