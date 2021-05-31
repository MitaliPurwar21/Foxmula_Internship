import java.util.*;

public class ContainElementSet{

public static void main(String[] args)
{
Set<String> newSet=new HashSet<String>();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements and press enter");
int n= sc.nextInt();
sc.nextLine();
System.out.println("Enter the elements linewise");
for(int i=0;i<n;i++)
newSet.add(sc.nextLine());
System.out.println("Enter the  element to be searched");
String s=sc.nextLine();
checkElement(newSet, s);
}
public static void checkElement(Set set, String s)
{
if(set.contains(s))
System.out.println("Element " + s + " is present in " + set);
else
System.out.println("Element " + s + " is not present in " + set);
}
}