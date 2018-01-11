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

    public int getGroup = 0;

    public int getYummy = 0;

    public int getDrunk = 0;



    public int getPeopleCost(){
        int group = getGroup;
        return getGroup += 100;
    }

    public int getFoodCost(){
        int yummy = getYummy;
        return getYummy += 200;
    }

    public int getBoozeCost(){
        int drunk = getDrunk;
        return getDrunk += 300;
    }



    public int getFinalCost() {
        return finalCost;
    }

    public void addCost(int increase){
        finalCost += increase;

    }

}
