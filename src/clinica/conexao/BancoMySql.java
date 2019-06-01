package clinica.conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoMySql implements BancoDeDados {
	
	private Connection connection;

    @Override
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Clinica", "postgres","postgres");
            return this.connection;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BancoMySql.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error"+ex.getMessage());
            return null;
        }
    }

    @Override
    public void desconectar(Connection connection) {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(BancoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
