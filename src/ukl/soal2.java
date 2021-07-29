package ukl;
public class soal2 {
    public static void main (String[]args){
        //outer loop, pembuatan angka 1-4
        for (int i = 1; i <= 4; i++){
            //inner loop
            for (int k = 1; k <= i; k++){
                //tampilan barisan bintang
                System.out.print("*");
        }  
        //pemisah line
        System.out.println();
        }
        //outer loop (perulangan luar) membuat angka terbalik ke bawah 5-1
        for (int a = 5; a >= 1; a--){
            //untuk pemisah kebawah supaya membentuk segitiga
            System.out.println();
        //inner loop
        for(int b = 1; b <= a; b++){
            //tampilan barisan bintang
            System.out.print("*");
            
       }  
}
}
}
