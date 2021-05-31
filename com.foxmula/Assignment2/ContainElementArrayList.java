import java.util.ArrayList;
import java.util.Scanner;

public class ContainElementArrayList{

public static void main(String[] args)
{
ArrayList<String> newArrayList=new ArrayList<String>();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements and press enter");
int n= sc.nextInt();
sc.nextLine();
System.out.println("Enter the elements linewise");
for(int i=0;i<n;i++)
newArrayList.add(sc.nextLine());
System.out.println("Enter the  element to be searched");
String s=sc.nextLine();
checkElement(newArrayList, s);
}
public static void checkElement(ArrayList aList, String s)
{
if(aList.contains(s))
System.out.println("Element " + s + " is present in " + aList);
else
	System.out.println("Element " + s + " is not present in " + aList);
}
}