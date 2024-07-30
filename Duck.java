@FunctionalInterface
interface Duck{
void result(int x);
public static void main(String... args){
    
	Duck r=(x)->{
		var flag=0;
		var temp=x;
		var n=0;
		while(x!=0){
		n=x%10;
		if(n==0){
			System.out.println("Duck no");
			flag=1;
			break;
		}
		x=x/10;
		}
		if(flag==0)
			System.out.println("not a Duck no");
		
	};
	r.result(Integer.parseInt(args[0]));
	}	
}