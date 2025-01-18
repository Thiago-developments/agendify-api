package br.com.thiagodevelopments.agendify_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transferencias")
@Tag(name = "Transferencias", description = "Conjunto de endpoints para realizar transferências ou agendamentos")
public class TransferenciasController {
    @Operation(
            summary = "Listar transferências",
            description = "Retorna uma lista com todas as transferências realizadas",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Operação bem-sucedida"),
                    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
            }
    )

    @GetMapping
    public String listarTransferencias() {
        return "Listagem de transferências";
    }
}
