import java.util.Scanner;
class par{
public static void main(String[] args){
Scanner ler = new Scanner(System.in);

int n1, n2, menor, maior, cont, cont1, i, soma;
cont = 0;
cont1 = 0;

System.out.println("digite 2 n�meros pares: ");
n1 = ler.nextInt();
n2 = ler.nextInt();
	if(n1<n2){
	menor = n1;
	maior = n2;
	}

	else{
	menor = n2;
	maior = n1;
	}
		
	for(i = menor;i<maior;i++){
		if(i % 2 == 0){
		cont++;
		}

		else{
		cont1++;
		}
	}

	soma= n1 + n2;

	System.out.println("N�meros pares entre os dois n�meros -> " + cont);
	System.out.println("N�meros impares entre os dois n�meros -> " + cont1);
	System.out.println("Soma do dois n�meros -> " + soma );
	}
}