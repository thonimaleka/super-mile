import java.util.*;
public class arraylisttwodimension {

	public static void main(String[] args) {
		//2D ArrayList = a dynamic list of lists
		//You can change the size of these lists during runtime
		
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();//2D arrayList
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList= new ArrayList();
		produceList.add("Tomatoes");
		produceList.add("Zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("Juice");
		
		//2D array list adding other arrayLists
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

		
		System.out.println(groceryList.get(1).get(1));
		

	}

}
