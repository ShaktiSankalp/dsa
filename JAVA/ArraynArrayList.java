import java.util.*;

public class ArraynArrayList {
    
public static void main(String[] args){

    String[] veggie = new String[4];
    int[] roll  = {11,12,13,14};

    ArrayList<String> veggieList = new ArrayList<>();
    ArrayList<Integer> rollList 
    = new ArrayList<>( Arrays.asList(11,12,13,14));

    //get the value
    System.out.println(roll[2]);
    System.out.println(rollList.get(2));

    //set the value
    veggie[0] = "Pyaaz";
    //veggieList.set(0,"Pyaaz");  cant set index 0 asit dossent exist in the empty arraylist
    veggieList.add("Pyaaz");
    veggieList.add("LAssan");

    System.out.println(veggie[0]);
    System.out.println(veggieList.get(0));


    //finding the size
    System.out.println(veggie.length);
    System.out.println(veggieList.size());

    //removing element
    //in array haveto do manual shifting

    rollList.remove(2);
    rollList.remove(Integer.valueOf(12));
    System.out.println(rollList);
    System.out.println(roll);


    Collections.sort(veggieList);
    Collections.sort(rollList);
    System.out.println(veggieList);
    System.out.println(rollList);
    //veggieList.clear(); deletes all indexes and their elements
    
    

}

}
