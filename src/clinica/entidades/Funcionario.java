package clinica.entidades;

public class Funcionario {
	private int codigoFuncionario;
    private Pessoa codigoPessoa;
    private String login;
    private String senha;
    private boolean gerente;
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	public Pessoa getCodigoPessoa() {
		return codigoPessoa;
	}
	public void setCodigoPessoa(Pessoa codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isGerente() {
		return gerente;
	}
	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}
    
    
}
