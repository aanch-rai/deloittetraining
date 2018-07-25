package day7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//mapss are similar to TreeSets--it does not take duplicates
//maps have key-value association
public class MapDemo
{
	public static void main(String args[])
	{
		TreeMap<String,Double> t = new TreeMap<String,Double>();
		t.put("John Doe",new Double(3434.34));
		t.put("Tom Smith",new Double(123.22));
		t.put("Jane Baker", new Double(1378.00));
		t.put("Todd Hall", new Double(99.22));
		t.put("Ralph Smith", new Double(-19.08));
		//Now we have to convert it to a set to use iterator Therefore we use entryset
		
		Set set = t.entrySet();
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		System.out.println();
		System.out.println();
	}
}
