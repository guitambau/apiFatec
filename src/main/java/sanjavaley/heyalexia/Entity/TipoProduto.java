package sanjavaley.heyalexia.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TIPO_PRODUTO")
public class TipoProduto {

    @Id
    @GeneratedValue
    @Column(name = "TP_ID")
    private Long id;

    @Column(name = "TP_NOME")
    private String nome;
}

	
		
	
	
	
	
	
	
