package ukl;
public class soal4B {
    public static void main (String[]args){
        //deklarasi variabel soal 4B
        int beda = 5;
        int sukuAwal = 5;
        
        //pembuatan bentuk segitiga
        //yang bentuk ke bawah
        for (int a = 1; a <= 4; a++){
            //membentuk ke samping
            for(int b = 1; b <= a; b++){
                //output nya adalah sukuAwal sesuai bentuk yang telah dibuat
                System.out.print(sukuAwal + " " + " ");
                
                //memberikan hasil angka yang sama dengan soal
                sukuAwal += beda;
            }           
            //pemisah line
            System.out.println(" ");
        }
    }
}
