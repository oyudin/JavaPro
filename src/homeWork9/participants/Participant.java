package homeWork9.participants;

public abstract class Participant {

    private int jumpMaxCount;
    private int runMaxDistance;

    private String type;

    public Participant(int jumpMaxCount, int runMaxDistance) {
        this.jumpMaxCount = jumpMaxCount;
        this.runMaxDistance = runMaxDistance;
        type = String.valueOf(getClass());
    }

    public int run() {
        return runMaxDistance;
    }

    public int jump() {
        return jumpMaxCount;
    }


    @Override
    public String toString() {
        return "Participant{" +
                "jumpMaxCount=" + jumpMaxCount +
                ", runMaxDistance=" + runMaxDistance + type +
                '}';
    }
}
