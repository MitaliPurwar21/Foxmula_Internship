import java.util.*;

public class TraverseHashSet{

public static void main(String[] args)
{
HashSet<String> newHashSet=new HashSet<String>();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements");
int n= sc.nextInt();
sc.nextLine();
System.out.println("Enter the  elements linewise");
for(int i=0;i<n;i++)
newHashSet.add(sc.nextLine());
HashSetTraversal(newHashSet);
}
public static void HashSetTraversal(HashSet hashset)
{
Iterator<String> iterator = hashset.iterator();
System.out.println("HashSet Elements.. ");
while(iterator.hasNext())
System.out.println(iterator.next());
}
}