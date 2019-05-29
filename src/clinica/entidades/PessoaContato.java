package clinica.entidades;

public class PessoaContato {
	private int codigoPessoaContato;
	private String DDD;
	private String contato;
	private Funcionario funcionario;
	public int getCodigoPessoaContato() {
		return codigoPessoaContato;
	}
	public void setCodigoPessoaContato(int codigoPessoaContato) {
		this.codigoPessoaContato = codigoPessoaContato;
	}
	public String getDDD() {
		return DDD;
	}
	public void setDDD(String dDD) {
		DDD = dDD;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
