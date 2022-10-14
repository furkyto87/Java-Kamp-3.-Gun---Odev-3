package courseWithNLayeredApp.dataAccess.EducatorDao;

import courseWithNLayeredApp.entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
	public void add(Educator educator) {
		System.out.println(
				educator.getFirstName() + " " + educator.getLastName() + " " + "JDBC ile veritabanına eklendi.\n");
	}

}
