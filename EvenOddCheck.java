@FunctionalInterface
interface EvenOdd{
void check(int x);
}
class EvenOddCheck Implements EvenOdd{
 public static void main(String... args){
	 EvenOdd e=(x)->{
		 if(x%2==0)
			 System.out.println("Even");
		 else
			 System.out.println("odd");
	 };
	 e.check(Integer.parseInt(args[0])); 
 }
}