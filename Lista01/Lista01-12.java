import java.util.Scanner;
class transformacao {

	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	double resultado,formula ;
	int n ;
	System.out.println("digite um numero de 0 a 10 :");
	n = ler.nextInt();
	if ( n <= 10 && n >=0 ){
	formula= Math.pow(n,2);
	resultado= Math.pow(n,3);
	System.out.println("seu número elevando a 2 é: " + formula + ", e seu número elevado a 3 é: " + resultado);
	}
	else{
	System.out.println("SEU NÚMERO NÃO ESTÁ ENTRA 0 E 10.");
	}	

	}
}