public class Dog extends Animal {

    public static int dogCounter = 0;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength >= 0 && obstacleLength <= 500) {
            System.out.println(name + " пробежал " + obstacleLength + " м.");
        } else if (obstacleLength > 500) {
            System.out.println(name + " может пробежать максимум 500 м.");
        } else {
            System.out.println(name + " не может пробежать отрицательное расстояние");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength >= 0 && obstacleLength <= 10) {
            System.out.println(name + " проплыл " + obstacleLength + " м.");
        } else if (obstacleLength > 10) {
            System.out.println(name + " может проплыть максимум 10 м.");
        } else {
            System.out.println(name + " не может проплыть отрицательное расстояние");
        }
    }

}
