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
