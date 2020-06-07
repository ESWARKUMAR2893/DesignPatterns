package com.designPatterns.singleton;

public class Singleton_lazy {

	private static Singleton_lazy instance;

	public Singleton_lazy() {
		super();
	}

	public static Singleton_lazy getInstance() {

		if (null == instance) {

			synchronized (Singleton_lazy.class) {

				if (null == instance) {

					instance = new Singleton_lazy();//instance will be created at request time  
				}
			}

		}

		return instance;

	}

}
