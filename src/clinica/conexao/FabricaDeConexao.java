package clinica.conexao;

public class FabricaDeConexao {

	public FabricaDeConexao() {

	}

	public BancoDeDados getDatabase(String nome) {
		if (nome.equals("postgresql")) {
			return new BancoPostgres();
		} else if (nome.equals("mysql")) {
			return new BancoMySql();
		} else if (nome.equals("SqlServer")) {
			return new BancoSqlServer();
		}
		return null;
	}

	public static void main(String[] args) {

	}

}
