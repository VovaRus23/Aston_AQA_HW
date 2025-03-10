public class BowlWithFood {
    private int amountOfFood;

    public BowlWithFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getFood() {
        return amountOfFood;
    }

    public void eatFood(int amount) {
        if (amount <= amountOfFood) {
            amountOfFood -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            amountOfFood += amount;
        }
    }
}
