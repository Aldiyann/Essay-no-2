
public class Array {
    public static void main(String[] args) {
        //inisialisasi data kamar
        char[][] kamar = {
            {'*','*','*','X','*'},
            {'*','*','*','*','*'},
            {'*','*','*','*','*'},
            {'*','*','*','X','*'},
        };
        
        //isi 2 kamar dengan tamu
        kamar[0][3] = 'X';
        kamar[3][4] = 'X';
        
        //hitung jumlah kamar yg kosong
        int jumlahkamarkosong = 0;
        for (int lantai = 0;lantai < 4; lantai++) {
            for (int nomorkamar = 0;nomorkamar < 5; nomorkamar++){
                if (kamar[lantai] [nomorkamar] == '*') {
                    jumlahkamarkosong++;
                }
            }
    }
        System.out.println("jumlah kamar yang kosong adalah" + jumlahkamarkosong + "kamar");
    }
}
