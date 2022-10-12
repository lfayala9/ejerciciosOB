import javax.management.loading.PrivateClassLoader;

class Main {  
    public static void main(String args[]) {
      Persona luis = new Persona();
      luis.setEdad(24);
      luis.setNombre("Luis Ayala");
      luis.setTelefono("+58 412-123-4567");
      System.out.println("La edad de la persona es: " + luis.getEdad());
      System.out.println("El nombre de la persona es: " + luis.getNombre());
      System.out.println("El telefono de la persona es: " + luis.getTelefono());
    }
  }
class Persona {
  private int edad;
  private String nombre;
  private String telefono;

  public void setEdad(int edad){
    this.edad = edad;
  }

  public int getEdad(){
    return this.edad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String getNombre(){
    return this.nombre;
  }

  public void setTelefono(String telefono){
    this.telefono = telefono;
  }
  
  public String getTelefono(){
    return this.telefono;
  }
}