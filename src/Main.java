// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 98;
        double metre = 1.87;
        int index = service.calculate(kg, metre);
        System.out.println(index);
    }
}
