package sanjavaley.heyalexia.Entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUTO")
public class Produto {
	
	@Id
    @GeneratedValue
	@Column(name = "PROD_ID")
	private long id;
	
	@Column(name = "PROD_NOME", unique=true, length = 100, nullable = false)
	private String nomeProduto;
	
	@Column(name = "PROD_VALOR", unique=false, length = 7, nullable = false)
	private long valor;
	
	@ManyToOne
    @JoinColumn(name="TP_ID")
    private TipoProduto tipoProduto;
	
	@JsonIgnore
	@OneToMany(mappedBy = "produto")
	private List<ItemVenda> itemVenda;
	
	
	
	
	
	
	

	
}
