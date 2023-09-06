// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(mojnoIdtiGulyati(11,15));
        System.out.println(mojnoIdtiGulyati(11,15));
        System.out.println(mojnoIdtiGulyati(11,15));
        System.out.println(mojnoIdtiGulyati(11,15));
        System.out.println(mojnoIdtiGulyati(11,15));
    }

    public static String mojnoIdtiGulyati(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > -20 && temperature < 30) {
            return "можно идти гулять ";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return"Оставайтесь дома ";
        }
    }
}