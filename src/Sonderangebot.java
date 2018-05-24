import org.hibernate.annotations.Entity;
import java.util.Date;

@Entity
public class Sonderangebot {

	private Long ID;

	private int kontingent = 999;

	private Date startZeit;

	private int dauer = 12;

	private float preisNachlass = 0.5f;

	private Ticket tickets;

}
