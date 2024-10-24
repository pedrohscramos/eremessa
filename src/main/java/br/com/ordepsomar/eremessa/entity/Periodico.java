package br.com.ordepsomar.eremessa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "periodicos")
public class Periodico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    /*
    @OneToOne(mappedBy = "periodico")
    private Detalhe detalhe;
    */

    @Column(nullable = false, length = 1)
    private String tp_registro;

    @Column(nullable = false, length = 10)
    private String cod_titulo;

    @Column(nullable = false, length = 5)
    private String id_periodico;

    @Column(nullable = false, length = 10)
    private String num_edicao;

    @Column(nullable = false, length = 4)
    private String tp_periodico;

    @Column(nullable = false, length = 8)
    private String peso_un;

    @Column(nullable = false, length = 1)
    private String uni_medida_un;

    @Column(nullable = false, length = 8)
    private String largura;

    @Column(nullable = false, length = 8)
    private String altura;

    @Column(nullable = false, length = 8)
    private String comprimento;

    @Column(nullable = false, length = 1)
    private String uni_medida_dim;

    @Column(nullable = true, length = 4)
    private String qtd_amarrado;

    @Column(nullable = false, length = 10)
    private String qtd_total;

    @Column(nullable = true, length = 10)
    private String qtd_extra;

    @Column(nullable = true, length = 50)
    private String legenda;


}
