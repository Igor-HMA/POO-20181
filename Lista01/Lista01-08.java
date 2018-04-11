import java.util.Scanner;
class transformacao {

	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

	int n, i, resultado = 0, maior = 0, menor = 99999 ;
	for (i=0; i<10; i++){

	System.out.println(" digite dez números inteiros : ");
	n = ler.nextInt();

		if ( n <= menor ){
			menor = n ;
		}
		resultado = resultado + n ;
	
		if (n >= maior){
			maior = n;
		}
	}
	System.out.println("menor -> "+ menor );
	System.out.println("maior -> "+ maior );
	System.out.println("média -> "+ (resultado/10));
	}
}