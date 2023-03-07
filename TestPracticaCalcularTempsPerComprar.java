public class TestPracticaCalcularTempsPerComprar {
    public static void main(String[] args) {
        if (PracticaCalcularTempsPerComprar.calcularDies(1345.0, 900 / 30) == 45){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (PracticaCalcularTempsPerComprar.calcularDies(4500.0, 1273.24 / 30) == 106){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (PracticaCalcularTempsPerComprar.calcularDies(1345.0, 900 / 30) == 50){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
