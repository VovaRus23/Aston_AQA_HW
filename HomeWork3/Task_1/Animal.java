public class Animal {

    public static int animalCounter = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }

    public void run(int obstacleLength) {
        if (obstacleLength >= 0) {
            System.out.println(name + " пробежал " + obstacleLength + " метров");
        } else {
            System.out.println(name + " не может пробежать отрицательное расстояние");
        }
    }

    public void swim(int obstacleLength) {
        if (obstacleLength >= 0) {
            System.out.println(name + " проплыл " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не может проплыть отрицательное расстояние");
        }
    }

}