import java.util.Scanner;

import Domain.Produto;

public class Program {

	public static void main(String[] args) {
		
		//Para um protótipo de supermercado, crie um programa que leia 3 produtos e
		//imprima no console: nome, preço, quantidade e o valor total da compra. Utilize um array como
		//estrutura de dados para armazenamento dos produtos informados.
		
		Scanner sc = new Scanner(System.in);
		
		Produto[] produtos = new Produto[3];
		double valorTotal = 0;
		String nome;
		double preco;
		Integer quantidade;
		
		for(int i = 1; i <= produtos.length; i++) {
			
			System.out.println("Produto n: " + i);
			System.out.print("Digite o nome: ");
			nome = sc.next();
			
			System.out.print("Digite o preço: ");
			preco = sc.nextDouble();
			
			System.out.print("Digite a quantidade: ");
			quantidade = sc.nextInt();
			
			System.out.println();
			
			produtos[i-1] = new Produto(nome, preco, quantidade);
			
			valorTotal += quantidade * preco;
			
		}
		
		System.out.println("Valor Total da compra: R$" + valorTotal);
		
		sc.close();
	}

}
