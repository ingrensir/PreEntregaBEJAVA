import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   ArrayList<String> productoDB = new ArrayList<>();
   // eleccion de funcionalidad y bucle
    int opcionUsuario;

    System.out.println("Te damos la Bienvenida a la app de compras 🛒");
<<<<<<< HEAD
    label:
=======
>>>>>>> 0e008921a66812f47e238dfa9454e1f75d45f674
    while(true){
      System.out.println("""
          Ingrese el número equivalente a la opcion:
          0 - Finalizar el Programa.
          1 - Crear un producto.
          2 - Listar productos.
          3 - Busqueda por nombre.
          4 - Editar nombre Producto.
          5 - Borrar producto.
          """);
      opcionUsuario = entrada.nextInt();

<<<<<<< HEAD
      switch (opcionUsuario) {
        case 1:
          crearProducto(productoDB);
          break;
        case 2:
          listarProductos(productoDB);
          break;
        case 0:
          System.out.println("Gracias por usar la app!");
          break label; // Corta el bucle.-
=======
      if (opcionUsuario == 1){
        crearProducto(productoDB);
         } else if (opcionUsuario == 2){
            listarProductos(productoDB);
      }
      else if (opcionUsuario == 0){
        System.out.println("Gracias por usar la app!");
        break; // Corta el bucle.-
>>>>>>> 0e008921a66812f47e238dfa9454e1f75d45f674
      }
    }
  }

  public static void crearProducto(ArrayList<String> productos) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Creando nuevo producto");
    System.out.print("Ingrese el nombre del nuevo producto: ");
    String nombre = entrada.nextLine();

    productos.add(nombre);
    pausa();
  }

  public static void listarProductos(ArrayList<String> productos) {
    System.out.println("==================================================");
    System.out.println("             *- LISTA DE PRODUCTOS -*             ");
    System.out.println("==================================================");

      if (productos == null || productos.isEmpty()){
        System.out.println("⚠ NO hay productos para mostrar.");
      }else {
        int contador = 1;
        for (String producto : productos){
          System.out.printf("%2d. %s%n", contador++, producto);
          }
      }
    System.out.println("==================================================");
      pausa();


  }

  public static void pausa(){
      Scanner entrada = new Scanner(System.in);
      System.out.println("Presione ENTER para continuar - - - >");
      String pausa = entrada.next();
  }
}