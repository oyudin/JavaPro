package homeWork9.participants;

public class Cat extends Participant{

    public Cat(int jumpMaxCount, int runMaxDistance) {
        super(jumpMaxCount, runMaxDistance);
    }

    @Override
    public int run() {
        return super.run();
    }

    @Override
    public int jump() {
        return super.jump();
    }
}
