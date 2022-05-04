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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ITEM_VENDA")
public class ItemVenda {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "itv_id")
	private long id;
	
	@Column(name = "ITV_QUANTIDADE")
	private long quantidade;
	
	@Column(name = "ITV_VALOR")
	private long valor;
	
	@ManyToOne
	@JoinColumn(name = "PROD_ID")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "VENDA_ID")
	private Venda venda;
	

	
}