import java.util.Scanner;

public class NumAleatorioApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el primer numero: ");
      int numero1 = Integer.parseInt(sc.nextLine());

    System.out.print("Introduce el segundo numero: ");
      int numero2 = Integer.parseInt(sc.nextLine());
    
    System.out.print("Introduce el tercer numero: ");
      int numero3 = Integer.parseInt(sc.nextLine());
    

      if (numero3 > numero1 && numero3 < numero2) {
        System.out.println("El numero " + numero3 + " se encuentra entre el " + numero1 + " y " + numero3);
      }
      
    if (numero1 >= numero2) {
     System.out.println("El primer numero debe ser menor que el segundo número");
    }

    while(numero1 <= numero2) {
      System.out.println(numero1);
      numero1 += 8; 
    }
    
    
    sc.close();
  }

}