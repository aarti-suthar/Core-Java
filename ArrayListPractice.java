import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args){

        //Arraylist can be declared using either of the following syntax
        //Default constructor, created an empty arraylist with an initial capacity of 10
        //ArrayList<Integer> list = new ArrayList<>();

        List<Integer> list = new ArrayList();

        //creating an arraylist with a specified initial capacity
        ArrayList<String> listWithCapacity = new ArrayList<>(20);

        //creating an arraylist from another collection
        List<String> anotherList = Arrays.asList("Apple", "Mango", "Banana");
        ArrayList<String> listFromCollection = new ArrayList<>(anotherList);

        //Add element into the array list
        list.add(1); //0th index
        list.add(5); //1st index
        list.add(80); //2nd index

        System.out.println(list);
        //insert an element 50 in arraylist at index
        //it will add the element 50 at 2nd index and shifts the existing element 80
        //to 1 position int the right direction
        list.add(2, 50);
        System.out.println(list);

        //it will replace the element at index 2 with 50
        list.set(2, 50);
        System.out.println(list);



        //Get the element from the array which exists at index2
        System.out.println(list.get(2));

        //This line will give Index out of bound error
        //because there is no element in array list at index 3
        System.out.println(list.get(3));

        //iterate through an array list using for loop
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //iterate through array using for each loop
        for(int x: list){
            System.out.println(x);
        }

        //contains() method is used to check the existence of am element in the array list
        System.out.println(list.contains(5)); //returns true if the element exists
        System.out.println(list.contains(50)); //return false if the element does not exist


    }
}
