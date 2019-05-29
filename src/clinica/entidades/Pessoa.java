package clinica.entidades;

import java.sql.Date;

public class Pessoa {
	private int codigoPessoa;
	private String nome;
	private Date dataNascimento;
	private String sexo;
	private PessoaEndereco endereco;
	private PessoaContato contato;
	private String cpf;
	private String email;
	private Funcionario funcionario;

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(int codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public PessoaEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(PessoaEndereco endereco) {
		this.endereco = endereco;
	}

	public PessoaContato getContato() {
		return contato;
	}

	public void setContato(PessoaContato contato) {
		this.contato = contato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
