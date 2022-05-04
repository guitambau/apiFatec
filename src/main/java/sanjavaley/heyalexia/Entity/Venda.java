package sanjavaley.heyalexia.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ENDERECO")
public class Venda {
	
	@Id
    @GeneratedValue
	@Column(name = "VENDA_ID")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID")
	private Cliente clienteId;
	
	@Column(name = "VENDA_DATA")
	private Date data;

	@ManyToOne
	@JoinColumn(name = "VENDA_PAGAMENTO_ID")	
	private TipoPagamento pagamentoId;
	
	@Column(name = "VENDA_DESCONTO")
	private float desconto;
	
	@JsonIgnore
	@OneToMany(mappedBy = "venda")
	private List<ItemVenda> itemVenda;
	
}
