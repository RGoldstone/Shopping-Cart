package app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory implements Items{

	//array with items
	private static String invName[];														//={"Tranquilizer", "Boat Fuel", "Knife", "Saran Wrap", "Gloves", "Slide", "Apron"};
	//array with prices to match items
	private static Double invPrice[];														//={8.99, 29.99, 14.99, 5.99, 19.99, 2.99, 17.99};
	//array list with priority
	private static String invPriority[] = {"","","","","","",""};							// = new ArrayList<String>();
	//array list with quantity
	private static Integer invQuantity[] = {0,0,0,0,0,0,0};									// = new ArrayList<Integer>();

	public Inventory(){

		invName = new String[7];   															//sets array length to 7
		invPrice = new Double[7];															//sets array length to 7

		List<String> tempName = new ArrayList<String>();  									//used as temporary holding for item
		List<Double> tempPrice = new ArrayList<Double>(); 									//used as temporary holding for price 

		Scanner openFile; 																	// used to open external file

		try{
			openFile = new Scanner(new File("resources/items.txt")); //opens the file
			int counter = 0;
			while(openFile.hasNext()){                                            			//Loops through all things in file
				if (counter == 1 || counter == 3){                                			//adds two words to name instead of one
					tempName.add(openFile.next());											//adds the first word
					tempName.set(counter, tempName.get(counter) + " " + openFile.next());  	//goes back and adds second word to first word
					tempPrice.add(Double.parseDouble(openFile.next()));           			//adds price
					counter++;
				}else{
					tempName.add(openFile.next());                                			//adds one word to name
					tempPrice.add(Double.parseDouble(openFile.next()));						//adds price
					counter++;
				}
			}

			tempName.toArray(invName);   													//converts arrayList to arrays
			tempPrice.toArray(invPrice);  													//converts arrayList to arrays

			openFile.close();																//closes file connection

		}catch(Exception e){
			System.out.println("Could not open file.");   									//prints out error
			System.out.println(e.getMessage());          
		}
	}

	public void setQuantitytoZero(int index, int qty){
		invQuantity[index]= qty;
	}

	public String getName(Integer a){														//gets name
		return invName[a];
	}

	public double getPrice(int a){															//gets price
		return invPrice[a];
	}

	public String getPriority(int a){														//gets priority
		return invPriority[a];	
	}

	public int getQuantity(int a){															//gets quantity
		return invQuantity[a];
	}



	public void setName(int a, String b){
		invName[a]=b;
	}

	public void setPrice(int a, double b){
		invPrice[a]=b;
	}

	public void setPriority(int a, String b){
		invPriority[a]=b;
	}

	public void setQuantity(int a, Integer b){ 
		invQuantity[a]=b;
	}



	public Double[] getPriceArray(){
		return invPrice;						
	}

	public String[] getNameArray(){
		return invName;
	}

	public String[] getPriorityArrayList(){
		return invPriority;
	}

	public Integer[] getQuantityArray(){
		return invQuantity;
	}



	@Override
	public void setPriority(Integer a) {
		// TODO Auto-generated method stub

	}



	@Override
	public void setQuantity(Integer a) {
		// TODO Auto-generated method stub

	}



	@Override
	public List getQuantityArrayList() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String[] getPriorityArray() {
		// TODO Auto-generated method stub
		return null;
	}


}

