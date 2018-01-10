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

                Event newEvent = new Event( peopleString , foodString , boozeString, bandString);


                if(peopleString.equals("people") && foodString.equals("food") && (boozeString.equals("booze"))){
                    System.out.println(newEvent.getPeople());
                    System.out.println(newEvent.getFood());
                    System.out.println(newEvent.getBooze());

                } else {
                    System.out.println("You can throw your own event!");
                }

//
//                System.out.println(newEvent.getFood(newEvent));
//                System.out.println(newEvent.getBooze(newEvent));
//                System.out.println(newEvent.getEntertainment());


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

