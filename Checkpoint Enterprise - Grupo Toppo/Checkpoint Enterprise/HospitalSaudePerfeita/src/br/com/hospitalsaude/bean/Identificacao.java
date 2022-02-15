package br.com.hospitalsaude.bean;


public class Identificacao {


	private String nome;
	private String telefone;
	private String cargo;
	private int matricula;
	private String endereco;
	private int numero;
	private String cpf;
	private int idade;
	private Genero genero;
	private CadastroGeral cadastrogeral;
	private Setores setores;

	
	public Identificacao(String nome, String telefone, String cargo, int matricula, String endereco, int numero,
			String cpf, int idade) {

		this.nome = nome;
		this.telefone = telefone;
		this.cargo = cargo;
		this.matricula = matricula;
		this.endereco = endereco;
		this.numero = numero;
		this.cpf = cpf;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public CadastroGeral getCadastrogeral() {
		return cadastrogeral;
	}

	public void setCadastrogeral(CadastroGeral cadastrogeral) {
		this.cadastrogeral = cadastrogeral;
	}

	public Setores getSetores() {
		return setores;
	}

	public void setSetores(Setores setores) {
		this.setores = setores;
	}

}
