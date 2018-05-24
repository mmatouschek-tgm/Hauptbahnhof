import java.util.Date;
import org.hibernate.annotations.Entity;

@Entity
public class Zug {

	private Long ID;

	private Date startZeit;

	private int sitzPlaetze = 500;

	private int fahrradStellplaetze = 50;

	private int rollStuhlPlaetze = 10;

	private Bahnhof start;

	private Bahnhof ende;

}
