import java.util.Random;

public class NumAleatorioApp {

  public static void main(String[] args) {

    Random generator = new Random();

    for (int i = 1; i <= 20; i++) {
      double randomNumber = generator.nextDouble(1.0, 10.0);
      System.out.println("Este es el numero " + i + ": " + (int) randomNumber);
    }

  }
}
