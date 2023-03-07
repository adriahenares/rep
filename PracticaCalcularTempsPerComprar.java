import java.util.Scanner;
public class PracticaCalcularTempsPerComprar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double preu, salari, salaridia;
        preu = keyboard.nextDouble();
        salari = keyboard.nextDouble();
        salaridia = salari / 30;
        System.out.println("En Pere ha d'estalviar durant " + calcularDies(preu, salaridia) + " dies");
    }
    public static int calcularDies(double preu, double salaridia){
        return (int) Math.round(preu / salaridia);
    }
}