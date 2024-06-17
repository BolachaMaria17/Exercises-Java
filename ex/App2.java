package ex;
import java.util.Random;
public class App2 {
public static void main(String[] args) throws Exception {
    Random geranumero = new Random();
    System.out.println("Números gerados: ");
        for (int numeroSort = 0; numeroSort < 10;numeroSort++){
        //System.out.println(geranumero.nextInt(5));
        Modelo modelo = new Modelo();
        modelo.ePrimo(geranumero.nextInt(50));
        }
    }
}
