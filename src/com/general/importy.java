package com.general;
public class importy {
	private int instanceVar;
	private String refVar;
	public static int classVar;
	public void method(int parameter) {
		int localVar;
		Object obj;
		//localVar, obj & parameter is on visible within the method
		String str;
		localVar=1;//initialization
		str = "Hello";//String initialization
		int anotherVar=2;//declaration + initialization
		Object obj1 = new Object();//declaration + initialization
		try {
			int varBlock;
		} finally {
		//	varBlock = 0; //varBlock is not visible here
		}
		// varBlock= 0; //varBlock is not visble here
}	}
