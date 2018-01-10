package models;

public class Event{
    private String people;
    private String food;
    private String booze;
    private String entertainment;

    public Event (String people, String food, String booze, String entertainment){
        this.people = people;
        this.food = food;
        this.booze = booze;
        this.entertainment = entertainment;

    }

    public Integer getPeople(Event people){
        Integer cost = 0;
        if (people.people.equals("people")){
            cost = 100;
        } else {
            cost = 0;
        }
        return cost;
    }

    public Integer getFood(Event food){
        Integer costFood = 0;
        if (food.food.equals("food")){
            costFood = 100;
        } else {
            costFood = 0;
        }
        return costFood;

    }

    public String getBooze(){
        return "";
    }

    public String getEntertainment(){
        return "";
    }
}
