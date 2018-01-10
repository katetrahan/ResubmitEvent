package models;

public class Event {
    private String people;
    private String food;
    private String booze;
    private String entertainment;
    private int finalCost;

    public Event(String people, String food, String booze, String entertainment) {
        this.people = people;
        this.food = food;
        this.booze = booze;
        this.entertainment = entertainment;
        finalCost = 0;

    }


    public int getFinalCost() {
        return finalCost;
    }

    public void addCost(int increase){
        finalCost += increase;

    }

}
