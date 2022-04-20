import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {

        public static void main (String [] arg){

            Integer[] array = new Integer [10];
            int faltan = 10;

            Scanner sc = new Scanner(System.in);
            for(int i=0; i< array.length; i++) {
                System.out.println("Dime " + faltan + " numeros enteros");
                    array[i] = sc.nextInt();
                    faltan=faltan-1;
            }
          Contar_repeticiones(array);

        }
    private static void Contar_repeticiones(Integer[] array) {

        Arrays.sort(array); //Ordenamos el array
        int cont = 0;
        int aux= array[0]; //auxiliar almacena el primer valor

        int i;
        for ( i = 0; i<=9; i++){ //i=0
            if (aux == array[i])
            {
                cont++; //suma las veces que 0 es igual a 0
            }
            else
            {
                System.out.println( aux + "  =  " + cont + " veces"); //sino, lo imprime
                cont=1;
                aux=array[i];
            }
        }
        System.out.println( aux + "  =  " + cont + " veces");

    }
   /*
   Explicado en clase:
   public static String ContarRepticionesconHashMap (Integer[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : array) {
            if (map.containsKey(num)) {
                Integer value = map.get(num);
                value++;
                map.replace(num, value);
            } else {
                map.put(num, 1);
            }
        }

    */
    }
}

