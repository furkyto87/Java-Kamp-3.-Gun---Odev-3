package courseWithNLayeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail gönderidi : " + data);
		System.out.println("\n-----------------------------------------------------------------\n");
	}

}
