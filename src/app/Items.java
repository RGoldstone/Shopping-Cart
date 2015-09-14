package app;

import java.util.List;

//Items interface
//Create way to access the same methods by multiple classes if/when necessary
public interface Items {

    public String getName(Integer a);

    public double getPrice(int a);

    public String getPriority(int a);

    public int getQuantity(int a);

    public void setName(int a, String b);

    public void setPrice(int a, double b);

    public void setPriority(Integer a);

    public void setQuantity(Integer a);

    public List getQuantityArrayList();

    public Double[] getPriceArray();

    public String[] getNameArray();

    public String[] getPriorityArray();

    public Integer[] getQuantityArray();
}


/*
	Interface = something that provides other code a way to access/speak with classes that are not all the same

 */
