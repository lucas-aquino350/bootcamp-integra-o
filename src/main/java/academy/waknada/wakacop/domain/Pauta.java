package academy.waknada.wakacop.domain;

import lombok.Generated;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
public class Pauta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID id;
    private String titulo;
    private String descricao;
    private UUID idAssociadoAutor;
    private LocalDateTime dataCriacao;

}
