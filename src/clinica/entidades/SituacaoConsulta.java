package clinica.entidades;

public class SituacaoConsulta {
	private int codigoStatus;
	private String descricao;
	private Funcionario funcionario;

	public int getCodigoStatus() {
		return codigoStatus;
	}

	public void setCodigoStatus(int codigoStatus) {
		this.codigoStatus = codigoStatus;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
