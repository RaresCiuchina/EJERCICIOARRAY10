import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main (String [] arg){

        int[] array;
        array = new int [9];
        final int total = 9 ;

        int faltan = 10;
        int i;
        for(i=0; i<=total; i++) {
            System.out.println("Dime " + faltan + " numeros enteros");
            Scanner sc = new Scanner(System.in);
                array[i] = sc.nextInt();
                faltan=faltan-1;
        }




    }
}
