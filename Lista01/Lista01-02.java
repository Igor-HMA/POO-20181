import java.util.Scanner;
class idade {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int n,formula;
	System.out.println("digite o ano de nascimento :");
	n = ler.nextInt();
	formula= ( 2018 - n );	
	System.out.println("você tem " + formula + " anos");
	}
}