import java.util.Scanner;

public class MetodosConParametros {
    public static void main(String[] args) {
        // Vamos a hacer una calculadora
        // Pedimos: dos números y una operación
        // Hacemos la operación correspondiente
        // Imprimimos el resultado

        // Recoger datos
       Scanner sc = new Scanner(System.in);
        System.out.println("Num:");
        double a = sc.nextDouble();
        System.out.println("Num:");
        double b = sc.nextDouble();
        // llamo al método menú y devuelvo la operación seleccionada
        int operación = menu();

        seleccionarOperacion(operación, a, b);

    }

    public static void suma(double a, double b){
        double suma = a + b;
        System.out.println("Suma: " + suma);
    }

    public static void resta(double num1, double num2) {
        double resta = num1 - num2;
        System.out.println("Resta" + resta);
    }

    public static void producto(double num1, double num2) {
        double producto = num1 * num2;
        System.out.println("Producto: " + producto);
    }

    public static void cociente(double num1, double num2) {
        double cociente = num1 / num2;
        System.out.println("Cociente: " + cociente);
    }



    public static int menu() { // presenta el menú de opciones, y devuelve el código de operación
        Scanner sc = new Scanner(System.in);
        System.out.println("Operación: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
        int op = sc.nextInt();
        return op;
    }

    public static void seleccionarOperacion(int op, double a, double b) {
        if (op == 1) {
            // Suma
            suma(a, b);
        } else if (op == 2) {
            // Resta
            resta(a, b);
        } else if (op == 3) {
            // Multiplicación
            producto(a, b);
        } else if (op == 4) {
            // Cociente
            cociente(a, b);
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}
