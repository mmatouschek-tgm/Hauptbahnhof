import java.util.Date;
import org.hibernate.annotations.Entity;

@Entity
public class Zeitkarte extends Ticket {

	private Date gueltigAb;

	private ZeitkartenTyp typ;

}
