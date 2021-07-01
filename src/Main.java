import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, resetPass, newPass;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = scanner.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else if (username.equals("patika") && !password.equals("java123")) {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (1: evet, 2: hayır) : ");
            resetPass = scanner.nextLine();

            if (resetPass.equals("1")) {
                System.out.print("Yeni şifreniz : ");
                newPass = scanner.nextLine();
                if (newPass.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    password = newPass;
                }
            }
        } else {

            System.out.println("Bilgileriniz Yanlış !");
        }
    }
}
