import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    float prac, examen;
      double resultado1, resultado2, nota;
    
    System.out.print("Introdueix nota de la part de practiques: ");
    prac=entrada.nextFloat();
    System.out.print("Introdueix nota de la part d'examen: ");
    examen=entrada.nextFloat();
    
    resultado1=(double)prac*0.10;
    resultado2=(double)examen*0.90;
    nota=resultado1+resultado2/2;
   
    if (nota<5) System.out.printf("%.1f Insuficiente", nota);
     
    else if (nota<5.5) System.out.printf("%.1f Suficient", nota);
      
    else if (nota<6.5) System.out.printf("%.1f Bé", nota);
      
    else if (nota<8.5) System.out.printf("%.1f Notable", nota);
     
    else if (nota<=10) System.out.printf("%.1f Excel·lent", nota);
        


        
    
  }
}