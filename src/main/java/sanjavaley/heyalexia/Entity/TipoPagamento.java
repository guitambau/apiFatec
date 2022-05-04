package sanjavaley.heyalexia.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="TIPO_PAGAMENTO")
public class TipoPagamento {
	
	
	@Id
    @GeneratedValue
	@Column(name = "TIPO_PAG_ID")
	private long id;
	
	@Column(name = "TIPO_PAG_NOME", length = 100, nullable = false)
	private String tipoPagamentoNome;

}
