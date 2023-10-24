package academy.waknada.wakacop.domain;

import academy.waknada.wakacop.application.api.NovaPautaRequest;
import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor( access = AccessLevel.PRIVATE)
public class Pauta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID id;
    private String titulo;
    private String descricao;
    private UUID idAssociadoAutor;
    private LocalDateTime dataCriacao;

    public Pauta(NovaPautaRequest pautaRequest) {
        this.titulo = pautaRequest.getTitulo();
        this.descricao = pautaRequest.getDescricao();
        this.idAssociadoAutor = pautaRequest.getIdAssociadoAutor();
        this.dataCriacao  = LocalDateTime.now();
    }
}
