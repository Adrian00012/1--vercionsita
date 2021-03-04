import java.util.Scanner;
public class gestor_v2{
public static void main (String[]args){
            int nºbase=0;
            float lado=0,altura=0,apotema=0;
            Scanner leer= new Scanner(System.in);
            System.out.println("Bienvenidos");
             System.out.println("1º piramide");
            Piramide p3=new Piramide();//1ºconstructor
              System.out.println(p3.toString());
              System.out.println("el area de la cara de la 1º piramide es:"+p3.calcularAreaCara( altura,  lado, apotema));
             System.out.println("el perimetro  de la 1º piramide es:"+p3.calcularPerimetroBase( lado,  nºbase));
             System.out.println("el area total de la 1º piramide es:"+p3.calcularArea(altura, lado,  apotema,  nºbase));

                          
            System.out.println("2º piramide");//3º constructor
             System.out.println("Dime el nº de la base de la piramide");
                           nºbase=leer.nextInt();
                           System.out.println("Dime el lado de la piramide");
                           lado=leer.nextFloat();
                           System.out.println("Dime el altura de la piramide");
                           altura=leer.nextFloat();
                           System.out.println("Dime el apotema de la piramide");
                           apotema=leer.nextFloat();
   
          
            Piramide p1=new Piramide(nºbase,lado,altura,apotema);//3ºconstructor
               System.out.println("el area de la cara de la 1º piramide es:"+p1.calcularAreaCara( altura,  lado, apotema));
             System.out.println("el perimetro  de la 1º piramide es:"+p1.calcularPerimetroBase( lado,  nºbase));
             System.out.println("el area total de la 1º piramide es:"+p1.calcularArea(altura, lado,  apotema,  nºbase));

                                                 
              System.out.println(p1.toString());
              System.out.println("3º piramide");
                           System.out.println("Dime el lado de la piramide");
                           lado=leer.nextFloat();
                           System.out.println("Dime el altura de la piramide");
                           altura=leer.nextFloat();
            Piramide p2=new Piramide(lado,altura);//2º constructor
             System.out.println("el area de la cara de la 1º piramide es:"+p2.calcularAreaCara( altura,  lado, apotema));
             System.out.println("el perimetro  de la 1º piramide es:"+p2.calcularPerimetroBase( lado,  nºbase));
             System.out.println("el area total de la 1º piramide es:"+p2.calcularArea(altura, lado,  apotema,  nºbase));
             System.out.println(p2.toString());
}
}