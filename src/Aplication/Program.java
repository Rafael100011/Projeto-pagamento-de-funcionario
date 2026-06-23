package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;
import Entities.FuncionarioTerceirizado;
import Enumerados.FuncEnum;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcP = new ArrayList<>();
		
		
		System.out.println("Digite a quantidades de funcionários: ");
		Integer N = sc.nextInt();
		
		
		for(int i = 0; i<N; i++) {
			sc.nextLine();
			System.out.print("este é um funcionario 'PROPRIO' ou 'TERCEIROS' ? ");
			String Enums = sc.nextLine();
			
			System.out.print("Digite o nome do funcionário: ");
		
			String nome = sc.nextLine();
			
			System.out.print("Horas trabalhadas: ");
			Integer horas = sc.nextInt();
			
			System.out.print("Valor por hora trabalhada: ");
			Double valorHora = sc.nextDouble();
			if (Enums.equals("TERCEIROS")) {
				
				System.out.print("Qual o valor de despesa adicional: ");
				Double despesa = sc.nextDouble();
				
				Funcionario f = new FuncionarioTerceirizado(nome,horas,valorHora,despesa,FuncEnum.valueOf(Enums));
				funcP.add(f);
			}else {
				Funcionario f1 = new Funcionario(nome,horas,valorHora,FuncEnum.valueOf(Enums));
				funcP.add(f1);
			}
			System.out.println("____________________________________________________________");
			
		}
		
		for(Funcionario x : funcP) {
			
			System.out.println("Nome: "+x.getNome()+", Salario: "+x.salario());
		}
		
		

	}

}
