import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealer
{

    public static void main(String[] args)
    {
        HashMap<String, String> cars = new HashMap();
        cars.put("Mustang", "Ford");
        cars.put("Taurus", "Ford");
        cars.put("Pilot", "Honda");
        cars.put("Civic", "Honda");
        cars.put("Accord", "Honda");
        cars.put("Pathfinder", "Nissan");
        cars.put("Altima", "Nissan");
        cars.put("4Runner", "Toyota");
        cars.put("Camry", "Toyota");
        cars.put("Corolla", "Toyota");
        cars.put("E250", "Chevy");

        Scanner input = new Scanner(System.in);
        System.out.println("What model vehicle are you looking for (i.e. civic, accord, pilot..)?");
        String user = input.nextLine();

        // System.out.println("Here is our collection of Fords: " + cars.get("Ford"));
        // }
     /*   for(Map.Entry<String, String> output : cars.entrySet())
        {
            String make = output.getKey();
            String model = output.getValue();*/
        String make = cars.get("Taurus");

            if((user.equals("Mustang")) || (user.equals("Taurus")) || (user.equals("mustang")) || (user.equals("taurus")))
            {
                System.out.println("Awesome, here are our Fords: " + make);
            }

            if((user.equals("Pilot")) || (user.equals("Civic")) || (user.equals("Accord")) || (user.equals("pilot")) || (user.equals("civic")) || (user.equals("accord")))
            {
                System.out.println("Sweet Honda!");
            }
            if((user.equals("Pathfinder")) || (user.equals("Altima")) || (user.equals("pathfinder")) || (user.equals("altima")))
            {
                System.out.println("Going for a nissan, egh?");
            }
            if((user.equals("4Runner")) || (user.equals("Camry")) || (user.equals("Corrolla")) || (user.equals("4runner")) || (user.equals("corrolla")) || (user.equals("camry")))
            {
                System.out.println("Got it, Toyota is your thing!");
            }
            if((user.equals("E250")) || (user.equals("e250")))
            {
                System.out.println("Can never go wrong iwth a Chevy.");
            }

            System.out.println("Sorry, we don't have that model right now. Enter another model and I can check for you: ");
            user = input.nextLine();
        //}

        // if(user.equals("mustang") || (user.equals("tauras")))
        // {
        // System.out.println("Mustang, alright, check out all our Fords here: " +
        // cars.get("Ford"));

    }

}
