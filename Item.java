import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
class Item{
	int itemId ;
	String itemName;
	Item(int itemId, String itemName){
				this.itemId = itemId;
				this.itemName = itemName;
				}
	

		
	public static void main(String[] args){
				
			ArrayList <Item> l =  new ArrayList<>();
			HashMap<Integer,String> map = new HashMap<>(); 
			Item i1 = new Item(1,"Item1");
			Item i2 = new Item(2,"Item2");
			Item i3 = new Item(3,"Item3");
			Item i4 = new Item(1,"Item1");
			l.add(i1);
			l.add(i2);	
			l.add(i3);
			l.add(i4);
			
			
			 
			
				
			Iterator<Item> x =  l.iterator();
			while(x.hasNext()){
			
				Item t = x.next();
				
				map.put(t.itemId,t.itemName);
				
				 
				System.out.println(map);
				
				
			}
		
		}
	
	
	


}
