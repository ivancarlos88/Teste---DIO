import java.util.Random;
import java.util.Scanner;

public class Gerar {

	public static void main(String[] args) {
		Random num = new Random();
		Scanner ler = new Scanner(System.in);
		int numero = 11;

		int sorteado = num.nextInt(11);
		while (numero != sorteado) {
			System.out.println("Qual número escolhi? ");
			numero = ler.nextInt();

			if (numero == sorteado) {
				System.out.print("O número que escolhi foi: " + sorteado + ". Acertou!");
				break;
			} else {
				System.out.print("Tente denovo. ");
			}
		}
	}

}
