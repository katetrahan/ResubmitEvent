import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class App {
    public static void main(String[] args) {
        boolean party = true;

        while(party){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Type 'people' or 'no people'");
                String peopleString = bufferedReader.readLine();
                System.out.println("Type 'food' or 'no food'");
                String foodString = bufferedReader.readLine();
                System.out.println("Type 'booze' or 'no booze'");
                String boozeString = bufferedReader.readLine();
                System.out.println("Type 'band' or 'no band'");
                String bandString = bufferedReader.readLine();

                Event newEvent = new Event(peopleString, foodString, boozeString, bandString);


            if (peopleString.equals("people")) {
                System.out.println("Cost of People:");
                System.out.println(newEvent.getPeopleCost());
            } if (peopleString.equals("no people")){
                System.out.println("Cost of People:");
                System.out.println(newEvent.getNoPeopleCost());
            } if (foodString.equals("food")) {
                    System.out.println("Cost of Food:");
                    System.out.println(newEvent.getFoodCost());
            } if (foodString.equals("no food")){
                System.out.println("Cost of Food:");
                System.out.println(newEvent.getNoFoodCost());
            } if (boozeString.equals("booze")) {
                    System.out.println("Cost of Booze:");
                    System.out.println(newEvent.getBoozeCost());
            } if (boozeString.equals("no booze")){
                    System.out.println("Cost of Booze:");
                System.out.println(newEvent.getNoBoozeCost());
            } if (bandString.equals("band")){
                System.out.println("Cost of Band:");
                System.out.println(newEvent.getBandCost());
            } if(bandString.equals("no band")) {
                    System.out.println("Cost of Band:");
                    System.out.println(newEvent.getNoBandCost());
                    System.out.println("Final Cost:");
            }   System.out.println(newEvent.getFinalCost());





            } catch (IOException e){
                e.printStackTrace();

            }

        }
    }
}

