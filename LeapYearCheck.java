@FunctionalInterface
interface LeapYear{
void check(int x);
}
class LeapYearCheck{
	public static void main(String... args){
		LeapYear l=(x)->{
			if((x%4==0 && x%100!=0)|| x%400==0)
				System.out.println("leap year");
			else
				System.out.println("not a leapyear");
		};
		l.check(Integer.parseInt(args[0]));
		
	}
	
	
	
}