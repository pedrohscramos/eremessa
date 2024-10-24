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
@Table(name = "header")
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "periodico_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "PERIODICO_ID_HEADER"))
    private Periodico periodico_id;*/

    private Long periodico_id;

    @Column(name = "tp_registro", nullable = false)
    private Long tp_registro;

    @Column(name = "tp_arquivo", length = 1, nullable = false)
    private String tp_arquivo;

    @Column(name = "cod_editora", length = 50, nullable = false)
    private String cod_editora;

    @Column(name = "cod_admin", length = 50, nullable = false)
    private String cod_admin;



}
