package latihan3;

public class AkunBank {
        private int saldo;
    
        public AkunBank(int saldo) {
            this.saldo = saldo;
        }
    
        public void simpanUang(int jumlah) {
            saldo += jumlah;
            System.out.println("Simpan uang: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + saldo);
            System.out.println(); 
        }
    
        public void ambilUang(int jumlah) {
            if (jumlah > saldo) {
                System.out.println("Saldo tidak cukup");
            } else {
                saldo -= jumlah;
                System.out.println("Ambil uang: Rp. " + jumlah);
                System.out.println("Saldo saat ini: Rp. " + saldo);
                System.out.println(); 
            }
        }
    
        public void cekSaldo() {
            System.out.println("Saldo saat ini: Rp. " + saldo);
            System.out.println(); 
        }
    
        public static void main(String[] args) {
            AkunBank akun = new AkunBank(100000);
            System.out.println("Selamat Datang di Bank ABC");
            System.out.println(); 
            akun.cekSaldo();
            akun.simpanUang(500000);
            akun.ambilUang(150000);
        }
    }
