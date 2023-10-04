import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    char lletra;
    System.out.print("Introdueix un caracter: ");
    lletra=entrada.next().charAt(0); 
  
    
  
    if (Character.isUpperCase(lletra)){
      lletra=Character.toLowerCase(lletra);
       }  else{
      if (Character.isLowerCase(lletra)){
        lletra=Character.toUpperCase(lletra);
              }
      }
       System.out.printf("La lletra es %c", lletra);
    
    
    
    }
    
}
