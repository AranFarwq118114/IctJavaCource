public class MyClass {
    public static void main(String[] args) {

        // ama code Wed 12/3/2025

        System.out.println("Welcome to ICT.");

        System.out.println("Aran\nRami\nHama");

        System.out.println(8 + "\n" + 88 + "\n" + 888 + "\n" + 8888 + "\n" + 88888);

        System.out.println(8 + 8);

        // ama code bakar det bo jwt krdny 2 naw wak First Name u Last Name

        String firstName = "Yad";

        String lastName = "Ali";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // ama code bakar det bo kokrdnawa(+) w lekdany(*) zhma

        int sum1 = 100 + 50;

        int sum2 = sum1 + 250;

        int sum3 = sum2 + sum2;

        System.out.println(sum1);

        System.out.println(sum2);

        System.out.println(sum3);

        // ama codey Agar w wahaya (if and else)

        int mynumber = 11;

        if (mynumber == 10) {

            System.out.println("The number an even");

        } else {

            System.out.println("The number is odd");
        }

        if (mynumber % 2 == 10) {
            System.out.println("The number an even");

        } else {

            System.out.println("The number is odd");
        }

        // ama codey Switch & Case

        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }

        // ama codey While

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // ama codey Do While

        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 5);

        // ama codey For

        for (int y = 0; y < 10; y++) {
            System.out.println(y);
        }

        // ama codey loop w agara
        for (int y = 0; y <= 10; y = y + 2) {
            System.out.println(y);
        }

    }

}
