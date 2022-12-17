/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 07884569116
 */
public class ContaModel {

    //Chave estrangeira
    private String numeroConta = "";
    private String nomeCliente = "";
    private String rua = "";
    private String bairro = "";
    private String cidade = "";
    private String estado = "";
    private String numeroCasa = "";
    private String cep = "";

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void imprimir() {
        System.out.println("N conta: " + this.numeroConta);
        System.out.println("Nome Clinete: " + this.nomeCliente);
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("NCasa: " + this.numeroCasa);
        System.out.println("Cep: " + this.cep);
    }

}
