import java.util.Random;

public class NumAleatorioApp {

  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 1; i <= 30; i++) {
      double generator = random.nextDouble(1.0, 10.0);
      System.out.println("El numero " + i + " es: " + (int) generator);
    }

<<<<<<< HEAD
=======
    while(numero1 <= numero2) {
      System.out.println(numero1);
      numero1 += 8; 
    }
    
    
    sc.close();
>>>>>>> refs/heads/rama1
  }
}
