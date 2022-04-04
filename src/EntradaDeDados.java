import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		int idade = ler.nextInt();
		System.out.println("Idade = " + idade);
		
		System.out.println("Informe o salário: ");
		double salario = ler.nextDouble();
		System.out.println("Salário = " + salario);
	}
}
