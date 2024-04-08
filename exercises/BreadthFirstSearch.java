package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    static HashMap<String, String[]> friends = new HashMap<String, String[]>();

    public static void main(String[] args) {
        /* Customise the below Friends and their Networks to see how Breadth-First Search checks
        for the shortest path to a Mango Seller, if one exists */

        // Names with 'M' at the end are Mango Sellers
        String[] adamsFriends = { "Brian", "Connie", "Dylan" };
        String[] briansFriends = { "Adam", "CharlesM", "DevangM" };
        String[] conniesFriends = { "Adam", "Dylan", "ErinM" };
        String[] dylansFriends = { "Adam", "BruceM", "Connie" };

        friends.put("Adam", adamsFriends);
        friends.put("Brian", briansFriends);
        friends.put("Connie", conniesFriends);
        friends.put("Dylan", dylansFriends);

        // Change personName to adjust the graph's starting node!
        searchNetworkForMangoSeller("Adam");
    }

    private static boolean searchNetworkForMangoSeller(String personName) {
        Queue<String> searchQueue = new LinkedList<>();
        ArrayList<String> previouslyInspectedNames = new ArrayList<>();

        if (friends.containsKey(personName)) {
            for (String name : friends.get(personName)) searchQueue.add(name);
        }

        while (!searchQueue.isEmpty()) {
            String name = searchQueue.remove();
            if (!previouslyInspectedNames.contains(name)) {
                if (name.charAt(name.length() - 1) == 'M') {
                    System.out.println(name + " is a Mango Seller!");
                    return true;
                } else {
                    previouslyInspectedNames.add(name);
                    if (friends.containsKey(name)) {
                        for (String friendName : friends.get(name)) searchQueue.add(friendName);
                    }
                }
            }
        }
        
        System.out.println("There are no Mango Sellers in " + personName + "'s network...");
        return false;
    }
}
