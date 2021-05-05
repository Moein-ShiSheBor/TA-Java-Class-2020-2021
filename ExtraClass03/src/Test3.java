import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        /**
         * Array
         */
        double[] ary = new double[5];
        for (int i=0;i<5;i++){
            ary[i] = Math.random()*10;
        }
        for (int i=0;i<5;i++){
            System.out.println(ary[i]);
        }
        /**
         * ArrayList + some methods
         * to make :
         * first ---> kind of list( here ArrayList )
         * second ---> in <> type of the List variables
         * third ---> name of List
         * forth ---> new + kind of list( here ArrayList ) + <>()
         */
        /**
         * add : to insert input in the List
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0;i<5;i++){
            numbers.add((int)(Math.random()*10));
        }
        /**
         * to print the List fully just type the name of that List
         */
        System.out.println(numbers);
        /**
         * size : number of exist variables in List
         * get : return the value of the given cell
         */
        for (int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        /**
         * use foreach in List
         */
        for (int i : numbers)
            System.out.print(i + " ");
        /**
         * remove : delete the element of the given index
         */
        numbers.remove(2);
        /**
         * isEmpty : check that List is Empty or not by return a boolean
         */
        System.out.println(numbers.isEmpty());
        System.out.println(numbers);
        /**
         * delete All of List's elements
         */
        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        /**
         * to sort a List :
         * use method 'sort' from class 'collection'
         */
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
