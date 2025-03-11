public class MainClassHW4 {
    public static void main(String[] args) {
        String[][] arr1 = {
                { "1", "6", "8", "14" },
                { "15", "18", "77", "89" },
                { "93", "51", "13", "19" },
                { "88", "96", "11", "44" }
        };
        String[][] arr2 = {
                { "1", "6", "8", "14", "33", "16" },
                { "15", "18", "77", "89", "2", "13" },
        };

        String[][] arr3 = {
                { "1", "3", "8", "14" },
                { "15", "18", "oL", "89" },
                { "str", "51", "13", "19" },
                { "88", "96", "11", "__" }
        };
        try {
            try {
                int checkSum = transformativeMethod(arr1); // arr2 и arr3
                System.out.println("Сумма всех элементов массива: " + checkSum);
            } catch (MyArraySizeException e) {
                System.out.println("Допустимый размер массива - 4х4!");
            }
        } catch (MyArrayDataException e) {
            System.out.println(
                    "Не удалось преобразовать элемент массива. Ячейка №[" + (e.i + 1) + "]" + "[" + (e.j + 1) + "]"
                            + " соджержит некорректные данные");
        }
        System.out.println("------------------------------------------------------------------");

        int[][] arr4 = new int[5][5];
        try {
            System.out.println(arr4[7][0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
        }

    }

    public static int transformativeMethod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}