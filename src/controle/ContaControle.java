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

    public ArrayList<ContaModel> getAll() throws SQLException {

        String sql = "SELECT * FROM `conta`";

        Connection con = ConexaoBanco.abreConexao();
        PreparedStatement statement = con.prepareStatement(sql);

        ResultSet resultado = statement.executeQuery(sql);

        ArrayList<ContaModel> contas = new ArrayList<>();

        while (resultado.next()) {
            ContaModel conta = new ContaModel();
            conta.setNumeroConta(resultado.getString("numeroConta"));
            conta.setBairro(resultado.getString("bairro"));
            conta.setCep(resultado.getString("cep"));
            conta.setCidade(resultado.getString("cidade"));
            conta.setEstado(resultado.getString("estado"));
            conta.setNomeCliente(resultado.getString("nomeCliente"));
            conta.setNumeroCasa(resultado.getString("numeroCasa"));
            conta.setRua(resultado.getString("rua"));

            contas.add(conta);
        }
        return contas;
    }

    public ContaModel getOne(String numeroConta) throws SQLException {
        String sql = "SELECT * FROM `conta` WHERE `numeroConta` = ?";

        Connection con = ConexaoBanco.abreConexao();
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1, numeroConta);
        ResultSet resultado = statement.executeQuery(sql);

        ContaModel conta = new ContaModel();
        while (resultado.next()) {
            conta.setNumeroConta(resultado.getString("numeroConta"));
            conta.setBairro(resultado.getString("bairro"));
            conta.setCep(resultado.getString("cep"));
            conta.setCidade(resultado.getString("cidade"));
            conta.setEstado(resultado.getString("estado"));
            conta.setNomeCliente(resultado.getString("nomeCliente"));
            conta.setNumeroCasa(resultado.getString("numeroCasa"));
            conta.setRua(resultado.getString("rua"));
        }

        return conta;
    }

    public void update(ContaModel conta) throws SQLException {
        String sql = "UPDATE `conta` SET `nomeCliente` = ?, `rua` = ?, `bairro` = ?, `cidade` = ?, `estado` = ?, `numeroCasa` = ?, `cep` = ? WHERE `conta`.`numeroConta` = ?";

        Connection con = ConexaoBanco.abreConexao();
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1, conta.getNomeCliente());
        statement.setString(2, conta.getRua());
        statement.setString(3, conta.getBairro());
        statement.setString(4, conta.getCidade());
        statement.setString(5, conta.getEstado());
        statement.setString(6, conta.getNumeroCasa());
        statement.setString(7, conta.getCep());
        statement.setString(8, conta.getNumeroConta());

        statement.execute();

    }

    public void deletar(String numeroConta) throws SQLException {
        String sql = "DELETE FROM conta WHERE `conta`.`numeroConta` = ?";

        Connection con = ConexaoBanco.abreConexao();
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1, numeroConta);

        statement.execute();
    }

    public void insert(ContaModel conta) throws SQLException {
        String sql = "INSERT INTO `conta` (`numeroConta`, `nomeCliente`, `rua`, `bairro`, `cidade`, `estado`, `numeroCasa`, `cep`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection con = ConexaoBanco.abreConexao();
        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1, conta.getNumeroConta());
        statement.setString(2, conta.getNomeCliente());
        statement.setString(3, conta.getRua());
        statement.setString(4, conta.getBairro());
        statement.setString(5, conta.getCidade());
        statement.setString(6, conta.getEstado());
        statement.setString(7, conta.getNumeroCasa());
        statement.setString(8, conta.getCep());
        statement.execute();
    }
}
