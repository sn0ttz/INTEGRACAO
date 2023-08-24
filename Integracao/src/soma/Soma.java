package soma;
import java.util.*;

public class Soma {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num1 = in.nextInt();//scan do primeiro numero
		int num2 = in.nextInt();// scan do segundo numero
		int soma = num1 + num2;// soma dos dois numeros
		System.out.println("A soma dos dois numeros e igual a " + soma);
		in.close();
	}
	
}
