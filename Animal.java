class Animal {
    // Variables miembro privadas para almacenar información específica de cada animal
    private String nombre, tipo_alimentacion;
    private int edad;
 
    // Constructor vacío por defecto
    Animal() {}
 
    // Constructor principal que inicializa las variables miembro con los valores proporcionados
    public Animal(String nombre, String tipo_alimentacion, int edad) {
       this.nombre = nombre;
       this.tipo_alimentacion = tipo_alimentacion;
       this.edad = edad;
    }
 
    // Método para obtener el nombre del animal
    public String getNombre() {
       return nombre;
    }
 
    // Método para establecer el nombre del animal
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }
 
    // Método para obtener el tipo de alimentación del animal
    public String getTipo_alimentacion() {
       return tipo_alimentacion;
    }
 
    // Método para establecer el tipo de alimentación del animal
    public void setTipo_alimentacion(String tipo_alimentacion) {
       this.tipo_alimentacion = tipo_alimentacion;
    }
 
    // Método para obtener la edad del animal
    public int getEdad() {
       return edad;
    }
 
    // Método para establecer la edad del animal
    public void setEdad(int edad) {
       this.edad = edad;
    }
 }
