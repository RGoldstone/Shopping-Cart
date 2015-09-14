package app;

import java.util.ArrayList;
import java.util.List;

public class Bucket implements Items {

	//bucket to put items arranged with priority
    private static List<String> bucketName = new ArrayList<String>();
    private static List<Double> bucketPrice = new ArrayList<Double>();
    private static List<String> bucketPriority = new ArrayList<String>();
    private static List<Integer> bucketQuantity = new ArrayList<Integer>();

    public Bucket() {

    }

    public String getName(int a) {									//access string name array
        return bucketName.get(a);
    }

    public double getPrice(int a) {									//accessing array for one price @ a
        return bucketPrice.get(a);
    }

    public String getPriority(int a) {
        return bucketPriority.get(a);
    }

    public int getQuantity(int a) {
        return bucketQuantity.get(a);
    }

    public void setName(String b) {									//a is what sets the place in the array, String b is the name going into place a
        bucketName.add(b);
    }

    public void setPrice(double b) {									//a is what sets the place in the array, double b is the price going into a
        bucketPrice.add(b);
    }

    public void setPriority(String a) {
        bucketPriority.add(a);
    }

    public void setQuantity(Integer a) {
        bucketQuantity.add(a);
    }

    public void setPriority(int b, String a) {
        bucketPriority.set(b, a);
    }

    public void setQuantity(int b, Integer a) {
        bucketQuantity.set(b, a);
    }

    public List getPriceArrayList() {								//accessing price array for entire index
        return bucketPrice;
    }

    public List getNameArrayList() {									//accessing name array for entire index
        return bucketName;
    }

    public List getPriorityArrayList() {
        return bucketPriority;
    }

    public List getQuantityArrayList() {
        return bucketQuantity;
    }

    @Override
    public String getName(Integer a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setName(int a, String b) {
        // TODO Auto-generated method stub
        bucketName.set(a, b);
    }

    @Override
    public void setPrice(int a, double b) {
        // TODO Auto-generated method stub
        bucketPrice.set(a, b);
    }

    @Override
    public Double[] getPriceArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] getNameArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setPriority(Integer a) {
        // TODO Auto-generated method stub

    }

    public String[] getPriorityArray() {
        // TODO Auto-generated method stub
        String a[] = {" ", " "};
        return a;
    }

    public Integer[] getQuantityArray() {
        // TODO Auto-generated method stub
        return null;
    }

}
