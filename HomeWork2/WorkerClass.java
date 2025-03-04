import java.time.LocalDate;

public class WorkerClass {
    public static void main(String[] args) {

        Product product1 = new Product("Футбольный мяч", LocalDate.of(2007, 07, 07),
                "ООО ''Страна спорта''", "Россия", 5434.50f, true);

        // product1.showObjectInfo(); // Задание №1

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Домино", LocalDate.of(2001, 01, 01),
                "ООО ''(Не)Азартные игры''", "Хорватия", 12630.00f, false);

        productsArray[1] = new Product("Мешок картошки", LocalDate.of(2002, 02, 02),
                "ООО ''Дары Батьки''", "Беларусь", 650.12f, true);

        productsArray[2] = new Product("Швейцарский нож", LocalDate.of(2003, 03, 03),
                "ООО ''За качество отвечаем''", "Китай", 7777.77f, false);

        productsArray[3] = new Product("Шерстяной свитер", LocalDate.of(2004, 04, 04),
                "House of Gucci", "Италия", 220500.55f, false);

        productsArray[4] = new Product("Resident evil 4", LocalDate.of(2005, 05, 05),
                "Sony Inc", "Япония", 4450.00f, true);

        /*
         * for (int i = 0; i < productsArray.length; i++) {
         * productsArray[i].showObjectInfo();
         * System.out.println("-------------------------------------------");
         * }
         */ // Задание №2

        Park.Attractions attr1 = new Park().new Attractions("Американские горки", "С 9:30 до 22:30", 999.99f);
        Park.Attractions attr2 = new Park().new Attractions("Колесо обозрения", "С 10:00 до 22:00", 299.99f);
        /*
         * attr1.showAttrsInfo();
         * System.out.println("-----------------------------");
         * attr2.showAttrsInfo();
         */ // Задание №3

    }
}