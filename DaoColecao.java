package Dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoColecao {
	static final String url = "jdbc:postgresql://localhost:5432/Colecionador";
	
	public void inserir(String nomecolecao, String item, String ano, String colecionador) {
		String sql = "INSERT INTO colecionador (nomecolecao, item, ano, colecionador) VALUES ('" + nomecolecao + "', '" + item + "', '" + ano + "', " + colecionador + ")";
	
		try {
			Connection conexao = DriverManager.getConnection(url, "postgres", "123");
			PreparedStatement inclusao = conexao.prepareStatement(sql);
			inclusao.execute();
		}
		catch (SQLException e) {
			//System.out.println("Nao foi possivel acessar o BD");
			System.out.println(e);
		}
	}
}