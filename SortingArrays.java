import java.util.*;
class Ext
{
	public static <E> void sort(E[] arrayb)
	{
		LinkedList<E> l1=new LinkedList<E>();
		for(int i=0;i<arrayb.length;i++)
		{
			l1.add(arrayb[i]);
		}
		l1.sort(null);
		for(E i:l1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
}
public class SortingArrays
{
	public static void main(String[] x)
	{
		Integer arr[]={1,2,3,4,5,6,7};
		Double ar1[]={2.3,5.6,4.0,3.1,8.9};
		String ar2[]={"abd","aab","bcd","cba"};
		Character ar3[]={'a','b','c','d','e'};
		Ext.sort(arr);
		Ext.sort(ar1);
		Ext.sort(ar2);
		Ext.sort(ar3);
	}
}