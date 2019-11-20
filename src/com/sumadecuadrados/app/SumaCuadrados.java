package com.sumadecuadrados.app;

public class SumaCuadrados {

	public static void main(String[] args) {
		int num=0;

		for(int i=0; i<=100;i++)
		{
			if(i%2==0)
			{
			num=num+(i*i);
			}
		}
		
		System.out.println("The add of square of numbers pair is: "+num);
		
	}

}
