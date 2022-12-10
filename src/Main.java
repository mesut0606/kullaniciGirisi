import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, sifre;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız:");
        userName = input.nextLine();

        System.out.println("Şifreniz:");
        sifre = input.nextLine();

        if (userName.equals("Mesut") && sifre.equals("1234")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Şifrenisiz hatalı sıfırlansın mı? (E/H)");
            String cevap = input.nextLine();
            if (cevap.equals("E")) {
                System.out.println("Yeni bir şifre giriniz.");
                String yenisifre = input.nextLine();
                if (!yenisifre.equals("1234")) {
                    System.out.println("Şİfreniz yeni şifre ile değiştirildi.");
                } else {
                    System.out.println("Yeni şifreniz eski şifrenizden farklı olmalıdır.");
                }
            }
        }
    }
}