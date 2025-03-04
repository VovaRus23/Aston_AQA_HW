public class Park {
    public class Attractions {
        private String name;
        private String workingTime;
        private float price;

        public Attractions(String name, String workingTime, float price) {
            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }

        void showAttrsInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingTime);
            System.out.println("Цена за билет: " + price + " рублей");
        }
    }
}
