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

//    public int getPeople() {
//
//        return cost;
//    }

//    public int getFood() {
//
//        return costFood;
//
//    }

//    public int getBooze() {
//
//        return costBooze;
//    }

//    public int getEntertainment() {
//
//        return costBand;
//    }

    public int getFinalCost() {
//        int finalCost = getPeople() + getFood() + getBooze() + getEntertainment();
        return finalCost;
    }

    public void addCost(int increase){
        finalCost += increase;

    }

}
