package homeWork9.participants;

public class Human extends Participant{

    public Human(int jumpMaxCount, int runMaxDistance) {
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
