import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kullanıcıdan üç kenar uzunluğunu iste
        System.out.println("Üçgenin ilk kenar uzunluğunu giriniz:");
        double a = scanner.nextDouble();

        System.out.println("Üçgenin ikinci kenar uzunluğunu giriniz:");
        double b = scanner.nextDouble();

        System.out.println("Üçgenin üçüncü kenar uzunluğunu giriniz:");
        double c = scanner.nextDouble();

        // üçgenin alanını hesapla
        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // sonucu ekrana yazdır
        System.out.println("Üçgenin alanı: " + alan);
    }
}

