package br.com.thiagodevelopments.agendify_api.service;

import br.com.thiagodevelopments.agendify_api.model.TaxaTransferencia;
import br.com.thiagodevelopments.agendify_api.model.repository.TaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxasService {
    @Autowired
    TaxaRepository taxaRepository;

    public List<TaxaTransferencia> findAllTaxas(){

        return taxaRepository.findAll();
    }
}
