package homeWork9.competition.barier;

import homeWork9.participants.Participant;

public class Wall extends Barrier {

    private int hight;

    public Wall(int high) {
        this.hight = high;
    }

    @Override
    public boolean overcome(Participant participant) {

        if (hight > participant.jump()) {
            System.out.println(participant + " The wall is too high. You lose.");
            return false;
        }
        System.out.println(participant + " You've passed the wall");
        return true;
    }
}
//
//    @Override
//    public boolean overcome(Participant participant) {
////
////        if (hight < participant.jump()) {
////          return participant + " ";
////        } else return participant + " ";
////    }
//}

