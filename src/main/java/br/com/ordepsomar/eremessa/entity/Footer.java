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
@Table(name = "footer")
public class Footer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "periodico_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "PERIODICO_ID_FOOTER"))
    private Periodico periodico;*/

    private Long periodico_id;

    @Column(name = "tp_registro", length = 1, nullable = false)
    private String tp_registro;

    @Column(name = "qtd_total", nullable = false, length = 10)
    private String qtd_total;

    @Column(name = "peso_total", nullable = false, length = 8)
    private String peso_total;

    @Column(name = "uni_medida", nullable = false, length = 1)
    private String uni_medida;

}
