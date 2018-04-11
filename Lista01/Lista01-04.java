import java.util.Scanner;
class media {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int n1, n2, n3, n4, total;

	System.out.println("digite sua primeira nota :");
	n1= ler.nextInt();
	
	System.out.println("digite sua segunda nota :");
	n2= ler.nextInt();

	System.out.println("digite sua terceira nota :");
	n3=ler.nextInt();

	System.out.println("digite sua quarta nota :");
	n4=ler.nextInt();

	total =	(n1+n2+n3+n4)/4;
	
	if ( total >= 7){
	System.out.println("sua média é " + total + " e você está APROVADO .");
	}

	else if( total < 7 && total >= 5 ){
	System.out.println("sua média é " + total + " e você está na PROVA FINAL .");
	}

	else if ( total < 5 ) {
	System.out.println("sua média é " + total + " e você está REPROVADO .");
	}

	}
}