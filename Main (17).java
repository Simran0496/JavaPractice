import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    char opcio;
    double radi, resultat;
    System.out.print("Introdueix el valor del radi del cercle: ");
    radi=entrada.nextDouble();

    System.out.println("MENU");
    System.out.println("-----");
    System.out.println("A. Area del cercle");
    System.out.println("L. Longitud del cercle");
    System.out.print("Tria quina opcio vols A o L: ");
    opcio=entrada.next().charAt(0);
  
    resultat=(opcio == 'A' ? Math.PI*radi*radi : Math.PI*2*radi);
    resultat=(opcio == 'a' ? Math.PI*radi*radi : Math.PI*2*radi);
   
    System.out.printf("El resultat de l'opcio triada es %.2f", resultat);


  }
}