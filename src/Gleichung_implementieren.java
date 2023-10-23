import java.util.Scanner;
public class Gleichung_implementieren {
    public static void main(String[] args) {
        double x = 4.0;
        double ergebnis = 3 * x * x - 8 * x + 4;
        System.out.println("Bei x = " + x + " ergibt die Gleichung den Wert " + ergebnis);
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie den Wert für x ein: ");
        x = input.nextDouble();
        ergebnis = 3 * x * x - 8 * x + 4;
        System.out.println("Bei x = " + x + " ergibt die Gleichung den Wert " + ergebnis);
        input.close();

    }

}
