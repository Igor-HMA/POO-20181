import java.util.Scanner;
class media {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int n1, n2, n3, total;

	System.out.println("digite sua primeira nota :");
	n1= ler.nextInt();
	
	System.out.println("digite sua segunda nota :");
	n2= ler.nextInt();

	System.out.println("digite sua terceira nota :");
	n3=ler.nextInt();

	total =	(n1+n2+n3)/3;
	
	if ( total >= 85 && total <= 100){
	System.out.println("sua m�dia � " + total + " e voc� � um OTIMO aluno .");
	}

	else if( total >=65 && total <= 84 ){
	System.out.println("sua m�dia � " + total + " e voc� � um BOM aluno .");
	}

	else if ( total >= 5 && total < 65 ) {
	System.out.println("sua m�dia � " + total + " e voc� � um aluno REGULAR .");
	}

	else if ( total < 50 && total <= 0 ) {
	System.out.println("sua m�dia � " + total + " e voc� � um aluno INSUFICIENTE .");
	}
	
	else{
	System.out.println("DIGITE N�MEROS QUE ESTEJAM ENTRE 0 E 100 ");
	}

	}
}