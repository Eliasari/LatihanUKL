package ukl;
public class soal5 {
    public static void main (String[]args){
        //mendefinisikan array 2 dimensi untuk matriks A
        int matrix1[][] = new int[2][2];
        //mengisi elemen matriks dengan manual
        matrix1[0][0] = -5;
        matrix1[0][1] = 3;
        matrix1[1][0] = 7;
        matrix1[1][1] = 2;
        
        //mendefinisikan array 2 dimensi untuk matriks B
        int matrix2[][] = new int[2][2];
        //mengisi elemen dengan manual
        matrix2[0][0] = 3;
        matrix2[0][1] = 1;
        matrix2[1][0] = 5;
        matrix2[1][1] = -2;
        
        //output kalimat keterangan
        System.out.println("Hasil dari Matriks A - B adalah  ");
        
        //nested loop untuk akses elemen pada koordinat yang telah ditentukan
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasilElemenMatriks = matrix1[i][j] - matrix2[i][j];     
                System.out.print( hasilElemenMatriks + " ");
            }       
            System.out.println();
        }
}
}

