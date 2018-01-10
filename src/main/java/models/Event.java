package models;

public class Event {
    private String people;
    private String food;
    private String booze;
    private String entertainment;

    public Event(String people, String food, String booze, String entertainment) {
        this.people = people;
        this.food = food;
        this.booze = booze;
        this.entertainment = entertainment;

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

//
//    public String getEntertainment(Event entertainment) {
//        Integer costBand = 0;
//        if (entertainment.entertainment.equals("band")) {
//            costBand = 100;
//        } else {
//            costBand = 0;
//        }
//        return costBand;
//    }
}
