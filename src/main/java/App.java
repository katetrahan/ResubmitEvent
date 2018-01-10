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

                System.out.println(newEvent.getPeople(newEvent));
                System.out.println(newEvent.getFood(newEvent));
                System.out.println(newEvent.getBooze(newEvent));
                System.out.println(newEvent.getEntertainment());


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

