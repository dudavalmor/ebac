package br.com.edvalmor;

/**
 * @author Eduarda
 */

public class Aluno {
	
	//Aqui estão os atributos
	
	private String nome;
	private String matricula;
	private String curso;
	private int idade;
	
	//aqui estão os métodos getters e setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
