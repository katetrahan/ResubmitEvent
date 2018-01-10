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

    public int getPeople() {
        int cost = 100;
        return cost;
    }

    public int getFood() {
        int costFood = 100;
        return costFood;

    }

    public int getBooze() {
        int costBooze = 100;
        return costBooze;
    }

    public int getEntertainment() {
        int costBand = 100;
        return costBand;
    }

    public int getFinalCost() {
        int finalCost = getPeople() + getFood() + getBooze() + getEntertainment();
        return finalCost;
    }

}
