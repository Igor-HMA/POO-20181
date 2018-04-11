import java.util.Scanner;
class lanche{
public static void main(String[] args){
Scanner ler = new Scanner(System.in);
			
	float qtd,i,num,n1;
	double total = 0;
	System.out.println("Quantos pedidos deseja fazer?");
	qntd = ler.nextInt();
	
	for(i = 0;i < qtd; i++){	
		System.out.println("digite o código doque você deseja comer:");
		num = ler.nextInt();

		if(num == 10){
			System.out.println("Pastel de carne");
			System.out.println("Digite a quantidade");
			n1 = ler.nextInt();
			total = total + n1*1.50;
		}
		
		else if(num == 11){
			System.out.println("Coxinha de frango");
			System.out.println("Digite a quantidade");
			n1 = ler.nextInt();
			total = total + n1*1.80;
		}

		else if(num == 12){
			System.out.println("Empada de frango");
			System.out.println("Digite a quantidade");
			n1 = ler.nextInt();
			total = total + n1*1.90;
		}

		else if(num == 20){
			System.out.println("Hamburguer");
			System.out.println("Digite a quantidade");
			n1 = ler.nextInt();
			total = total + n1*10;
		}

		else if(num == 30){
			System.out.println("Pizza");
			System.out.println("Digite a quantidade");
			n1 = ler.nextInt();
			total = total + n1*8;
		}

		else if(num == 50){
			System.out.println("Suco");
			System.out.println("Digite a quantidade");
			n1 = ler.nextInt();
			total =  total + n1*2.50;
		}
		
		else{
			System.out.println("Código inválido");
		}
	}

		if(total > 50){
			System.out.println("total da compra : " + (total-(total*0.5)));
		}

		else{
			System.out.println("total da compra: " + total);
		}
	}
}	