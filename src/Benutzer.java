import javax.persistence.*;

import org.hibernate.annotations.Entity;

@Entity
public class Benutzer {

	@Id
	private Long ID;

	private String vorName;

	private String nachName;

	private String eMail;

	private String passwort;

	private String smsNummer;

	private Long verbuchtePraemienMeilen;

	private Ticket tickets;

	private Reservierung[] reservierungen;

}
