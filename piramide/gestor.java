import java.util.Scanner;
public class gestor{
public static void main (String[]args){
            int n�base=0;
            float lado=0,altura=0,apotema=0;
            Scanner leer= new Scanner(System.in);
            System.out.println("Bienvenidos");
            Piramide p3=new Piramide();//1�constructor
                     System.out.println(p3.toString());
            
            Piramide p1=new Piramide(n�base,lado,altura,apotema);//3�constructor
                        System.out.println("Dime el n� de la base de la piramide");
                           n�base=leer.nextInt();
                           System.out.println("Dime el lado de la piramide");
                           lado=leer.nextFloat();
                           System.out.println("Dime el altura de la piramide");
                           altura=leer.nextFloat();
                           System.out.println("Dime el apotema de la piramide");
                           apotema=leer.nextFloat();
                          
                     System.out.println(p1.toString());
                           
            Piramide p2=new Piramide(lado,altura);//2� constructor
}
}