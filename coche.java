class Main {  
    public static void main(String args[]) {
      suma(2,3,4);
      Coche miCoche = new Coche();
      miCoche.agregarPuertas();
      System.out.println(miCoche.puertas);
     
    }
    public static void suma(int a, int b, int c){
      System.out.println(a + b + c);
    }
    static class Coche{
      public int puertas = 0;
  
      public void agregarPuertas(){
        this.puertas++;
      }
    }
  }