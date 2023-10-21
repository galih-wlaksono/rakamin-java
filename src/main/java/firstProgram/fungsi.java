package firstProgram;

import contoh.result;

public class fungsi {
    public static void main(String[] args){
        int x = 4;
        int y = 8;
        int z = 14;
        int v = 8;

        Namaku.Indah("Wawan");
        Namaku.Indah("Sarbini");
        Namaku.Indah("Aung Aung");

        result.printNama("Beda indung bapa");
        result.printNama("Beda indung bapa");

        tambah(x,z);
        tambah(x,y);
        tambah(y,z);
        tambah(z,v);
    }

    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println(" Hasil tambah "+a+" dan "+b+" adalah : "+hasilTambah);
        return hasilTambah;
    }
}
