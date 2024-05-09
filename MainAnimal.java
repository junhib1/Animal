import java.util.Scanner;
// Importa la clase Scanner.

class Main{
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);
      // Crea un nuevo objeto Scanner llamado "op" para leer la entrada del usuario desde la consola.

      Perro perro = new Perro();
      // Crea un nuevo objeto de la clase Perro llamado "perro".

      System.out.print("El nombre del Perro: ");
      String name1 = op.nextLine();
      // Muestra el mensaje en la consola solicitando el nombre del perro, luego lee la entrada del usuario y la almacena en la variable "name1".

      System.out.print("El tipo de alimento: ");
      String alimento1 = op.nextLine();
      // Muestra el mensaje en la consola solicitando el tipo de alimento del perro, luego lee la entrada del usuario y la almacena en la variable "alimento1".

      System.out.print("Edad del Perro: ");
      int age1 = op.nextInt();
      // Muestra el mensaje en la consola solicitando la edad del perro, luego lee la entrada del usuario como un entero y la almacena en la variable "age1".

      System.out.print("Raza: ");
      op.nextLine();
      // Lee la nueva línea en blanco después de leer el entero anterior, para evitar problemas de salto de línea.

      String race1 = op.nextLine();
      // Lee la entrada del usuario y la almacena en la variable "race1", que representa la raza del perro.

      perro.setNombre(name1);
      perro.setTipo_alimentacion(alimento1);
      perro.setEdad(age1);
      perro.setRaza(race1);
      // Establece los atributos del objeto "perro" con los valores proporcionados por el usuario.

      Gato gato = new Gato();
      // Crea un nuevo objeto de la clase Gato llamado "gato".

      System.out.print("El nombre del Gato: ");
      String name2 = op.nextLine();
      // Muestra el mensaje en la consola solicitando el nombre del gato, luego lee la entrada del usuario y la almacena en la variable "name2".

      System.out.print("El tipo de alimento: ");
      String alimento2 = op.nextLine();
      // Muestra el mensaje en la consola solicitando el tipo de alimento del gato, luego lee la entrada del usuario y la almacena en la variable "alimento2".

      System.out.print("Edad del Gato: ");
      int age2 = op.nextInt();
      // Muestra el mensaje en la consola solicitando la edad del gato, luego lee la entrada del usuario como un entero y la almacena en la variable "age2".

      System.out.print("Raza: ");
      op.nextLine();
      // Lee la nueva línea en blanco después de leer el entero anterior, para evitar problemas de salto de línea.

      String race2 = op.nextLine();
      // Lee la entrada del usuario y la almacena en la variable "race2", que representa la raza del gato.

      gato.setNombre(name2);
      gato.setTipo_alimentacion(alimento2);
      gato.setEdad(age2);
      gato.setRaza(race2);
      // Establece los atributos del objeto "gato" con los valores proporcionados por el usuario.

      perro.mostrar();
      gato.mostrar();
      // Llama al método "mostrar()" de los objetos "perro" y "gato" para imprimir la información de cada uno.

      System.out.println();
      // Imprime una línea en blanco en la consola.
   }
}
