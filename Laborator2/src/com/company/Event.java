package com.company;

public class Event {
    private String name;
    private int size;
    private int startTime;
    private int endTime;

    public Event() { }

    public Event(String newName, int newSize, int newStart, int newEnd) {
        this.name = newName;
        this.size = newSize;
        this.startTime = newStart;
        this.endTime = newEnd;
    }

    public String getName() {
        return name;
    }

    public int getSize(){
        return this.size;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setName(String name) { this.name = name; }

    public void setSize(int size) { this.size = size; }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
