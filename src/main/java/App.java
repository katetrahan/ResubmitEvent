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

                Event newEvent = new Event(peopleString);

                System.out.println(newEvent.getPeople(newEvent));


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

