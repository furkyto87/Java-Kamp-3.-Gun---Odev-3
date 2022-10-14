package courseWithNLayeredApp.business;

import courseWithNLayeredApp.core.logging.Logger;
import courseWithNLayeredApp.dataAccess.EducatorDao.EducatorDao;
import courseWithNLayeredApp.entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] loggers;

	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;

	}

	public void add(Educator educator) throws Exception {
		
		educatorDao.add(educator);

		for (Logger logger : loggers) {
			logger.log(educator.getFirstName() + " " + educator.getLastName());
		}
	}
}
