package sanjavaley.heyalexia.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="CIDADE")
public class Cidade {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CIDADE_ID")
	 private long id;
	
	 @Column(name="CIDADE_NOME")
	 private String Nome;
	 
	 @ManyToOne
	    @JoinColumn(name="EST_ID")
	    private Estado estadoId;
}
