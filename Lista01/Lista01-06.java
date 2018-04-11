import java.util.Scanner;
class diaria {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	float preco;
	String nome;
	int n;
	 
	System.out.println("digite seu nome:");
	nome= ler.nextLine();
	
	System.out.println("digite a quantidade de dias q irá ficar no hotel:");
	n= ler.nextInt();
	
	if (n>15){
	preco= n * 5.50f;
	System.out.println(nome + " o preço total das suas diarias é R$" + preco);
	}

	else if (n == 15) {
	preco= n * 6.00f;
	System.out.println(nome + " o preço total das suas diarias é R$" + preco);
	}

	else if (n < 15) {
	preco= n * 8.00f;
	System.out.println(nome + " o preço total das suas diarias é R$" + preco);
	}

	}
}