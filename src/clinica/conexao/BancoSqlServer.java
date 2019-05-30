package clinica.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoSqlServer implements BancoDeDados  {
	
	private Connection connection;

    @Override
    public Connection conectar() {
String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=NomeDoBANCO";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					
			connection = DriverManager.getConnection(connectionUrl,"Josemar","123456");
			System.out.println("conectou");
					return this.connection;
					
		}catch(SQLException ex){
			/*JOptionPane.showMessageDialog(null, ex.getMessage());
			System.out.println(ex.getMessage());
			System.out.println(ex.getSQLState());
			System.out.println(ex.getErrorCode());*/
		}catch(Exception e) {
			/*JOptionPane.showMessageDialog(null, e.getMessage());
			System.out.println("Não conectou" + e);*/
		}
		return null;
		
    }

    @Override
    public void desconectar(Connection connection) {
      
    }
    
}



