import java.util.*;
import java.util.ArrayList;
  
public class ElementOccuranceArrayList {
	public static void countFrequencies(ArrayList<String> list)
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
  
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
        for (HashMap.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times");
        }
    }
  
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements linewise");
        for(int i=0;i<n;i++)
        list.add(sc.nextLine());
        countFrequencies(list);
    }
}