package operator;

public class OperatorUnary {
    public static void main(String[] args){
        int i = 0;
        i++;                    //i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);  //betulkan i nilainya 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang di tambahkan lagi menjadi 2
        System.out.println(i);  //tuh betulkan i nilainya 2
        i=i+1;                  //bisa di lihat i++ sama dengan i = i+1
        System.out.println(i);  // i tadi 2 sekarang jadi 3

        i+=5; // sama dengan i = i+5
        System.out.println(i);
        i*=5; //sama dengan i = i*5
        System.out.println(i);
        i*=5;
        System.out.println(i);

    }
}
