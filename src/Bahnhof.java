import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Entity;

@Entity
public class Bahnhof {

	@Id
	@GeneratedValue
	private Long ID;

	@Size(min=2, max=150)
	private String name;

	
	private int absPreisEntfernung;

	private int absKmEntfernung;

	private int absZeitEntfernung;

	private boolean kopfBahnhof;
	
	public Bahnhof(String name, int absPreisEntfernung, int absKmEntfernung, int absZeitEntfernung, boolean kopfBahnhhof) {
		
		this.name = name;
		this.absPreisEntfernung = absPreisEntfernung;
		this.absKmEntfernung = absKmEntfernung;
		this.absZeitEntfernung = absZeitEntfernung;
		this.kopfBahnhof = kopfBahnhhof;
		
	}
}
