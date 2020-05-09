package proyecto_java;

import java.util.Scanner;

/**
 *
 * @author JCH
 */
public class Proyecto_Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int s = 0;
        do {
            System.out.println("*********************************************");
            System.out.println("**              Ejercicio 2                **");
            System.out.println("*********************************************");
            System.out.println("**   1. Hola Mundo                         **");
            System.out.println("**   2. For                                **");
            System.out.println("**   3. IF                                 **");
            System.out.println("**   4. Salir                              **");
            System.out.println("*********************************************");
            System.out.println("Ingrese el numero de su opcion");
            int opc = leer.nextInt();
            String p = "";
            switch (opc){
                case 1:
                    Hola obj1 = new Hola();
                    System.out.println("Ingrese un nombre");
                    String n = leer.next();
                    System.out.println("Ingrese un apellido");
                    String a = leer.next();
                    obj1.saludo(n, a);
                    System.out.println("Presione una tecla para continuar");
                    p = leer.next();
                    s = s + 1;
                    break;
                case 2:
                    Tablas obj2 = new Tablas();
                    System.out.println("Ingrese un numero");
                    int num = leer.nextInt();
                    obj2.tabla(num);
                    System.out.println("Presione una tecla para continuar");
                    p = leer.next();
                    s = s + 1;
                    break;
                case 3:
                    Numeros obj3 = new Numeros();
                    System.out.println("Ingrese un numero");
                    double n1 = leer.nextDouble();
                    System.out.println("Ingrese otro numero");
                    double n2 = leer.nextDouble();
                    System.out.println("Ingrese un numero final");
                    double n3 = leer.nextDouble();
                    obj3.nume(n1, n2, n3);
                    System.out.println("Presione una tecla para continuar");
                    p = leer.next();
                    s = s + 1;
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    s = s + 1;
                    break;
            }
        } while (s <= 3);
    }
}






