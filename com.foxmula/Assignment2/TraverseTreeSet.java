import java.util.*;

public class TraverseTreeSet{

public static void main(String[] args)
{
TreeSet<String> newTreeSet=new TreeSet<String>();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements");
int n= sc.nextInt();
sc.nextLine();
System.out.println("Enter the  elements linewise");
for(int i=0;i<n;i++)
newTreeSet.add(sc.nextLine());
TreeSetTraversal(newTreeSet);
}
public static void TreeSetTraversal(TreeSet treeSet)
{
Iterator<String> iterator = treeSet.iterator();
System.out.println("TreeSet Elements.. ");
while(iterator.hasNext())
System.out.println(iterator.next());
}
}