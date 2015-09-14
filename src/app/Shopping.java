package app;

import java.util.HashMap;
import java.util.Map;

public class Shopping {

    private double totalPurchase;

    private Map<String, Double> listPurchasedItems = new HashMap<String, Double>();
    private Map<String, Double> listNotPurchasedItems = new  HashMap<String, Double>();
    
    //Create shopping cart to host items in priority and make final purchase
    public void shop(Double bankAccount) {

        //create class objects to access their methods
        Inventory inv = new Inventory();
        Bucket buck = new Bucket();

        double total = 0.00;
        totalPurchase = 0.00;

        int count = 0;

        for (int h = 0; h < 7; h++) {
            if (buck.getPriority(h).equalsIgnoreCase("High")) {
                total += (buck.getPrice(h) * buck.getQuantity(h));

                if (total <= bankAccount) {
                    count++;
                    totalPurchase += buck.getPrice(h) * buck.getQuantity(h);
                    
                    String purchasedItem = buck.getName(h);
                    System.out.printf("Congratulations! You've purchased a %s. \n", purchasedItem);
                    listPurchasedItems.put(purchasedItem, buck.getPrice(h));

                    //take inventory items out by name from list
                    inv.setName(h, buck.getName(h));										//takes out of bucket location h, and puts into location h into inventory by name
                    buck.setName(h, " ");

                    //take inventory items out by prices from list
                    inv.setPrice(h, buck.getPrice(h));										//takes out of bucket location h, and puts into location h into inventory by price
                    buck.setPrice(h, 0.00);

                    inv.setPriority(h, buck.getPriority(h));								//takes out of bucket location h, and puts into location h into inventory by priority
                    buck.setPriority(h, " ");

                    inv.setQuantity(h, buck.getQuantity(h));								//takes out of bucket location h, and puts into location h into inventory by quantity
                    buck.setQuantity(h, 0);

                } else {
                    total -= (buck.getPrice(h) * buck.getQuantity(h));
                }
            }
        }

        for (int h = 0; h < 7; h++) {
            if (buck.getPriority(h).equalsIgnoreCase("Medium")) {
                total += (buck.getPrice(h) * buck.getQuantity(h));

                if (total <= bankAccount) {
                    count++;
                    totalPurchase += buck.getPrice(h) * buck.getQuantity(h);

                    String purchasedItem = buck.getName(h);
                    System.out.printf("Congratulations! You've purchased a %s. \n", purchasedItem);
                    listPurchasedItems.put(purchasedItem, buck.getPrice(h));

                    //take inventory items out by name from list
                    inv.setName(h, buck.getName(h));										//takes out of bucket location h, and puts into location h into inventory by name
                    buck.setName(h, " ");

                    //take inventory items out by prices from list
                    inv.setPrice(h, buck.getPrice(h));										//takes out of bucket location h, and puts into location h into inventory by price
                    buck.setPrice(h, 0.00);

                    inv.setPriority(h, buck.getPriority(h));								//takes out of bucket location h, and puts into location h into inventory by priority
                    buck.setPriority(h, " ");

                    inv.setQuantity(h, buck.getQuantity(h));								//takes out of bucket location h, and puts into location h into inventory by quantity
                    buck.setQuantity(h, 0);

                } else {
                    total -= (buck.getPrice(h) * buck.getQuantity(h));
                }
            }
        }

        for (int h = 0; h < 7; h++) {
            if (buck.getPriority(h).equalsIgnoreCase("Low")) {
                total += (buck.getPrice(h) * buck.getQuantity(h));

                if (total <= bankAccount) {
                    count++;
                    totalPurchase += buck.getPrice(h) * buck.getQuantity(h);

                    String purchasedItem = buck.getName(h);
                    System.out.printf("Congratulations! You've purchased a %s. \n", purchasedItem);
                    listPurchasedItems.put(purchasedItem, buck.getPrice(h));

                    //take inventory items out by name from list
                    inv.setName(h, buck.getName(h));										//takes out of bucket location h, and puts into location h into inventory by name
                    buck.setName(h, " ");

                    //take inventory items out by prices from list
                    inv.setPrice(h, buck.getPrice(h));										//takes out of bucket location h, and puts into location h into inventory by price
                    buck.setPrice(h, 0.00);

                    inv.setPriority(h, buck.getPriority(h));								//takes out of bucket location h, and puts into location h into inventory by priority
                    buck.setPriority(h, " ");

                    inv.setQuantity(h, buck.getQuantity(h));								//takes out of bucket location h, and puts into location h into inventory by quantity
                    buck.setQuantity(h, 0);

                } else {
                    total -= (buck.getPrice(h) * buck.getQuantity(h));
                }
            }
        }

        //print out number of items, total amount, and change
        System.out.printf("You have purchased %d items with a total amount of $%.2f, and your change is $%.2f.\n\n", count, totalPurchase, (bankAccount - totalPurchase));

        //print out list of items purchased
        System.out.println("These are the items you have purchased:");

        for (int b = 0; b < 7; b++) {

            if (inv.getName(b).equalsIgnoreCase(" ")) {
                // test to see if missing code here
            } else {
                System.out.printf("%-14s    $ %5.2f\n", inv.getName(b), inv.getPrice(b), buck.getPriority(b), buck.getQuantity(b));
            }

        }

        //print out list of items not purchased
        System.out.println("\nThese are the items you have not purchased:");

        for (int b = 0; b < 7; b++) {
            if (buck.getName(b).equalsIgnoreCase(" ")) {
                // test to see if missing code here
            } else {
                System.out.printf("%-14s    $ %5.2f\n", buck.getName(b), buck.getPrice(b));
                listNotPurchasedItems.put(buck.getName(b), buck.getPrice(b));
            }

        }
        System.out.println("\n\nThank you for shopping at Dexter's House of Pain.  Happy Killing!");
    }
    
    public double getTotalPurchase() {
        return totalPurchase;
    }

    public Map<String, Double> getListPurchasedItems() {
        return listPurchasedItems;
    }

    public Map<String, Double> getListNotPurchasedItems() {
        return listNotPurchasedItems;
    }
}
