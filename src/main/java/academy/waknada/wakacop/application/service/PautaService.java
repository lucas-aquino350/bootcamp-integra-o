package academy.waknada.wakacop.application.service;

import academy.waknada.wakacop.application.api.NovaPautaRequest;
import academy.waknada.wakacop.application.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPautaRequest);
}
