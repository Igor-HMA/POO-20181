import java.util.Scanner;
class mes {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

	int n;
	System.out.println("escreva um numero que esteja entre 1 e 12");
	n= ler.nextInt();
	
	if (n==1){
	System.out.println("JANEIRO");
	}

	else if( n==2 ){
	System.out.println("FEVEREIRO");
	}

	else if ( n==3 ) {
	System.out.println("MARÇO");
	}

	else if ( n==4 ) {
	System.out.println("ABRIL");
	}

	else if ( n==5 ) {
	System.out.println("MAIO");
	}

	else if ( n==6 ) {
	System.out.println("JUNHO");
	}

	else if ( n==7 ) {
	System.out.println("JULHO");
	}

	else if ( n==8 ) {
	System.out.println("AGOSTO");
	}

	else if ( n==9 ) {
	System.out.println("SETEMBRO");
	}

	else if ( n==10 ) {
	System.out.println("OUTUBRO");
	}

	else if ( n==11 ) {
	System.out.println("NOVEMBRO");
	}

	else if ( n==12 ) {
	System.out.println("DEZEMBRO");
	}

	else{
	System.out.println("escreva um número qualquer entre 1 e 12");
	}

	}
}