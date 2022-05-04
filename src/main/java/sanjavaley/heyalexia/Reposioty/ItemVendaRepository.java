package sanjavaley.heyalexia.Reposioty;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sanjavaley.heyalexia.Entity.ItemVenda;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long>{
	
	@Query(nativeQuery = true ,value = "select it.prod_id, sum(it.itv_quantidade) as soma, sum(it.itv_valor) as valor_total from item_venda it group by it.prod_id order by soma desc,valor_total desc FETCH FIRST 5 ROWS ONLY")
	ArrayList<Long> topFiveSell();
	
}
