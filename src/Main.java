import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kenar1,kenar2;
        double hipotenus;

        System.out.print("Birinci Kenarı Giriniz : ");
        kenar1 = input.nextInt();

        System.out.print("İkinci Kenarı Giriniz : ");
        kenar2 = input.nextInt();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.println("Üçgeninizin Hipotenüsü : " + hipotenus);
    }
}
