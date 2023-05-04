package br.edu.faeterj;
import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		ArrayList<produto> lproduto = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String fim = "s";

		
		while (!fim.equals("n")) {
			
			produto prod = new produto();
			System.out.println("insira o nome do produto: ");
			prod.nome = sc.next();
			System.out.println("insira o valor do produto: ");
			prod.valor = sc.nextFloat();
			System.out.println("insira a quantidade do produto: ");
			prod.qtd = sc.nextLong();
			System.out.println("insira a descrição do produto: ");
			prod.descricao = sc.next();
			System.out.println("insira o codigo de barra do produto: ");
			prod.codBarra = sc.nextLong();
			lproduto.add(prod);
			System.out.println("deseja continuar a adicionar itens a lista? [n]/[s]");
			fim = sc.next();
		}
		
		for (int i = 0; i < lproduto.size();i++) {
			
			System.out.println("produto " + (i + 1));
			System.out.println();
			
			produto pd = lproduto.get(i);
			System.out.println("nome: " + pd.nome);
			System.out.println();
			System.out.println("valor: " + pd.valor);
			System.out.println();
			System.out.println("quantidade: " + pd.qtd);
			System.out.println();
			System.out.println("descrição: " + pd.descricao);
			System.out.println();
			System.out.println("código de barra: " + pd.codBarra);
			System.out.println();
			System.out.println();
			
		}
		
		
	}

}
