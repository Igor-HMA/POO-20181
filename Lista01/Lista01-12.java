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
	System.out.println("seu n�mero elevando a 2 �: " + formula + ", e seu n�mero elevado a 3 �: " + resultado);
	}
	else{
	System.out.println("SEU N�MERO N�O EST� ENTRA 0 E 10.");
	}	

	}
}