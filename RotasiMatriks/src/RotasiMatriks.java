public class RotasiMatriks {

    /**
     * function printArray 2 Dimension array
     *
     * @param array parameter is array 2 Dimension
     */
    public static void printArray(int[][] array){
        for (int i=0;i<array.length;i++){
            for (int k=0;k<array[i].length;k++){
                System.out.print(array[i][k] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * function rotate
     * untuk merotasi matriks 2 dimensi ke 90 derajat dan mereturn dalam bentuk array 2 dimensi
     *
     * @param matriks sembarang matriks 2 dimensi
     * @return  array 2 dimensi dengan hasil dari rotasi 90 derajat matriks di parameter
     */

    public static int[][] rotate(int[][] matriks){
        int baris = matriks[0].length;
        int kolom = matriks.length;
        int[][] matriksbaru = new int[baris][kolom];

        int kolomnya = 0;
        for (int i=0;i<baris;i++){
            int barisnya = kolom-1;
            for (int j=0;j<kolom;j++){
                matriksbaru[i][j] = matriks[barisnya][kolomnya];
                barisnya--;
            }
            kolomnya++;
        }
        return matriksbaru;
    }


    public static void main(String[] args){
        int[][] matriksAsal = {
                {1,2,3},
                {4,5,6}
        };

        int[][] hasilRotasi = rotate(matriksAsal);

        printArray(hasilRotasi);
    }
}
