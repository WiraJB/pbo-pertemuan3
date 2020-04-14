package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Trimakasih pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case'B':
                System.out.println("Mhs   : \"Kasih A kawa lah pak nanggung banar\"");
                System.out.println("Dosen : \"Behapal\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"loh knapa C ulun pa\"");
                System.out.println("Dosen : \"Maaf Anda Kurang Beruntung\"");
                break;
            default:
                System.out.println("Mhs   : \"Haaaaah knapa nilai saya begini...kan saya slalu hadir dan ngrjakan tugas\"");
                System.out.println("Dosen : \"Oh ya tunggu bentar\"");
                System.out.println("Dosen : \"*memeriksa\"");
                System.out.println("Mhs   : \"Tapi Boong....Hiya hiya hiya...*Kabur..\"");
                break;
        }
    }
}
