package clinica.entidades;

public class Medico {
	private int codigoMedico;
	private Funcionario codigoFuncionario;
	private String crm;
	public int getCodigoMedico() {
		return codigoMedico;
	}
	public void setCodigoMedico(int codigoMedico) {
		this.codigoMedico = codigoMedico;
	}
	public Funcionario getCodigoPessoa() {
		return codigoFuncionario;
	}
	public void setCodigoPessoa(Funcionario codigoPessoa) {
		this.codigoFuncionario = codigoPessoa;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	

}
