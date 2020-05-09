package proyecto_java;

/**
 *
 * @author JCH
 */
public class Numeros {
    public void nume(double n1, double n2, double n3){
        if (n1 > n2 && n1 > n3) {
            System.out.println("Numero mayor: " + n1);
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("Numero mayor: " + n2);
        }else if (n3 > n1 && n3 > n2){
            System.out.println("Numero mayor: " + n3);
        }
    }
}



