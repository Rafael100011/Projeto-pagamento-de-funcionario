package Entities;

import Enumerados.FuncEnum;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double despesaAdicional;

	public FuncionarioTerceirizado(String nome, Integer hora, Double valorHora,Double despesaAdicional,FuncEnum funcEnuns) {
		super(nome, hora, valorHora,funcEnuns);
		this.despesaAdicional = despesaAdicional;
	}
	
	public Double valorAdicional() {
		return despesaAdicional * 1.10;
	}
	@Override
	public Double salario() {
		return hora * valorHora + valorAdicional() ;
	}
	
	
	/*
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append("Nome: "+nome +", salario: "+ hora * valorHora + despesaAdicional * 1.10);
		return sb.toString();
	}
	*/

}
