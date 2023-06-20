// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.

        Car car = new Car ("Orange", "sedan",  4);
        Car car1 = new Car ("White", "minivan",  5);
        Car car2 = new Car ("AppleGreen", "coupe",  2);
        Car car3 = new Car ("Orange", "minivan",  6);

        System.out.println(car.getCarColor());
        System.out.println(car1.getCarColor());

        System.out.println(car == car1);
        System.out.println(car.equals(car1));
        System.out.println(car.equals(car2));
        System.out.println(car.equals(car3));

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


    }



}


