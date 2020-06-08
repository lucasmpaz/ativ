package cadpe;

import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o nome:");
		String nome = ler.nextLine();

		System.out.println("Digite a idade:");
		String idade = ler.nextLine();

		System.out.println(nome);
		System.out.println(idade);
	}

}
