import java.util.Arrays;
import java.util.Scanner;

public class Principal {

        public static void main (String [] arg){

            int[] array;
            array = new int [9];
            final int total = 9 ;

            int faltan = 10;
            int i;
            Scanner sc = new Scanner(System.in);
            for(i=0; i<=total; i++) {
                System.out.println("Dime " + faltan + " numeros enteros");
                    array[i] = sc.nextInt();
                    faltan=faltan-1;
            }


            Arrays.sort(array); //Ordenamos el array
            int cont = 0;
            int aux= array[0]; //auxiliar almacena el primer valor

            for ( i = 0; i<=9; i++){ //i=0
                if (aux == array[i])
                {
                    cont++;
                }
                else
                {
                    System.out.println( aux + "  =  " + cont + " veces");
                    cont=1;
                    aux=array[i];
                }
            }
            System.out.println( aux + "  =  " + cont + " veces");


        }
          //  BuscarNumero(array);

        // }
  //  private static void BuscarNumero(int[] array) {




}

