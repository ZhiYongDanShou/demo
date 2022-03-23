package lab12;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-11-15 {TIME}
 */
public class ArrayClone {
    public static void main(String[] args) {
        //The first method
        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = array1;
        System.out.println(array1 == array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        //The second method
        int[] array3 = new int[]{1,2,3,4};
        int[] array4 = array3.clone();
        System.out.println(array3 == array4);
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

        //The third method
        int[] array5 = new int[]{1,2,3,4};
        int[] array6 = Arrays.copyOf(array5,array5.length);
        System.out.println(array5 == array6);
        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(array6));

//        System.out.println("\n");
//
//        int[][] a=new int[3][4];
//        System.out.println("a.length="+ a.length);
//        System.out.println("a[0].length="+ a[0].length);


    }
}
