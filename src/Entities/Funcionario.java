package Entities;

import Enumerados.FuncEnum;

public class Funcionario {
	
	protected String nome;
	protected Integer hora;
	protected Double valorHora;
	protected FuncEnum funcEnuns;
	
	public Funcionario() {
	}
	
	

	public Funcionario(String nome, Integer hora, Double valorHora, FuncEnum funcEnuns) {
		this.nome = nome;
		this.hora = hora;
		this.valorHora = valorHora;
		this.funcEnuns = funcEnuns;
	}



	public FuncEnum getFuncEnuns() {
		return funcEnuns;
	}



	public void setFuncEnuns(FuncEnum funcEnuns) {
		this.funcEnuns = funcEnuns;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public Double salario() {
		return hora * valorHora;
	}
	/*
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append("Nome: "+ nome +", salario: "+ hora * valorHora);
		return sb.toString();
	}
	*/

	

}
