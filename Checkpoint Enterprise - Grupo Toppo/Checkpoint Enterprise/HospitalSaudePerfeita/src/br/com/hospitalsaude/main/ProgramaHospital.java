package br.com.hospitalsaude.main;
import br.com.hospitalsaude.bean.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProgramaHospital {

	public static void main(String[] args) {

		System.out.println("Olá, seja bem vindo ao Programa do Hospital Saúde Perfeita!");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Data e hora local:");
		Calendar atual = Calendar.getInstance();

		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		System.out.println(formatador.format(atual.getTime()));

		System.out.println("-----------------------------------------------------------");
		System.out.println("------------------Cadastro---------------------------------");

		Identificacao identificacao1 = new Identificacao("José Silva", "(11)3003-1000", "Médico", 23350,
				"Avenida das Oliveiras", 25, "450.005.789-12", 35);

		identificacao1.setSetores(Setores.MEDICINA);

		if (identificacao1.getSetores().equals(Setores.MEDICINA)) {
			System.out.println("Setor:" + identificacao1.getSetores());
		}

		System.out.println("Nome: " + identificacao1.getNome());
		System.out.println("Telefone: " + identificacao1.getTelefone());
		System.out.println("Cargo: " + identificacao1.getCargo());
		System.out.println("Matricula: " + identificacao1.getMatricula());
		System.out.println("Endereço: " + identificacao1.getEndereco());
		System.out.println("Número: " + identificacao1.getNumero());
		System.out.println("Cpf: " + identificacao1.getCpf());
		System.out.println("Idade: " + identificacao1.getIdade());

		identificacao1.setGenero(Genero.MASCULINO);

		if (identificacao1.getGenero().equals(Genero.MASCULINO)) {
			System.out.println("Genero:" + identificacao1.getGenero());
		}

		identificacao1.setCadastrogeral(CadastroGeral.FUNCIONARIO);

		if (identificacao1.getCadastrogeral().equals(CadastroGeral.FUNCIONARIO)) {
			System.out.println("Ok, cadastro criado como funcionário!");
		}
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println(formatador.format(atual.getTime()));
		System.out.println("");
		Identificacao identificacao2 = new Identificacao("Mayara Alves", "(11)8899-0000", "Auxiliar Administrativo", 44450,
				"Rua das Andorinhas", 41, "339.478.250.03", 22);

		identificacao2.setSetores(Setores.ADMINISTRATIVO);

		if (identificacao2.getSetores().equals(Setores.ADMINISTRATIVO)) {
			System.out.println("Setor:" + identificacao2.getSetores());
		}

		System.out.println("Nome: " + identificacao2.getNome());
		System.out.println("Telefone: " + identificacao2.getTelefone());
		System.out.println("Cargo: " + identificacao2.getCargo());
		System.out.println("Matricula: " + identificacao2.getMatricula());
		System.out.println("Endereço: " + identificacao2.getEndereco());
		System.out.println("Número: " + identificacao2.getNumero());
		System.out.println("Cpf: " + identificacao2.getCpf());
		System.out.println("Idade: " + identificacao2.getIdade());

		identificacao2.setGenero(Genero.FEMININO);

		if (identificacao2.getGenero().equals(Genero.FEMININO)) {
			System.out.println("Genero:" + identificacao2.getGenero());
		}

		identificacao2.setCadastrogeral(CadastroGeral.FUNCIONARIO);

		if (identificacao2.getCadastrogeral().equals(CadastroGeral.FUNCIONARIO)) {
			System.out.println("Ok, cadastro criado como funcionário!");
		}
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println(formatador.format(atual.getTime()));
		System.out.println("");
		Identificacao identificacao3 = new Identificacao("Luciano Medeiros", "(11)6531-4556", "Auxiliar de Serviços Gerais", 11111,
				"Rua Antonio Carlos Silva", 7, "779.651.365.18", 37);

		identificacao3.setSetores(Setores.MEIOAMBIENTE);

		if (identificacao3.getSetores().equals(Setores.MEIOAMBIENTE)) {
			System.out.println("Setor:" + identificacao3.getSetores());
		}

		System.out.println("Nome: " + identificacao3.getNome());
		System.out.println("Telefone: " + identificacao3.getTelefone());
		System.out.println("Cargo: " + identificacao3.getCargo());
		System.out.println("Matricula: " + identificacao3.getMatricula());
		System.out.println("Endereço: " + identificacao3.getEndereco());
		System.out.println("Número: " + identificacao3.getNumero());
		System.out.println("Cpf: " + identificacao3.getCpf());
		System.out.println("Idade: " + identificacao3.getIdade());

		identificacao3.setGenero(Genero.MASCULINO);

		if (identificacao3.getGenero().equals(Genero.MASCULINO)) {
			System.out.println("Genero:" + identificacao3.getGenero());
		}

		identificacao3.setCadastrogeral(CadastroGeral.FUNCIONARIO);

		if (identificacao3.getCadastrogeral().equals(CadastroGeral.FUNCIONARIO)) {
			System.out.println("Ok, cadastro criado como funcionário!");
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println(formatador.format(atual.getTime()));
		
		Identificacao identificacao4 = new Identificacao("Magda Santos", "(11)7556-4701", "Sem efeito", 0,
				"Avenida Santo Amaro", 10, "554.364.154.63", 50);

		identificacao4.setSetores(Setores.ADMINISTRATIVO);

		if (identificacao4.getSetores().equals(Setores.ADMINISTRATIVO)) {
			System.out.println("Setor:" + identificacao4.getSetores());
		}

		System.out.println("Nome: " + identificacao4.getNome());
		System.out.println("Telefone: " + identificacao4.getTelefone());
		System.out.println("Cargo: " + identificacao4.getCargo());
		System.out.println("Matricula: " + identificacao4.getMatricula());
		System.out.println("Endereço: " + identificacao4.getEndereco());
		System.out.println("Número: " + identificacao4.getNumero());
		System.out.println("Cpf: " + identificacao4.getCpf());
		System.out.println("Idade: " + identificacao4.getIdade());

		identificacao4.setGenero(Genero.FEMININO);

		if (identificacao4.getGenero().equals(Genero.FEMININO)) {
			System.out.println("Genero:" + identificacao4.getGenero());
		}

		identificacao4.setCadastrogeral(CadastroGeral.PACIENTE);

		if (identificacao4.getCadastrogeral().equals(CadastroGeral.PACIENTE)) {
			System.out.println("Ok, cadastro criado como paciente!");
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println(formatador.format(atual.getTime()));
		
		Identificacao identificacao5 = new Identificacao("Pedro Ramirez", "(11)4465-9634", "Diretor do Setor de Meio Ambiente", 10100,
				"Rua dos Mercantes", 56, "369.777.654.13", 62);

		identificacao5.setSetores(Setores.DIRETORIA);

		if (identificacao5.getSetores().equals(Setores.DIRETORIA)) {
			System.out.println("Setor:" + identificacao5.getSetores());
		}

		System.out.println("Nome: " + identificacao5.getNome());
		System.out.println("Telefone: " + identificacao5.getTelefone());
		System.out.println("Cargo: " + identificacao5.getCargo());
		System.out.println("Matricula: " + identificacao5.getMatricula());
		System.out.println("Endereço: " + identificacao5.getEndereco());
		System.out.println("Número: " + identificacao5.getNumero());
		System.out.println("Cpf: " + identificacao5.getCpf());
		System.out.println("Idade: " + identificacao5.getIdade());

		identificacao5.setGenero(Genero.MASCULINO);

		if (identificacao5.getGenero().equals(Genero.MASCULINO)) {
			System.out.println("Genero:" + identificacao5.getGenero());
		}

		identificacao5.setCadastrogeral(CadastroGeral.FUNCIONARIO);

		if (identificacao5.getCadastrogeral().equals(CadastroGeral.FUNCIONARIO)) {
			System.out.println("Ok, cadastro criado como Funcionário!");
		}
		
		
	}
}
