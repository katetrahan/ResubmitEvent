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
                System.out.println("Cost of People: $100");
                newEvent.addPeopleCost();
            } if (peopleString.equals("no people")){
                System.out.println("Cost of People: $0");
                newEvent.addNoPeopleCost();
            } if (foodString.equals("food")) {
                System.out.println("Cost of Food: $200");
                newEvent.addFoodCost();
            } if (foodString.equals("no food")){
                System.out.println("Cost of Food: $0");
                newEvent.addNoFoodCost();
            } if (boozeString.equals("booze")) {
                System.out.println("Cost of Booze: $300");
                newEvent.addBoozeCost();
            } if (boozeString.equals("no booze")){
                System.out.println("Cost of Booze: $0");
                newEvent.addNoBoozeCost();
            } if (bandString.equals("band")){
                System.out.println("Cost of Band: $300");
                newEvent.addBandCost();
            } if(bandString.equals("no band")) {
                System.out.println("Cost of Band: $0");
                newEvent.addNoBandCost();
            }
                    System.out.println("Final Cost:");
               System.out.println(newEvent.getFinalCost());





            } catch (IOException e){
                e.printStackTrace();

            }

        }
    }
}

