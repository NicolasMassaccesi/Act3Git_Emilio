import java.util.Random;
import java.util.Scanner;

public class NumAleatorioApp {

  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 1; i <= 20; i++) {
      double generator = random.nextDouble(1.0, 10.0);
      System.out.println("El numero " + i + " es: " + (int) generator);
    }

  }
}
