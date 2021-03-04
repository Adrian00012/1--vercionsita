import java.util.Scanner;
public class gestor{
public static void main (String[]args){
            int nºbase=0;
            float lado=0,altura=0,apotema=0;
            Scanner leer= new Scanner(System.in);
            System.out.println("Bienvenidos");
            Piramide p3=new Piramide();//1ºconstructor
                     System.out.println(p3.toString());
            
            Piramide p1=new Piramide(nºbase,lado,altura,apotema);//3ºconstructor
                        System.out.println("Dime el nº de la base de la piramide");
                           nºbase=leer.nextInt();
                           System.out.println("Dime el lado de la piramide");
                           lado=leer.nextFloat();
                           System.out.println("Dime el altura de la piramide");
                           altura=leer.nextFloat();
                           System.out.println("Dime el apotema de la piramide");
                           apotema=leer.nextFloat();
                          
                     System.out.println(p1.toString());
                           
            Piramide p2=new Piramide(lado,altura);//2º constructor
}
}