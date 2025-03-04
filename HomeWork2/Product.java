import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private float price;
    private boolean buyerBookingStatus;

    public Product(String name,
            LocalDate productionDate,
            String manufacturer,
            String countryOfOrigin,
            float price,
            boolean buyerBookingStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.buyerBookingStatus = buyerBookingStatus;
    }

    void showObjectInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " рублей");
        System.out.println("Товар забронирован покупателем: " + buyerBookingStatus);
    }
}
