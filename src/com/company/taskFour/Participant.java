package com.company.taskFour;

public class Participant implements Comparable <Participant> {
    public Participant(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private int time;

    @Override
    public int compareTo(Participant p) {
        if (this.getTime() > p.getTime()){
            return 1;
        } else if (this.getTime() < p.getTime()){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return name +" - " + time;
    }
}
