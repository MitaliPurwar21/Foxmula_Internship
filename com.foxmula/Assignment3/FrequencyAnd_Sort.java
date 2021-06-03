import java.util.*;

public class FrequencyAnd_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,15,2,2,17,4,4,5,18,51};
		HashMap <Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for(int i=0;i<n.length;i++)
		{
			if(map.containsKey(n[i]))
			{
				map.put(n[i],map.get(n[i])+1);
				continue;
			}
			map.put(n[i], 1);
		}
		int k[]=new int[map.size()];
		int v[]=new int[map.size()];
		int i=0;
		for (HashMap.Entry<Integer,Integer> entry : map.entrySet()) {
			  int key = entry.getKey();
			  k[i]=key;
			  int value = entry.getValue();
			  v[i++]=value;
//			  System.out.println(key + " " + value);
			}
		 sort(k,v);
		 System.out.println("Elements \t Frequency");
		 for(int j=0; j<k.length; j++)
		 {
			 System.out.println(k[j] + "\t" + v[j]);
		 }
		}
	public static void sort(int seq[], int a[])
	{
		int n=a.length;
		for(int i=0;i<n-1;i++) //selection sort
		{
			int maxIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>a[maxIndex])
				{
					maxIndex=j;
				}
			}		
			int temp=a[i];
			a[i]=a[maxIndex];
			a[maxIndex]=temp;	
			temp=seq[i];
			seq[i]=seq[maxIndex];
			seq[maxIndex]=temp;
		}
	}
	}
