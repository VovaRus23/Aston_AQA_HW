public class Cat extends Animal {

    public static int catCounter = 0;
    private boolean satiety;
    private int desiredAmountOfFood;

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    public Cat(String name, int desiredAmountOfFood) {
        super(name);
        this.satiety = false;
        this.desiredAmountOfFood = desiredAmountOfFood;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength >= 0 && obstacleLength <= 200) {
            System.out.println(name + " пробежал " + obstacleLength + " м.");
        } else if (obstacleLength > 200) {
            System.out.println(name + " может пробежать максимум 200 м.");
        } else {
            System.out.println(name + " не может пробежать отрицательное расстояние");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println(name + " не умеет плавать");
    }

    public void eatFromBowl(BowlWithFood bowl) {
        if (bowl.getFood() >= desiredAmountOfFood) {
            satiety = true;
            bowl.eatFood(desiredAmountOfFood);
            System.out.println(name + " съел желаемое количество еды. Сытость = " + satiety);
        } else {
            System.out.println(name + " остался голоден. Сытость = " + satiety);
        }
    }

}
