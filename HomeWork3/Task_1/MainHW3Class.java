public class MainHW3Class {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Тузик");
        Dog dog2 = new Dog("Мухтар");
        Cat cat1 = new Cat("Пирожок");

        System.out.println("Всего животных - " + Animal.animalCounter + ". Из них собак - " + Dog.dogCounter
                + ", котов - " + Cat.catCounter);

        dog1.run(170);
        dog2.swim(9);
        cat1.run(123);
        cat1.swim(18);

        BowlWithFood bowl = new BowlWithFood(15);
        Cat[] cats = {
                new Cat("Сникерс", 16),
                new Cat("Сёма", 7),
                new Cat("Стёпка", 7),
                new Cat("Усатик", 4)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromBowl(bowl);
        }
    }
}
