package courseWithNLayeredApp.dataAccess.EducatorDao;

import courseWithNLayeredApp.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {
	public void add(Educator educator) {
		System.out.println(
				educator.getFirstName() + " " + educator.getLastName() + " " + "Hibernate ile veritabanına eklendi.\n");
	}

}