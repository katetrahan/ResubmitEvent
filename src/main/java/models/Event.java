package models;

public class Event {
    private String people;
    private String food;
    private String booze;
    private String entertainment;
//    private String finalCost;

    public Event(String people, String food, String booze, String entertainment) {
        this.people = people;
        this.food = food;
        this.booze = booze;
        this.entertainment = entertainment;
//        this.finalCost = finalCost;

    }

    public Integer getPeople() {
        Integer cost = 100;
        return cost;
    }

    public Integer getFood() {
        Integer costFood = 100;
        return costFood;

    }

    public Integer getBooze() {
        Integer costBooze = 100;
        return costBooze;
    }

    public Integer getEntertainment() {
        Integer costBand = 100;
        return costBand;
    }

//    public Integer getFinalCost(){
//
//    }
//}
}
