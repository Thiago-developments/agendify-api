package br.com.thiagodevelopments.agendify_api.model.repository;

import br.com.thiagodevelopments.agendify_api.model.TaxaTransferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxaRepository extends JpaRepository<TaxaTransferencia, Long> {

}
