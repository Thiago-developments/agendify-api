package br.com.thiagodevelopments.agendify_api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AgendamentoDTO(
        String contaOrigem,
        String contaDestino,
        BigDecimal vlTransferencia,
        LocalDate dtTransferencia) {}
