package br.com.avaliacaoum.agenciador;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.avaliacaoum.agenciador.connectioFactory.ConnectionFactory;

public class MotoristaDAO {
	
	private static Connection connection;
	public static int index = -1;

    public MotoristaDAO() throws SQLException {
    	try {
            this.connection = ConnectionFactory.getConnection();       
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void criaTabelaMotorista() {
        String sql = "CREATE SEQUENCE IF NOT EXISTS seq_motorista_id;" 
                    + "CREATE TABLE motorista (" 
                    + "id bigint primary key default nextval('seq_motorista_id'),"
                    + "cadastrar TIMESTAMP,"
                    + "editar TIMESTAMP,"
                    + "excluir TIMESTAMP,"
                    + "nome VARCHAR(50) NOT NULL,"
                    + "cpf VARCHAR(11) NOT NULL,"
                    + "contato VARCHAR(11) NOT NULL," 
                    + "dataNascimento TIMESTAMP NOT NULL,"
                    + "obs VARCHAR(50),"
                    + "endereco VARCHAR(50)"
                    + ");";

        try {
           PreparedStatement stmt = connection.prepareStatement(sql);

           stmt.execute();
           stmt.close(); 
        } catch (SQLException e){
               e.printStackTrace();

        } 
    }
public void insereNaTabelaMotorista(Motorista motorista) {
        String sql = "INSERT INTO motorista ("
                 + "cadastrar,"
                + "nome,"
                + "cpf,"
                + "contato,"
                + "dataNascimento,"
                + "obs,"
                + "endereco"
                + ")"
                + "VALUES(now(),?,?,?,now(),?,?)";
        try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setString(1, motorista.getNome());
               stmt.setString(2, motorista.getCpf());
               stmt.setString(3, motorista.getContato());
               //stmt.setDate(4, motorista.getDataNascimento());
               stmt.setString(4, motorista.getObs());
               stmt.setString(5,motorista.getEndereco());
               
               stmt.execute();

               ResultSet resultSet = stmt.getGeneratedKeys();

               while (resultSet.next()){
                   motorista.setId(resultSet.getLong(1));
               }

               stmt.close();


            } catch (SQLException e){
                   e.printStackTrace();

            } 
    }
public List<Motorista> listarMotorista() {
        String sql = "SELECT * FROM motorista WHERE excluir IS NULL";

        try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               ResultSet resultSet = stmt.executeQuery();

               List<Motorista> listaDeMotoristas = new ArrayList<>();

               while(resultSet.next()) {
                   Motorista motorista = new Motorista();

                   motorista.setId(resultSet.getLong("id"));
                   motorista.setCpf(resultSet.getString("cpf"));
                   motorista.setNome(resultSet.getString("nome"));
                   motorista.setObs(resultSet.getString("obs"));
                   motorista.setContato(resultSet.getString("contato"));
                   motorista.setDataNascimento(resultSet.getDate("dataNascimento"));
                   motorista.setEndereco(resultSet.getString("endereco"));


                   listaDeMotoristas.add(motorista);
               }

               return listaDeMotoristas;
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return null;
    }
public Motorista getMotoristaById(long id) {
        String sql = "SELECT * FROM motorista WHERE id = ?";

        try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, id);
               ResultSet resultSet = stmt.executeQuery();


               while(resultSet.next()) {
                   Motorista motorista = new Motorista();

                   motorista.setId(resultSet.getLong("id"));
                   motorista.setCpf(resultSet.getString("cpf"));
                   motorista.setNome(resultSet.getString("nome"));
                   motorista.setObs(resultSet.getString("obs"));
                   motorista.setContato(resultSet.getString("contato"));
                   motorista.setDataNascimento(resultSet.getDate("dataNascimento"));
                   motorista.setEndereco(resultSet.getString("endereco"));
                
                   return motorista;
               }

           } catch (SQLException e) {
               e.printStackTrace();
           }
           return null;
    }
public void editaMotorista(Motorista motorista) {
        String sql = "UPDATE motorista SET nome = ?, cpf = ?, contato = ?, dataNascimento = now(), obs = ?, endereco = ? WHERE id = ?";

        try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setString(1, motorista.getNome());
               stmt.setString(2, motorista.getCpf());
               stmt.setString(3, motorista.getContato());
               //stmt.setDate(4, motorista.getDataNascimento());
               stmt.setString(4, motorista.getObs());
               stmt.setString(5, motorista.getEndereco());
               stmt.setLong(6, motorista.getId());
               
               stmt.execute();
               stmt.close();


            } catch (SQLException e){
                   e.printStackTrace();

            } 
    }
public void removeMotorista(long id) {
        String sql = "UPDATE motorista SET excluir = now() WHERE id = ?";

        try {
               PreparedStatement stmt = connection.prepareStatement(sql);

               stmt.setLong(1, id);

               stmt.execute();
               stmt.close();


            } catch (SQLException e){
                   e.printStackTrace();

            } 
}
}
