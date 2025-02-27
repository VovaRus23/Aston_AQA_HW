public class HomeWork1 {
    public static void main(String[] args) {
        // printThreeWords();
        // checkSumSigh(40, 41);
        // printColor(23);
        // compareNumbers(117, 116);
        // sumTwoNumbers(14, 7);
        // posOrNegNumb_1(-100500);
        // posOrNegNumb_2(5555);
        // strAndNumb(5, "I won't skateboard in hallway and ruin school property");
        // System.out.println(leapYearOrNo(2019));
        // changeNumb();
        // bringOutHundred();
        // lessSixTimesTwo();
        // twoDimensionalArray();
        // finalTask(7, 23);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSigh(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else if (100 < value) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void sumTwoNumbers(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void posOrNegNumb_1(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static void posOrNegNumb_2(int numb) {
        if (numb < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void strAndNumb(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYearOrNo(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void changeNumb() {
        int[] arr = { 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }

    public static void bringOutHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public static void lessSixTimesTwo() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void twoDimensionalArray() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void finalTask(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }

}
