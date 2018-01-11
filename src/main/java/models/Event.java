package models;

public class Event {
    private String people;
    private String food;
    private String booze;
    private String entertainment;
    private int finalCost;
    private int lamePartyCost;

    public Event(String people, String food, String booze, String entertainment) {
        this.people = people;
        this.food = food;
        this.booze = booze;
        this.entertainment = entertainment;
        finalCost = 0;
        lamePartyCost =0;

    }

//    public int getGroup = 0;
//
//    public int getYummy = 0;
//
//    public int getDrunk = 0;
//
//    public int getBand = 0;



    public int getPeopleCost(){
//        int group = getGroup;
        return finalCost += 100;
    }

    public int getNoPeopleCost(){
        return lamePartyCost;
    }

    public int getFoodCost(){
//        int yummy = getYummy;
        return finalCost += 200;
    }

    public int getNoFoodCost(){
        return lamePartyCost;

    }

    public int getBoozeCost(){
//        int drunk = getDrunk;
        return finalCost += 300;
    }

    public int getNoBoozeCost(){
        return lamePartyCost;
    }

    public int getBandCost(){
//        int music = getBand;
        return finalCost += 300;
    }

    public int getNoBandCost(){
        return lamePartyCost;
    }

    public int getFinalCost(){
        return finalCost;
    }

    public void addCost(int increase){
        finalCost += increase;

    }

}
