public class PrintArray {

    /**
     * function printArray 1 Dimension array
     *
     * @param array parameter is array 1 Dimension
     */
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }


    /**
     * function printArray 2 Dimension array
     *
     * @param array parameter is array 2 Dimension
     */
    public static void printArray(int[][] array){
        for (int i=0;i<array.length;i++){
            for (int k=0;k<array[i].length;k++){
                System.out.print(array[i][k]+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        int[] array1D = {1,2,3};
        int[][] array2D = {
                {1,2,3},
                {4,5},
                {6},
                {7,8,9,10,11,12}
        };

        System.out.println("Array 1 Dimensi:");
        printArray(array1D);

        System.out.println();

        System.out.println("Array 2 Dimensi:");
        printArray(array2D);
    }

}
