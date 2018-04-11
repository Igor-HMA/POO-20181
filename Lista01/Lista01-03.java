import java.util.Scanner;
class media {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int n1,n2,n3,formula1,formula2,formula3,total;
	System.out.println("digite sua primeira nota :");
	n1= ler.nextInt();
	formula1 = n1 * 2;
	
	System.out.println("digite sua segunda nota :");
	n2= ler.nextInt();
	formula2 = n2 * 3;

	System.out.println("digite sua terceira nota :");
	n3=ler.nextInt();
	formula3 = n3 * 5;

	total =	(formula1+formula2+formula3)/10;

	System.out.println("sua média final é " + total + " .");
	}
}