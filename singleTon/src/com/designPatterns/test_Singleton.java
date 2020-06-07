package com.designPatterns;

public class test_Singleton {

	public static void main(String[] args) {

		Singleton_lazy single1 = Singleton_lazy.getInstance();
		Singleton_lazy single2 = Singleton_lazy.getInstance();

		if (single1 == single2) {
			System.out.println("Singleton_lazy both instance are same!");
		}

		Singleton_early single3 = Singleton_early.getInstance();
		Singleton_early single4 = Singleton_early.getInstance();

		if (single3 == single4) {
			System.out.println("Singleton_early both instance are same");
		}

		Singleton_early single5 = Singleton_early.getInstance();
		Singleton_early single6 = Singleton_early.getInstance_dublicate();

		if (single5 == single6) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are different !");
		}

	}

}
