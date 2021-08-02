package ukl;
public class soal4A {
     public static void main (String[]args){
        //deklarasi variabel soal 4A
        int beda = 5;
        int sukuAwal = 5;
        
        //yang memberikan bentuk ke bawah
        for (int a = 5; a >= 1; a--){ 
            //yang memberikan bentuk kesamping
            for(int b = 1; b <= a; b++){             
                //output nya adalah sukuAwal sesuai bentuk yang telah dibuat
                System.out.print(sukuAwal + " " + " ");
                
                //memberikan hasil angka yang sama dengan soal
                sukuAwal += beda;
            } 
            //pemisah line
            System.out.println("");
        }
    }
}
