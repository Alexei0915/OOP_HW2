public class Otter extends Animal implements Speakable, Runable, SwimmingSpeedable, Flyable{

    public Otter(String nickname, int lags, String owner) {
        super(nickname, lags, owner);
    }

    @Override
    public Integer runSpeed() {
        return 3;
    }

    @Override
    public String speak() {
        return "GRrrR!";
    }

    @Override
    public Integer swimmingSpeed() {
        return 15;
    }

    @Override
    public int flySpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Otter" + super.toString();
    }
}