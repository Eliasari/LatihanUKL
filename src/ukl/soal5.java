package ukl;
public class soal5 {
    public static void main (String[]args){
        //mendefinisikan array 2 dimensi untuk matriks A
        int matriks1[][] = new int[2][2];
        //mengisi elemen matriks dengan manual
        matriks1[0][0] = -5;
        matriks1[0][1] = 3;
        matriks1[1][0] = 7;
        matriks1[1][1] = 2;
        
        //mendefinisikan array 2 dimensi untuk matriks B
        int matriks2[][] = new int[2][2];
        //mengisi elemen dengan manual
        matriks2[0][0] = 3;
        matriks2[0][1] = 1;
        matriks2[1][0] = 5;
        matriks2[1][1] = -2;
        
        //output kalimat keterangan
        System.out.println("Hasil dari Matriks A - B adalah  ");
        
        //nested loop untuk akses elemen pada koordinat yang telah ditentukan
        for (int i = 0; i < matriks1.length; i++){
            for (int j = 0; j < matriks1[0].length; j++){
                //operator pengurangan untuk menghasilkan matriks A - B
                int hasilElemenMatriks = matriks1[i][j] - matriks2[i][j];
                //output penghasil matriks A - B 
                System.out.print( hasilElemenMatriks + " ");
            }       
            //pemisah line
            System.out.println();
        }
}
}

