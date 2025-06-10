package com.core;

public class No1 {

	public static void main(String[] args) {
		int[]Arr = {1, 2, 3, 4, 5, 6};
		int max = Arr [0];
		int min = Arr [0];
		int sum = 0;
		for (int num : Arr) {
			if(num>max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
			sum+= num;
		}
		int average = sum /Arr.length;
		System.out.println("Maximum value is:" + max);
		System.out.println("Minimum value is:" + min);
		System.out.println("average value is:" + average);
	}

}
