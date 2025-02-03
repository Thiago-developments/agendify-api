package br.com.thiagodevelopments.agendify_api.service;

import br.com.thiagodevelopments.agendify_api.dto.AgendamentoDTO;
import br.com.thiagodevelopments.agendify_api.model.Agendamento;
import br.com.thiagodevelopments.agendify_api.model.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    public void agendamento(AgendamentoDTO agendamentoDTO) {
        LocalDate dtAgendamento = LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toLocalDate();

        Agendamento agendamento = new Agendamento();

        agendamento.setCdContaOrigem(agendamentoDTO.contaOrigem());
        agendamento.setCdContaDestino(agendamentoDTO.contaDestino());
        agendamento.setVlTransferencia(agendamentoDTO.vlTransferencia());
        agendamento.setDtTransferencia(agendamentoDTO.dtTransferencia());
        agendamento.setDtAgendamento(dtAgendamento);
        agendamento.setVlTaxa(new BigDecimal(1));

        Agendamento agendamentoSalvo = transferenciaRepository.save(agendamento);

        // Agora você pode usar 'agendamentoSalvo' conforme necessário
        System.out.println("Agendamento salvo com ID: " + agendamentoSalvo.getId());

    }

    private BigDecimal calcularTaxa(BigDecimal valor) {
        // Exemplo de cálculo de taxa: 1% do valor da transferência
        return valor.multiply(BigDecimal.valueOf(0.01));
    }

    public List<Agendamento> findAllTransferencia(){

        return transferenciaRepository.findAll();
    }

}
