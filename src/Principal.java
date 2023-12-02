import java.util.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Hola mundoNOT");
        System.out.println("Hola otra vez");
        Scanner tecla = new Scanner(System.in);
        System.out.print("Coloque la dimension de la matriz: ");
        int dimension = tecla.nextInt();
        int matriz[][] = new int[dimension][dimension];
        for (int x = 0 ; x<matriz.length ; ++x) {
            for (int y = 0 ; y<matriz.length ; ++y) {
                System.out.printf("Posicion [%1d][%1d]: ",x , y);
                matriz[x][y] = tecla.nextInt();
            }
        }
        for (int x = 0 ; x<matriz.length ; ++x) {
            for (int y = 0 ; y<matriz.length ; ++y) {
                System.out.printf("%3d " , matriz[x][y]);
            }
            System.out.println("");
            
    }
        System.out.println("Fin programa");
        }        
    
}
