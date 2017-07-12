import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashmapInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map <Integer,String> map=new HashMap();
		map.put(1, "Karan");
		map.put(2, "Shiv");
		map.put(3, "Ritu");
		map.put(4, "Ravidas");
		//  1 --------------------------
		Set<Integer> itr=map.keySet();
		for(Integer i:itr)
		{
			System.out.println(map.get(i));
			//map.remove(i);
		}
		
	//  2 --------------------------
		
		Set<Entry<Integer, String>> enties=map.entrySet();

		for(Entry<Integer, String> one: enties)
		{
	     System.out.println(one.getKey()+"   "+one.getValue());
		}

		//  3 --------------------------
		
	
	/*	while(entries.hasNext())
		{
			if(entries.next().getKey()==4)
			{
				entries.remove();
			}
		}*/

	/*	Iterator frji=map.entrySet().iterator();
		
		while(frji.hasNext())
		{
			 Map.Entry entry = (Map.Entry) frji.next();
			 System.err.println(entry.getValue()+"   "+entry.getKey());
			 
		}*/
		Iterator<Entry<Integer, String>> entries=map.entrySet().iterator();
		Iterator<Entry<Integer, String>> entries1=map.entrySet().iterator();
	/*for(Entry<Integer, String> one: map.entrySet())
		{
			entries.next();
			entries.remove();
			System.out.println(one.getKey()+"   "+one.getValue());
		}
	*/
		while(entries.hasNext()){
			Entry<Integer, String>e=entries1.next();
			e.getValue();
			e.getKey();
			entries1.remove();
			entries.next();
		}
		
	}

}
