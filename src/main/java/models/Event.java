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



    public int addPeopleCost(){
//        int group = getGroup;
        return finalCost += 100;
    }

    public int addNoPeopleCost(){
        return finalCost;
    }

    public int addFoodCost(){
//        int yummy = getYummy;
        return finalCost += 200;
    }

    public int addNoFoodCost(){
        return finalCost;

    }

    public int addBoozeCost(){
//        int drunk = getDrunk;
        return finalCost += 300;
    }

    public int addNoBoozeCost(){

        return finalCost;
    }

    public int addBandCost(){
//        int music = getBand;
        return finalCost += 300;
    }

    public int addNoBandCost(){

        return finalCost;
    }

    public int getFinalCost(){

        return finalCost;
    }

    public int addCoupon(){
        return finalCost -= 50;
    }


}
