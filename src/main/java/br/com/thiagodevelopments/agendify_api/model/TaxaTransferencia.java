package br.com.thiagodevelopments.agendify_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TAXA_TRANSFERENCIA")
public class TaxaTransferencia {
    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "ID_TAXA")
    private Long id;

    @Column(name = "DIA_INICIO")
    private Integer diaInicio;

    @Column(name = "DIA_FIM")
    private Integer diaFim;

    @Column(name = "VL_FIXO")
    private BigDecimal vlFixo;

    @Column(name = "VL_PERCENTUAL")
    private Float vlPercentual;

}
