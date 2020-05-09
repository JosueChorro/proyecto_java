package proyecto_java;

/**
 *
 * @author JCH
 */
public class Tablas {
    public void tabla(int num){
        System.out.println("*********************************************");
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " x " + i  + " = "+ res);
        }
        System.out.println("*********************************************");
    }
}




