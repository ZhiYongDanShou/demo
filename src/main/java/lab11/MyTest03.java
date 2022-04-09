package lab11;

/**
 * @author shkstart
 * @create 2021-11-10 {TIME}
 */
public class MyTest03 {
    public static void main(String[] args) {
        int[][] array1 = new int[6][6];
        array1[1][2] = 1;
        array1[2][3] = 2;


        int sum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(array1[i][j]!=0){
                    sum++;
                }
            }
        }

        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 6;
        array2[0][1] = 6;
        array2[0][2] = sum;


        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j]!=0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }


        System.out.println("稀疏数组：");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}