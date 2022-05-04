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
@Table(name="BAIRRO")
public class Bairro {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BAIRRO_ID")
	 private long id;
	
	 @Column(name="BAIRRO_NOME")
	 private String Nome;
	 
	 @ManyToOne
	 @JoinColumn(name="CIDADE_ID")
	 private Cidade cidadeId;

}
