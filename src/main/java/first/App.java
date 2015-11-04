package first;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by LuMoR on 03.11.2015.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("privet");
        int[] array =  {25,10,5,40,2,99,15,30,50};
        int kol_int;
        Date cur = new Date();
        kol_int = 0;
        System.out.println(Arrays.toString(array));
        System.out.println(String.valueOf(cur.getTime()));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i+1; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
                kol_int++;
            }


        }
        System.out.println(kol_int);
        System.out.println(Arrays.toString(array));

    }

    private static void swap(int[] array, int i, int j) {
        int buf;
        buf = array[i];
        array[i] = array[j];
        array[j] = buf;

    }

}
