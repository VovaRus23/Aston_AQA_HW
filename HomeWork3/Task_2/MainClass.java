public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle(12, "Синий", "Красный");
        Rectangle rectangle = new Rectangle(8, 6, "Жёлтый", "Фиолетовый");
        Triangle triangle = new Triangle(6, 7, 8, "Зелёный", "Коричневый");

        circle.showInfoAboutCircle();
        System.out.println("---------------------------");
        rectangle.showInfoAboutRectangle();
        System.out.println("---------------------------");
        triangle.showInfoAboutRectangle();
    }
}
