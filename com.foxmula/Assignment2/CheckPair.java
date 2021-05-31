import java.util.*;
public class CheckPair{

public static void main(String[] args)
{
ArrayList<Integer> newArrayList=new ArrayList<>();

Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements and press enter");
int input= sc.nextInt();
sc.nextLine();
System.out.println("Enter the elements by giving space in between, then press enter");
for(int i=0;i<input;i++)
newArrayList.add(sc.nextInt());
sc.nextLine();
System.out.println("Enter the sum of the pair to be searched");
int sumtobesearched=sc.nextInt();
checkPair(newArrayList, sumtobesearched);
}
public static void checkPair(ArrayList aList, int n)
{
Iterator<Integer> iterator = aList.iterator();

HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
        
        int i=0;
        while(iterator.hasNext())
        {
        	int m=iterator.next();
            int remain=n-m;
       
            if(h.containsKey(remain))
            {
                System.out.println(h.get(remain)+", "+ i);
                return;
            }
            h.put(m,i);
            i++; 
        }
        System.out.print("No such pair exists");
}
}