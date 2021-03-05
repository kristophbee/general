public class obiektowo {

	public int getSum(int augend, int added) {
		int result = augend + added;
		return result;
	}
	public double getDifference(double first, double substraction) {
		double result = first - substraction;
		return result;
	}
	public double getMnozenie(double mnoz1, double mnoz2) {
		double result = mnoz1 + mnoz2;
		return result;
	}
	public String getDzielenieZReszta(double dziel1, double dziel2) {
		double result = dziel1/dziel2;
		double reszta = dziel1%dziel2;
		return (""+result+" reszta "+reszta);
	}
	public double doCelsjusza(int fahrenheit) {
		double result = ((fahrenheit - 32)*0.5556);
		return result;
	}
	public double doFahrenheita(int celsjusz) {
		double result = ((celsjusz * 1.8)+32);
		return result;
	}
	public double doKilo(double funt) {
		double result = (funt/2);
		return result;
	}
	public double doFunta(double kilo) {
		double result = (kilo*2);
		return result;
	}
	public boolean jestPalindromem(String slowo) {
		String wspak="";
		int dlugosc = slowo.length();
		for (int i = dlugosc -1; i >=0; i--)
			wspak = wspak + slowo.charAt(i);
		return (slowo.equals(wspak));
	}
	public static void main(String[] args) {
		int a, b;
		a =(int)(Math.random()*100);
		b =(int)(Math.random()*99)+1;
		double x, y;
		x = (Math.random()*100);
		y = (Math.random()*100);
		obiektowo kalk = new obiektowo();
		System.out.println(a + "+" + b + "="+kalk.getSum(a,b));
		System.out.println(x + "-" + y + "="+kalk.getDifference(x,y));
		System.out.println(x + "*" + y + "="+kalk.getMnozenie(x,y));
		System.out.println(x + "%" + y + "="+kalk.getDzielenieZReszta(x,y));
		System.out.println(a + "F to "+kalk.doCelsjusza(a)+"C");
		System.out.println(a + "C to "+kalk.doFahrenheita(a)+"F");
		System.out.println(x + " funtów to "+kalk.doKilo(a)+"kg");
		System.out.println(x + " kilogramów to "+kalk.doFunta(a)+" funtów");
		String pal0="kupa";
		String pal1="kajak";
		System.out.println("Czy "+pal0+" to palindrom? "+(kalk.jestPalindromem(pal0)?"Ta jest":"Niebardzo"));
		System.out.println("Czy "+pal1+" to palindrom? "+(kalk.jestPalindromem(pal1)?"Ta jest":"Niebardzo"));
	}
}
