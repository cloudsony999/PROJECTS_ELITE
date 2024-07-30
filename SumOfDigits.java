@FunctionalInterface
interface SumOfDigits{
void result(int x);
public static void main(String... args){
    
	SumOfDigits r=(x)->{
		var sum=0;
		var temp=x;
		var n=0;
		while(x!=0){
		n=x%10;
		x=x/10;
		sum+=n;
		}
		System.out.print(sum);
	};
	r.result(Integer.parseInt(args[0]));
	}	
}