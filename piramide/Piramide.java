public class Piramide{

//atributos
private final static int  nºbase_fija=5;
private final static float lado_fijo=5;
private final static float altura_fija=9;
private final static float apotema_fija=8;
private static float lado;
private static float altura;
private static int  nºbase;
private static float apotema;
//constructores
      //constructor por defecto:
      public Piramide(){
            lado=lado_fijo;
            altura=altura_fija;
            apotema=apotema_fija;
            nºbase=nºbase_fija;
      }
      //constructor con altura y lado
      public Piramide(float lado, float altura){
      this.lado=lado;
      this.altura=altura;
      apotema=apotema_fija;
      nºbase=nºbase_fija;

      }
      //con todos los atributos como parametro
       public Piramide(int nºbase,float lado,float altura,float apotema){
         this.nºbase=nºbase;
         this.lado=lado;
         this.altura=altura;
         this.apotema=apotema;
      }
   //metodos
   public static double calcularPerimetroBase(float lado, int nºbase){
   double resultado=(nºbase*lado);
   return resultado;
   }
   public static double calcularAreaCara(float altura, float lado, float apotema){
   double h=Math.sqrt((apotema*apotema)+(altura*altura));
   double resultado=h*lado/2;
   return resultado;
   }
   public static double calcularArea(float altura, float lado, float apotema, int nºbase) {
      double apotemal, areat;
     apotemal=Math.sqrt((altura*altura)+(apotema*apotema));
      return ((nºbase*lado)/2)*(apotema+apotemal);
   }
  //sett
       public void  setNºbase(int nºbase){
         this.nºbase=nºbase;
       }
        public void  setLado(float lado){
        this.lado=lado;
       }
       public void setAltura(float altura){
        this.altura=altura;
       }
        public void  setApotema(float apotema){
        this.apotema=apotema;
       }
       //get
      public int getNºbase(){
         return this.nºbase;
       }
        public float getLado(){
        return this.lado;
       }
       public float getAltura(){
        return this.altura;
       }
        public float setApotema(){
        return this.apotema;
       }


      
   //String
   public String toString(){
     String resumen=" el nº de base es "+this.nºbase+" los lados de la piramide son "+ this.lado+" la altura es "+ this.altura+" y la apotema tiene el valor de"+ this.apotema;
     return resumen;
     }

    

}//fin class