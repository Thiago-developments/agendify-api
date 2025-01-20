package br.com.thiagodevelopments.agendify_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "ID_AGENDAMENTO")
    private Long id;

    @Column(name = "CD_CONTA_ORIGEM")
    private String cdContaOrigem;

    @Column(name = "CD_CONTA_DESTINO")
    private String cdContaDestino;

    @Column(name = "VL_TRANSFERENCIA")
    private BigDecimal vlTransferencia;

    @Column(name = "VL_TAXA")
    private BigDecimal vlTaxa;

    @Column(name = "DT_AGENDAMENTO")
    private LocalDate dtAgendamento;

    @Column(name = "DT_TRANSFERENCIA")
    private LocalDate dtTransferencia;
}
