@FunctionalInterface
interface CreditScore{
void check(int x);
public static void main(String... args){
	CreditScore c=(x)->{
	if(x<400||x>850)
        System.out.println("invalid creditscore");
    else{
		if(x>=400&&x<600)
			System.out.println("Silver card");
		else if(x>=600&&x<800)
			System.out.println("gold card");
		else
			System.out.println("plat card");
	}	
	};
	c.check(Integer.parseInt(args[0]));
}
}