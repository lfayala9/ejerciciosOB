import javax.management.loading.PrivateClassLoader;

class Main {  
    public static void main(String args[]) {
      Cliente cliente = new Cliente();
      cliente.setEdad(24);
      cliente.setNombre("Luis Ayala");
      cliente.setTelefono("+58 412-1234-567");
      System.out.println("La edad del Cliente es: " + cliente.edad);
      System.out.println(cliente.getNombre());
      System.out.println(cliente.getTelefono());
      System.out.println(cliente.credito);

      Trabajador trabajador = new Trabajador();
      trabajador.setEdad(45);
      trabajador.setNombre("Carlos Perez");
      trabajador.setTelefono("+58 426-1234-567");
      trabajador.setSalario(5000);
      System.out.println("La edad del Trabajador es: " + trabajador.edad);
      System.out.println(trabajador.getNombre());
      System.out.println(trabajador.getTelefono());
      System.out.println("El salario del trabajador es: " + trabajador.getSalario());
    }
  }

abstract class Persona {
  int edad;
  String nombre;
  String telefono;

  abstract void setEdad(int edad);
  abstract int getEdad();

  abstract void setNombre(String nombre);
  abstract String getNombre();

  abstract void setTelefono(String telefono);
  abstract String getTelefono();
}

class Cliente extends Persona{

  String credito = "Este cliente tiene un credito";
  
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
    return "Este cliente se llama: " + this.nombre;
  }

  public void setTelefono(String telefono){
    this.telefono = telefono;
  }
  public String getTelefono(){
    return "El numero del cliente es: " + this.telefono;
  }
}

class Trabajador extends Persona{

  int salario = 0;
  public void setSalario(int salario){
    this.salario = salario;
  }
  public int getSalario(){
    return this.salario;
  }
  
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
    return "Este trabajador se llama: " + this.nombre;
  }

  public void setTelefono(String telefono){
    this.telefono = telefono;
  }
  public String getTelefono(){
    return "El numero del trabajador es: " + this.telefono;
  }
}