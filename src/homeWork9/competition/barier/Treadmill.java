package homeWork9.competition.barier;

import homeWork9.participants.Participant;

public class Treadmill extends Barrier {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {

        if (length > participant.run()) {
            System.out.println(participant + " The distance is too big. You lose.");
            return false;
        }
        System.out.println(participant + " Run the distance");
        return true;
    }
}


