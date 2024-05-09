public class Perro extends Animal {
    // Declaración de variable de instancia privada
    private String raza;
 
    // Constructor con parámetros
    public Perro(String nombre, String tipo_alimentacion, int edad, String raza) {
       // Llamada al constructor de la superclase Animal
       super(nombre, tipo_alimentacion, edad);
       // Asignación de valor a la variable de instancia raza
       this.raza = raza;
    }
 
    // Constructor por defecto
    public Perro() {
       // Constructor autogenerado
    }
 
    // Método getter para raza
    public String getRaza() {
       return raza;
    }
 
    // Método setter para raza
    public void setRaza(String raza) {
       this.raza = raza;
    }
 
    // Método para mostrar información sobre el perro
    public void mostrar() {
       // Imprime el nombre, tipo de alimentación, edad y raza del perro
       System.out.println(getNombre() + "  " + getTipo_alimentacion() + "  " + getEdad() + "  " + getRaza());
    }
 }
