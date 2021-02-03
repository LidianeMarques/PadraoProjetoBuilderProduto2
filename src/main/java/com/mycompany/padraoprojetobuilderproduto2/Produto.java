/*
 * Considere que temos uma classe Produto com os seguintes atributos:

long id*
String codigoEan //código de barras
String descricao*
String marca*
String modelo
double preco*
LocalDate dataCadastro*
LocalDate dataUltimaAtualizacao
int estoque
String categoria*
String urlFoto
A classe possui os seguintes requisitos:

Os atributos em * são obrigatórios
Não pode ser informado um modelo se não for informada a marca
O preço deve ser maior que zero
A data de cadastro não pode ser alterada e deve ser definida por padrão com a data atual
A data da última atualização não pode ser anterior a data de cadastro
O estoque padrão deve ser zero e não pode ser atribuído valor negativo
Nenhum dos atributos String pode ser null
 */
package com.mycompany.padraoprojetobuilderproduto2;

import java.time.LocalDate;
import org.immutables.builder.Builder;

/**
 *
 * @author Lidiane
 */
public class Produto {

    /**
     * @param dataCadastro the dataCadastro to set
     */
    protected void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    private long id;
    private String codigoEan;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro = LocalDate.now(); // A data de cadastro não pode ser alterada e deve ser definida por padrão com a data atual
    private LocalDate dataUltimaAtualizacao;
    private int estoque = 0;
    private String categoria;
    private String urlFoto;

    @Builder.Constructor
    public Produto(long id, String codigoEan, String descricao, String marca, String modelo, double preco, LocalDate dataUltimaAtualizacao, String categoria, String urlFoto, int estoque) throws Exception {
        this.id = id;
        if (id == 0) {
            throw new Exception("Id é obrigatório, não pode ser 0!");
        }
        
        this.codigoEan = codigoEan;
        if (codigoEan == null || codigoEan.equals("")) {
            throw new NullPointerException("CodigoEan não pode ser nulo ou vazio ");
        }
        
        this.descricao = descricao;
        if (descricao == null) {
            throw new NullPointerException("Descrição não pode ser nulo ou vazio");
        }
        if (descricao.equals("")) {
            throw new Exception("Descricao é obrigatório!");

        }
        
        this.marca = marca;
        if (marca == null) {
            throw new NullPointerException("Marca não pode ser nulo ou vazio");
        }
        if (marca.equals("")) {
            throw new Exception("Marca é obrigatório!");
        }
        
        this.modelo = modelo;
        if (modelo == null || modelo.equals("")) {
            throw new NullPointerException("Modelo não pode ser nulo ou vazio");
        }
        //modelo != null || !modelo.equals("")) && (marca == null || marca.equals("")
        if ((modelo != null || !modelo.equals("")) && (marca == null || marca.equals(""))) {
            throw new Exception("A maraca deve ser informada primeiro!");
        }
        
        this.preco = preco;
        if (preco <= 0) {
            throw new Exception("Preco é obrigatório e não pode ser menor ou igual a zero!");
        }
        
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        if (dataUltimaAtualizacao.isBefore(getDataCadastro())) {
            throw new Exception("A data da última atualização não pode ser anterior a data de cadastro!");
        }
        
        this.estoque = estoque;
        if (estoque < 0) {
            throw new Exception("O estoque não pode ser atribuído valor negativo!");
        }
        
        this.categoria = categoria;
        if (categoria == null) {
            throw new NullPointerException("Categoria não pode ser nulo ou vazio");
        }
        if (categoria.equals("")) {
            throw new Exception("Categoria é obrigatório!");
        }
        
        this.urlFoto = urlFoto;
        if (urlFoto == null || urlFoto.equals("")) {
            throw new NullPointerException("urlFoto não pode ser nulo ou vazio");
        }
    }

    /**
     * @return the id
     */
    protected long getId() {
        return id;
    }

    

    /**
     * @param id the id to set
     * @throws java.lang.Exception
     */
    protected void setId(long id) throws Exception {
        if (id == 0) {
            throw new Exception("Id é obrigatório!");
        }
        this.id = id;
    }

    /**
     * @return the codigoEan
     */
    protected String getCodigoEan() {
        return codigoEan;
    }

    /**
     * @param codigoEan the codigoEan to set
     */
    protected void setCodigoEan(String codigoEan) {
        if (codigoEan == null || codigoEan.equals("")) {
            throw new NullPointerException("CodigoEan não pode ser nulo ou vazio ");
        }
        this.codigoEan = codigoEan;
    }

    /**
     * @return the descricao
     */
    protected String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     * @throws java.lang.Exception
     */
    protected void setDescricao(String descricao) throws Exception {
        if (descricao == null) {
            throw new NullPointerException("Descrição não pode ser nulo ou vazio");
        }
        if (descricao.equals("")) {
            throw new Exception("Descricao é obrigatório!");

        }
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    protected String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     * @throws java.lang.Exception
     */
    protected void setMarca(String marca) throws Exception {
        if (marca == null) {
            throw new NullPointerException("Marca não pode ser nulo ou vazio");
        }
        if (marca.equals("")) {
            throw new Exception("Marca é obrigatório!");
        }
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    protected String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     * @throws java.lang.Exception
     */
    protected void setModelo(String modelo) throws Exception {
        if (modelo == null || modelo.equals("")) {
            throw new NullPointerException("Modelo não pode ser nulo ou vazio");
        }
        //modelo != null || !modelo.equals("")) && (marca == null || marca.equals("")
        if ((modelo != null || !modelo.equals("")) && (marca == null || marca.equals(""))) {
            throw new Exception("A maraca deve ser informada primeiro!");
        }
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    protected double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     * @throws java.lang.Exception
     */
    protected void setPreco(double preco) throws Exception {
        if (preco <= 0) {
            throw new Exception("Preco é obrigatório e não pode ser menor ou igual a zero!");
        }
        this.preco = preco;
    }

    /**
     * @return the dataCadastro
     */
    protected LocalDate getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @return the dataUltimaAtualizacao
     */
    protected LocalDate setDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    /**
     * @param dataUltimaAtualizacao the dataUltimaAtualizacao to set
     * @throws java.lang.Exception
     */
    protected void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) throws Exception {
        //A data da última atualização não pode ser anterior a data de cadastro
        if (dataUltimaAtualizacao.isBefore(getDataCadastro())) {
            throw new Exception("A data da última atualização não pode ser anterior a data de cadastro!");
        }
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    /**
     * @return the estoque
     */
    protected int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     * @throws java.lang.Exception
     */
    protected void setEstoque(int estoque) throws Exception {
        if (estoque < 0) {
            throw new Exception("O estoque não pode ser atribuído valor negativo!");
        }
        this.estoque = estoque;
    }

    /**
     * @return the categoria
     */
    protected String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     * @throws java.lang.Exception
     */
    protected void setCategoria(String categoria) throws Exception {
        if (categoria == null) {
            throw new NullPointerException("Categoria não pode ser nulo ou vazio");
        }
        if (categoria.equals("")) {
            throw new Exception("Categoria é obrigatório!");
        }
        
        this.categoria = categoria;
        if (urlFoto == null || urlFoto.equals("")) {
            throw new NullPointerException("urlFoto não pode ser nulo ou vazio");
        }
    }

    /**
     * @return the urlFoto
     */
    protected String getUrlFoto() {
        return urlFoto;
    }

    /**
     * @param urlFoto the urlFoto to set
     */
    protected void setUrlFoto(String urlFoto) {
        if (urlFoto == null || urlFoto.equals("")) {
            throw new NullPointerException("urlFoto não pode ser nulo ou vazio");
        }
        this.urlFoto = urlFoto;
    }

}
