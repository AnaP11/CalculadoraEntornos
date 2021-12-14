import java.util.Scanner;

/**
 * <b>Clase MetodosConParametros</b>,para creacion de una calculadora sencilla en Java
 * @author Ana I. Jimenez, Ana Ponce Alcaniz
 * @version 12-2021
 * @since 12-2021
 */


public class MetodosConParametros {
    /**
     * Metodo main recoge los numeros introducidos por el usuario. Tambien hace llamada al metodo menu y luego al metodo seleccionarOperacion
     * @param args parametro propio de cualquier main
     */
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
        int operacion = menu();

        seleccionarOperacion(operacion, a, b);

    }

    /**
     * Metodo suma realiza la suma de los dos numeros introducidos por teclado (a, b).
     * @param a Primer numero introducido a sumar
     * @param b Segundo numero introducido a sumar
     */
    public static void suma(double a, double b){
        double suma = a + b;
        System.out.println("Suma: " + suma);
    }

    /**
     * Metodo resta realiza la resta de los dos numeros introducidos por teclado (num1, num2).
     * @param num1 Primer numero introducido a restar
     * @param num2 Segundo numero introducido a restar
     */
    public static void resta(double num1, double num2) {
        double resta = num1 - num2;
        System.out.println("Resta" + resta);
    }

    /**
     * Metodo producto realiza la multiplicacion de los dos numeros introducidos por teclado (num1, num2).
     * @param num1 Primer numero introducido a multiplicar
     * @param num2 Segundo numero introducido a multiplicar
     */
    public static void producto(double num1, double num2) {
        double producto = num1 * num2;
        System.out.println("Producto: " + producto);
    }

    /**
     * Metodo cociente realiza la division de los dos numeros introducidos por teclado (num1, num2).
     * @param num1 Primer numero introducido a dividir (dividendo)
     * @param num2 Segundo numero introducido a dividir (divisor)
     */
    public static void cociente(double num1, double num2) {
        double cociente = num1 / num2;
        System.out.println("Cociente: " + cociente);
    }

    /**
     * Metodo menu pregunta al usuario el tipo de operacion que desea realizar
     * @return Devuelve el tipo de operacion a realizar (suma, resta, multiplicacion o division); este lo recibe el metodo main bajo la variable con nombre op.
     */
    public static int menu() { // presenta el menú de opciones, y devuelve el código de operación
        Scanner sc = new Scanner(System.in);
        System.out.println("Operación: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
        int op = sc.nextInt();
        return op;
    }

    /**
     * Proveniente del metodo main, recibe 3 parametros
     * @param op Numero indicador del tipo de operacion escogida por el usuario
     * @param a Primer numero introducido
     * @param b Segundo numero introducido
     */
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
