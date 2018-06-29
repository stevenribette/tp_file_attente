package fileattente.modele;

import java.util.List;

import javax.persistence.*;

@Entity
public class FileAttente {

	@Id
	private Long id;
	
	@OneToMany
	@OrderBy("numero")
	private List<RendezVous> rendezVous;
	
	public Long getId() {
		return id;
	}
}
