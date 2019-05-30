package clinica.conexao;

import java.sql.Connection;

public interface BancoDeDados {
	
	public Connection conectar();
    public void desconectar(Connection conn);
}
