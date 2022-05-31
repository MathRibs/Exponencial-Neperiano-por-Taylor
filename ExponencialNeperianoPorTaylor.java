import java.util.Scanner;

public class ExponencialNeperianoPorTaylor {
public static void main(String[] args) {
 Scanner leitor = new Scanner(System.in);
 
 double expoente = 0;
 double resultado = 0;
 double dividendoResultado= 0;
 double divisorResultado = 0;
 
 System.out.println("Digite o expoente: ");
 expoente = leitor.nextDouble();
 
 resultado = 1 + expoente;
 
 for (int i = 2 ; i < 20 ; i++) {
	 dividendoResultado = expoente;
	 for (int j = 1 ; j < i ; j++) {
		 dividendoResultado *= expoente;
	 }
 divisorResultado = 1 ;
 for(int j = i; j > 0 ; j--) {
	 divisorResultado *= j;
 }
 resultado += (dividendoResultado / divisorResultado);
 }

System.out.println("O número Euller elevado ao expoente calculado pelo Java é:" + Math.pow(Math.E , expoente));
System.out.println("O número Euller elevado ao expoente calculado por Taylor é:" + resultado);




}
}
