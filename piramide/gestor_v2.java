import java.util.Scanner;
public class gestor_v2{
public static void main (String[]args){
            int n�base=0;
            float lado=0,altura=0,apotema=0;
            Scanner leer= new Scanner(System.in);
            System.out.println("Bienvenidos");
             System.out.println("1� piramide");
            Piramide p3=new Piramide();//1�constructor
              System.out.println(p3.toString());
              System.out.println("el area de la cara de la 1� piramide es:"+p3.calcularAreaCara( altura,  lado, apotema));
             System.out.println("el perimetro  de la 1� piramide es:"+p3.calcularPerimetroBase( lado,  n�base));
             System.out.println("el area total de la 1� piramide es:"+p3.calcularArea(altura, lado,  apotema,  n�base));

                          
            System.out.println("2� piramide");//3� constructor
             System.out.println("Dime el n� de la base de la piramide");
                           n�base=leer.nextInt();
                           System.out.println("Dime el lado de la piramide");
                           lado=leer.nextFloat();
                           System.out.println("Dime el altura de la piramide");
                           altura=leer.nextFloat();
                           System.out.println("Dime el apotema de la piramide");
                           apotema=leer.nextFloat();
   
          
            Piramide p1=new Piramide(n�base,lado,altura,apotema);//3�constructor
               System.out.println("el area de la cara de la 1� piramide es:"+p1.calcularAreaCara( altura,  lado, apotema));
             System.out.println("el perimetro  de la 1� piramide es:"+p1.calcularPerimetroBase( lado,  n�base));
             System.out.println("el area total de la 1� piramide es:"+p1.calcularArea(altura, lado,  apotema,  n�base));

                                                 
              System.out.println(p1.toString());
              System.out.println("3� piramide");
                           System.out.println("Dime el lado de la piramide");
                           lado=leer.nextFloat();
                           System.out.println("Dime el altura de la piramide");
                           altura=leer.nextFloat();
            Piramide p2=new Piramide(lado,altura);//2� constructor
             System.out.println("el area de la cara de la 1� piramide es:"+p2.calcularAreaCara( altura,  lado, apotema));
             System.out.println("el perimetro  de la 1� piramide es:"+p2.calcularPerimetroBase( lado,  n�base));
             System.out.println("el area total de la 1� piramide es:"+p2.calcularArea(altura, lado,  apotema,  n�base));
             System.out.println(p2.toString());
}
}