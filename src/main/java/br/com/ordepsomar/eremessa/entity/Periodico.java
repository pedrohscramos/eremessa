package br.com.ordepsomar.eremessa.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "periodicos")
public class Periodico {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id")
    private UUID periodicoId;

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

    public Periodico() {}

    public Periodico(UUID periodicoId, String tp_registro, String cod_titulo, String id_periodico, String num_edicao, String tp_periodico, String peso_un, String uni_medida_un, String largura, String altura, String comprimento, String uni_medida_dim, String qtd_amarrado, String qtd_total, String qtd_extra, String legenda) {
        this.periodicoId = periodicoId;
        this.tp_registro = tp_registro;
        this.cod_titulo = cod_titulo;
        this.id_periodico = id_periodico;
        this.num_edicao = num_edicao;
        this.tp_periodico = tp_periodico;
        this.peso_un = peso_un;
        this.uni_medida_un = uni_medida_un;
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.uni_medida_dim = uni_medida_dim;
        this.qtd_amarrado = qtd_amarrado;
        this.qtd_total = qtd_total;
        this.qtd_extra = qtd_extra;
        this.legenda = legenda;
    }

    public UUID getPeriodicoId() {
        return periodicoId;
    }

    public void setPeriodicoId(UUID periodicoId) {
        this.periodicoId = periodicoId;
    }

    public String getTp_registro() {
        return tp_registro;
    }

    public void setTp_registro(String tp_registro) {
        this.tp_registro = tp_registro;
    }

    public String getCod_titulo() {
        return cod_titulo;
    }

    public void setCod_titulo(String cod_titulo) {
        this.cod_titulo = cod_titulo;
    }

    public String getId_periodico() {
        return id_periodico;
    }

    public void setId_periodico(String id_periodico) {
        this.id_periodico = id_periodico;
    }

    public String getNum_edicao() {
        return num_edicao;
    }

    public void setNum_edicao(String num_edicao) {
        this.num_edicao = num_edicao;
    }

    public String getTp_periodico() {
        return tp_periodico;
    }

    public void setTp_periodico(String tp_periodico) {
        this.tp_periodico = tp_periodico;
    }

    public String getPeso_un() {
        return peso_un;
    }

    public void setPeso_un(String peso_un) {
        this.peso_un = peso_un;
    }

    public String getUni_medida_un() {
        return uni_medida_un;
    }

    public void setUni_medida_un(String uni_medida_un) {
        this.uni_medida_un = uni_medida_un;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getUni_medida_dim() {
        return uni_medida_dim;
    }

    public void setUni_medida_dim(String uni_medida_dim) {
        this.uni_medida_dim = uni_medida_dim;
    }

    public String getQtd_amarrado() {
        return qtd_amarrado;
    }

    public void setQtd_amarrado(String qtd_amarrado) {
        this.qtd_amarrado = qtd_amarrado;
    }

    public String getQtd_total() {
        return qtd_total;
    }

    public void setQtd_total(String qtd_total) {
        this.qtd_total = qtd_total;
    }

    public String getQtd_extra() {
        return qtd_extra;
    }

    public void setQtd_extra(String qtd_extra) {
        this.qtd_extra = qtd_extra;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
}
