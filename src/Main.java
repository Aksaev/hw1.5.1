public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ. Массивы Часть 1");
        hw_task1();
        hw_task2();
//        hw_task3();
//        hw_task4();
    }

    // Задача 1
    public static void hw_task1() {
        System.out.println("Задача 1");

        int[] intArr = {1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        long[] longArr = {17, 27, 13};

        System.out.println("Три массива объявлены");
        System.out.println("----------");
    }

    // Задача 2
    public static void hw_task2() {
        System.out.println("Задача 2");

        int[] intArr = {1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        long[] longArr = {17, 27, 13};


        for (int i = 0; i < intArr.length; i++) {
//            if (i > 0) {
//                intArr[i] = i + 1;
//                System.out.print(", ");
//            }
            System.out.print(intArr[i]);
        }
        System.out.println();

        for (int i = 0; i < doubleArr.length; i++) {
//            if (i > 0) {
//                doubleArr[i] = i + 1;
//                System.out.print(", ");
//            }
            System.out.print(doubleArr[i]);
        }
        System.out.println();

        for (int i = 0; i < longArr.length; i++) {

            if (i > 0) {
                longArr[i] = i + 1;
                System.out.print(", ");
            }
            System.out.print(longArr[i]);
        }
        System.out.println("\n----------");
    }

    // Задача 3
    public static void hw_task3() {
        System.out.println("Задача 3");

        int[] intArr = {1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        long[] longArr = {17, 27, 13};

        for (int i = intArr.length - 1; i >= 0; i--) {
            if (intArr.length - 1 > i) {
                intArr[i] = i + 1;
                System.out.print(", ");
            }
            System.out.print(intArr[i]);
        }
        System.out.println();
    }

    // Задача 4
    public static void hw_task4() {
        System.out.println("Задача 4");

        int[] intArr = {1, 2, 3};

        for (int i = 0; i < intArr.length; i++) {

            if (i > 0) {
                intArr[i] = i + 1;
                System.out.print(", ");
            }

            if (intArr[i] % 2 != 0) {
                intArr[i] = intArr[i] + 1;
            }

            System.out.print(intArr[i]);
        }
        System.out.println("----------");
    }
}
