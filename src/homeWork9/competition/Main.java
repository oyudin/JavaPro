package homeWork9.competition;

import homeWork9.competition.barier.Barrier;
import homeWork9.competition.barier.Treadmill;
import homeWork9.competition.barier.Wall;
import homeWork9.participants.Cat;
import homeWork9.participants.Human;
import homeWork9.participants.Participant;
import homeWork9.participants.Robot;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Robot(100, 100),
                new Human(0, 60),
                new Cat(10, 0)};

        Barrier[] barriers = {new Wall(10), new Treadmill(10)};

        for (Participant participant : participants) {
            for (Barrier barrier : barriers) {
                if (!barrier.overcome(participant)) break;
            }
        }
    }
}
