@FunctionalInterface
interface Count{
void result(int x);
public static void main(String... args){
    
	Count r=(x)->{
		var count=0;
		var temp=x;
		var n=0;
		while(x!=0){
		n=x%10;
		x=x/10;
		count++;
		}
		System.out.print(count);
	};
	r.result(Integer.parseInt(args[0]));
	}	
}