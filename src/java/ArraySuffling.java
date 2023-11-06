package java;

import java.util.Random;

public class ArraySuffling {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		//for taking random index number
		Random r=new Random();
	
		for(int i=a.length-1;i>=0;i--)
		{
			int random=r.nextInt(i+1);	
			int temp=a[i];
           a[i]=a[random];
           a[random]=temp;
		}
		for(int b:a)
		{
			System.out.print(b+" ");
		}
	}

}
