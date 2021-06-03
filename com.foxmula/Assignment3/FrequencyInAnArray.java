import java.util.*;

public class FrequencyInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {1,15,2,2,17,4,4,5,18,51};
		HashMap <Integer,Integer> hs= new HashMap<Integer,Integer>();
		
		for(int i=0;i<n.length;i++)
		{
			if(hs.containsKey(n[i]))
			{
				hs.put(n[i],hs.get(n[i])+1);
				continue;
			}
			hs.put(n[i], 1);
		}
		System.out.println("Elements \t Frequency");
		for (HashMap.Entry<Integer,Integer> entry : hs.entrySet()) {
			  int key = entry.getKey();
			  int value = entry.getValue();
			  System.out.println(key + "\t" + value);
			}
	}

}
