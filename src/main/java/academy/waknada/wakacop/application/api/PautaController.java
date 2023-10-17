package academy.waknada.wakacop.application.api;

import academy.waknada.wakacop.application.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class PautaController implements PautaApi{

    private final PautaService pautaService;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPautaRequest) {
        log.info("[start] PautaController - cadastraPauta");
        PautaCadastradaResponse pautaCadastrada = pautaService.cadastraPauta(novaPautaRequest);
        log.info("[finish] PautaController - cadastraPauta");
        return pautaCadastrada;
    }
}
