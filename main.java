public class Main {
    public static void main(String[] args) {

        // Membuat objek akun
        BankAccount akun = new BankAccount("12345", "Mendrofa");

        // Menampilkan saldo awal
        System.out.println("Saldo awal: " + akun.getBalance());

        // Test deposit (benar)
        akun.deposit(500000);

        // Test deposit (salah - negatif)
        akun.deposit(-100);

        // Test withdraw (benar)
        akun.withdraw(200000);

        // Test withdraw (saldo tidak cukup)
        akun.withdraw(1000000);

        // Menampilkan saldo akhir
        System.out.println("Saldo akhir: " + akun.getBalance());
    }
}