package app;

import java.util.ArrayList;
import java.util.List;

//create abstract BubbleSort class

public abstract class BubbleSort {

    private static List<String> sortName = new ArrayList<String>();
    private static List<Double> sortPrice = new ArrayList<Double>();
    private static List<String> sortPriority = new ArrayList<String>();
    private static List<Integer> sortQuantity = new ArrayList<Integer>();

    public static List<Double> sort(List<Double> num) {
        Bucket buck = new Bucket(); // access Bucket class
        sortName = buck.getNameArrayList(); // access NameArray
        sortPriority = buck.getPriorityArrayList();
        sortQuantity = buck.getQuantityArrayList();

        int j;
        boolean flag = true; // set flag to true to begin first pass
        double tempPrice; // holding variable for prices
        int tempQuantity; // holding variable for priority
        String tempName; // holding variable for name
        String tempPriority;

        while (flag) {
            flag = false; // set flag to false awaiting a possible swap
            for (j = 0; j < num.size() - 1; j++) {
                if (num.get(j) > num.get(j + 1)) // change to > for ascending
                                                 // sort
                {
                    tempPrice = num.get(j); // swap elements
                    tempQuantity = sortQuantity.get(j);
                    tempName = sortName.get(j);
                    tempPriority = sortPriority.get(j);
                    num.set(j, num.get(j + 1));
                    sortPriority.set(j, sortPriority.get(j + 1));
                    sortName.set(j, sortName.get(j + 1)); // = name.get[j+1];
                    sortQuantity.set(j, sortQuantity.get(j + 1));
                    num.set(j + 1, tempPrice);
                    sortPriority.set(j + 1, tempPriority);
                    sortName.set(j + 1, tempName); // = temp3;
                    sortQuantity.set(j + 1, tempQuantity);
                    flag = true; // shows a swap occurred
                }
            }
        }

        return num;
    }

    public List<String> getSortedPriorityArray() { // only way to access array
                                                   // within this class
        return sortPriority;
    }

    public List<String> getSortedNameArray() { // only way to access array
                                               // within this class
        return sortName;
    }

    public List<Integer> getSortedQtyArray() { // only way to access array
                                               // within this class
        return sortQuantity;
    }

    public List<Double> getSortedPriceArray() { // only way to access array
                                                // within this class
        return sortPrice;
    }

}