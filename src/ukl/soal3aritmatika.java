package ukl;
public class soal3aritmatika {
    public static void main(String[] args) { 
        //deklarasi variabel 
        //deklarasi nilai suku pertama
        int sukuAwal = 10;    
        //deklarasi nilai beda untuk deret aritmatika
        int beda = 5;      
        //deklarasi menghitung jumlah nilai pada deret aritmatika
        int sukuNew = 0;
        
        //input kalimat
        System.out.println("Deret Aritmatikanya adalah ");
            //pembuatan matriks
            for(int j = 0; j<3; j++){       //pembuatan matriks, pembentukan baris 
               for(int k = 0; k<5; k++){    //pembuatan matriks, pembentukan kolom
                    //sebagai output elemen awal dari matriks
                    System.out.print(sukuAwal + " " + " "); 
                    //sebagai operator penentu setiap elemen dari matriks
                    sukuNew += sukuAwal; 
                    sukuAwal += beda;                     
            }
                //pembentuk pola matriks
                System.out.println(); 
            }
                //output jumlah deret aritmatika
                System.out.println("Jumlah Deret Aritmatika : " + sukuNew);
            }    
        } 

        

    

        
    

