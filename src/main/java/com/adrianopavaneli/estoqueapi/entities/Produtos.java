package com.adrianopavaneli.estoqueapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity 
public class Produtos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String unid;
    @Column(nullable = false)
    private Integer qtd;
    @Column(nullable = false)
    private double valCompra;
    @Column(nullable = false)
    private double valVenda;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getUnid() {
        return unid;
    }
    public void setUnid(String unid) {
        this.unid = unid;
    }
    public Integer getQtd() {
        return qtd;
    }
    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
    public double getValCompra() {
        return valCompra;
    }
    public void setValCompra(double valCompra) {
        this.valCompra = valCompra;
    }
    public double getValVenda() {
        return valVenda;
    }
    public void setValVenda(double valVenda) {
        this.valVenda = valVenda;
    }

    
    
}
