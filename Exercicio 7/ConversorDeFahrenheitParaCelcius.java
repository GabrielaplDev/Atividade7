import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esse programa converte uma temperatura em graus Fahrenheit para graus Celsius.\n");

        System.out.println("Informe a temperatura em graus Fahrenheit:");
        float fahrenheit = scanner.nextFloat();

        float celsius = (fahrenheit - 32) / 1.8f;
        System.out.println(fahrenheit + " graus Fahrenheit equivale a " + String.format("%.2f", celsius) + " graus Celsius.");

        scanner.close();
    }
}
