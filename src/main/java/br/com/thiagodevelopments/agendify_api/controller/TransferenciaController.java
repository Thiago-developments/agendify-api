package br.com.thiagodevelopments.agendify_api.controller;

import br.com.thiagodevelopments.agendify_api.dto.AgendamentoDTO;
import br.com.thiagodevelopments.agendify_api.model.Agendamento;
import br.com.thiagodevelopments.agendify_api.model.TaxaTransferencia;
import br.com.thiagodevelopments.agendify_api.service.TaxasService;
import br.com.thiagodevelopments.agendify_api.service.TransferenciaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transferencia")
@Tag(name = "Transferencia", description = "Conjunto de endpoints para realizar transferências ou agendamentos")
public class TransferenciaController {
    @Autowired
    TransferenciaService transferenciaService = new TransferenciaService();

    @Autowired
    private TaxasService taxasService;

    @Operation(
            summary = "Listar transferências",
            description = "Retorna uma lista com todas as transferências realizadas",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
                    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
            }
    )

    @GetMapping
    public List<Agendamento> listarTransferencias() {
        return transferenciaService.findAllTransferencia();
    }


    @Operation(
            summary = "Listar taxas",
            description = "Retorna uma lista com todas as taxas e suas condições",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
                    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
            }
    )

    @GetMapping("/taxas")
    public List<TaxaTransferencia> listarTaxas() {
        return taxasService.findAllTaxas();
    }

    @Operation(
            summary = "Cadastrar transferência",
            description = "Realiza o cadastro de um agendamento de transferência",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
                    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
            }
    )

    @PostMapping("/agendamento")
    public ResponseEntity<Object> agendamentoTransferencia(AgendamentoDTO agendamentoDTO) {
        transferenciaService.agendamento(agendamentoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoDTO);
    }
}
