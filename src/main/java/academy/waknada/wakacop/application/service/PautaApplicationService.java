package academy.waknada.wakacop.application.service;

import academy.waknada.wakacop.application.api.NovaPautaRequest;
import academy.waknada.wakacop.application.api.PautaCadastradaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPautaRequest) {
        log.info("[start] PautaApplicationService - cadastraPauta");
        log.info("[novaPauta] {}", novaPautaRequest);
        log.info("[finish] PautaApplicationService - cadastraPauta");
        return null;
    }
}