import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        // Agregar nodos al árbol
        arbol.agregarNodo(50);
        arbol.agregarNodo(30);
        arbol.agregarNodo(20);
        arbol.agregarNodo(40);
        arbol.agregarNodo(70);
        arbol.agregarNodo(60);
        arbol.agregarNodo(80);

        int opcion;
        do {
            System.out.println("\nRecorridos de Árbol Binario:");
            System.out.println("1. Preorden");
            System.out.println("2. Inorden");
            System.out.println("3. Postorden");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nRecorrido Preorden: ");
                    arbol.preorden(arbol.raiz);
                    break;
                case 2:
                    System.out.print("\nRecorrido Inorden: ");
                    arbol.inorden(arbol.raiz);
                    break;
                case 3:
                    System.out.print("\nRecorrido Postorden: ");
                    arbol.postorden(arbol.raiz);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
}



