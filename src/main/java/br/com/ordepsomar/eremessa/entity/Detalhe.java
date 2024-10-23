package br.com.ordepsomar.eremessa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detalhes")
public class Detalhe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "periodico_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "PERIODICO_ID_DETALHE"))
    private Periodico periodico;

    @Column(name = "tp_registro", length = 1, nullable = false)
    private String tp_registro;

    @Column(name = "UF", length = 2, nullable = false)
    private String uf;

    @Column(name = "qtd", nullable = false)
    private int qtd;

}
