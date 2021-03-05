public class importy {
	@SuppressWarnings("unused")
	private int instanceVar;
	@SuppressWarnings("unused")
	private String refVar;
	public static int classVar;
	public void method(int parameter) {
		@SuppressWarnings("unused")
		int localVar;
		@SuppressWarnings("unused")
		Object obj;
		//localVar, obj & parameter is on visible within the method
		@SuppressWarnings("unused")
		String str;
		localVar=1;//initialization
		str = "Hello";//String initialization
		@SuppressWarnings("unused")
		int anotherVar=2;//declaration + initialization
		@SuppressWarnings("unused")
		Object obj1 = new Object();//declaration + initialization
		try {
			@SuppressWarnings("unused")
			int varBlock;
		} finally {
		//	varBlock = 0; //varBlock is not visible here
		}
		// varBlock= 0; //varBlock is not visble here
}	}
