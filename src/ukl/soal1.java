package ukl;
public class soal1 {
    public static void main (String[]args){
    //nilai suku pertama
    int sukuPertama = 3;
    //nilai beda
    int selisih = 5;
    //jumlah suku
    int jumlahSuku = 10;
    //deklarasi variabel untuk menghitung jumlah deret aritmatika
    int jumlahDeretAritmatika = 0;
    //perhitungan suku pertama
    int sukuSaatIni = sukuPertama;
    
    //perulangan suku 
    for(int i = 1 ; i <= jumlahSuku ; i++){
        //output suku ke-n
        System.out.println("U" + i+" = "+ sukuSaatIni);
        //menghitung jumlah tiap suku (Un)
        jumlahDeretAritmatika +=sukuSaatIni;
        //mengubah suku sekarang ke suku berikutnya karena adanya selisih
        sukuSaatIni += selisih;
    }
        //output jumlah deret (Sn)
        System.out.println("Jumlah deret aritmatika : " + jumlahDeretAritmatika);
}
}
