package lista1;
import java.util.Scanner; 

public class Exercicio02 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("O antecessor de " + numero + " � " +(numero-1));
    }
}
