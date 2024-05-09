public class Gato extends Animal {
    // Declaración de variable de instancia privada
    private String raza;

    // Método constructor con parámetros
    public Gato(String nombre, String tipo_alimentacion, int edad, String raza) {
        // Llamada al constructor de la superclase
        super(nombre, tipo_alimentacion, edad);
        // Asignación de valor a la variable de instancia
        this.raza = raza;
    }

    // Constructor por defecto
    public Gato() {
        // Constructor autogenerado
    }

    // Método getter para 'raza'
    public String getRaza() {
        return raza;
    }

    // Método setter para 'raza'
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Método para mostrar la información del gato
    public void mostrar() {
        // Imprimir información del gato
        System.out.println(getNombre() + "  " + getTipo_alimentacion() + "  " + getEdad() + "  " + getRaza());
    }
}
