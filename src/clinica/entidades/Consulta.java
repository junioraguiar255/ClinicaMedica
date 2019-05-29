package clinica.entidades;

import java.sql.Date;

public class Consulta {
	private int codigoConsulta;
	private Date dataConsulta;
	private Paciente paciente;
	private Medico medico;
	private SituacaoConsulta situacao;
	private Funcionario funcionario;
	public int getCodigoConsulta() {
		return codigoConsulta;
	}
	public void setCodigoConsulta(int codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public SituacaoConsulta getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoConsulta situacao) {
		this.situacao = situacao;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
