package com.company.taskFour;

import java.util.Arrays;

public class Maraphon {
    String names[] = {"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
    int time[] = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
    private Participant[] participants;

    public void run() {
        this.createParticipant();
        this.orderParticipant();
    }

    private void createParticipant() {
        participants = new Participant[time.length];
        for (int i=0; i<time.length; i++){
            participants[i] = new Participant(names[i],time[i]);
        }
    }

    private void orderParticipant () {

        Arrays.sort(participants);
        System.out.println("Ordered list:");
        for (int i=0; i<participants.length; i++){
            System.out.println(participants[i]);
        }
    }
}
