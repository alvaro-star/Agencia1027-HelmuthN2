/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ConexaoBanco;
import java.sql.*;
import java.util.ArrayList;
import modelo.ContaModel;

public class ContaControle {

    private ContaModel conta;

    public ArrayList<ContaModel> getAll() throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        String sql = "SELECT * FROM `conta`";
        ResultSet resultado = statement.executeQuery(sql);

        ArrayList<ContaModel> contas = new ArrayList<>();

        while (resultado.next()) {
            ContaModel modelo = new ContaModel();
            modelo.setNumeroConta(resultado.getString("numeroConta"));
            modelo.setBairro(resultado.getString("bairro"));
            modelo.setCep(resultado.getString("cep"));
            modelo.setCidade(resultado.getString("cidade"));
            modelo.setEstado(resultado.getString("estado"));
            modelo.setNomeCliente(resultado.getString("nomeCliente"));
            modelo.setNumeroCasa(resultado.getString("numeroCasa"));
            modelo.setRua(resultado.getString("rua"));

            contas.add(modelo);
        }
        return contas;
    }

    public void insert(ContaModel dto) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        this.conta = new ContaModel(dto);
        statement.execute(this.conta.makeSqlInsert());
    }

    public ContaModel getOne(String numeroConta) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        String sql = String.format("SELECT * FROM `conta` WHERE `numeroConta` = '%s'", numeroConta);
        ResultSet resultado = statement.executeQuery(sql);

        ContaModel modelo = new ContaModel();
        while (resultado.next()) {
            modelo.setNumeroConta(resultado.getString("numeroConta"));
            modelo.setBairro(resultado.getString("bairro"));
            modelo.setCep(resultado.getString("cep"));
            modelo.setCidade(resultado.getString("cidade"));
            modelo.setEstado(resultado.getString("estado"));
            modelo.setNomeCliente(resultado.getString("nomeCliente"));
            modelo.setNumeroCasa(resultado.getString("numeroCasa"));
            modelo.setRua(resultado.getString("rua"));
        }

        return modelo;
    }

    public void update(String numeroConta, ContaModel atualizacao) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        this.conta = new ContaModel(atualizacao);
        statement.execute(this.conta.makeSqlUpdate(numeroConta));
    }

    public void deletar(String numeroConta) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        String sql = String.format("DELETE FROM conta WHERE `conta`.`numeroConta` = %s", numeroConta);
        //this.conta = new ContaModel(dto);
        statement.execute(sql);
    }

    /*public void deletar2(ContaModel agenciaDto) throws SQLException {
        Connection con = ConexaoBanco.abreConexao();

        String sql = "DELETE FROM conta WHERE `conta`.`numeroConta` = ?";
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1, 123);
        pstm.execute();

    }*/
}
