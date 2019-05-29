package clinica.entidades;

public class PessoaEndereco {
	private int codigoPessoaEndereco;
	private String bairro;
	private String rua;
	private Cidade cidade;
	private Funcionario funcionario;
	public int getCodigoPessoaEndereco() {
		return codigoPessoaEndereco;
	}
	public void setCodigoPessoaEndereco(int codigoPessoaEndereco) {
		this.codigoPessoaEndereco = codigoPessoaEndereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	

}
