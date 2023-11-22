import java.util.Scanner;

public class NumAleatorioApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el primer numero: ");
    int numero1 = Integer.parseInt(sc.nextLine());

    System.out.print("Introduce el primer numero: ");
    int numero2 = Integer.parseInt(sc.nextLine());


    if (numero1 >= numero2) {
     System.out.println("El primer numero debe ser menor que el segundo número");
    }

    while(numero1 <= numero2) {
      System.out.println(numero1);
      numero1 += 7;
    }
    sc.close();
  }

}

//Programa Anterior
//import java.util.Random;
//
//public class NumAleatorioApp {
//
//public static void main(String[] args) {
//
//  Random generator = new Random();
//
//  for (int i = 1; i <= 20; i++) {
//    double randomNumber = generator.nextDouble(1.0, 10.0);
//    System.out.println("Este es el numero " + i + ": " + (int) randomNumber);
//  }
//
//}
//
//}