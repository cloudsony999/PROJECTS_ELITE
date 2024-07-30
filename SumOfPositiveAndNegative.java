@FunctionalInterface
interface SumOfPositiveAndNegative{
void insert(int n);
public static void main(String... args){
    SumOfPositiveAndNegative a=(x)->{
		var sum=0;
		var sum1=0;
		int[] y=new int[x];
		for(int i=0;i<x;i++){
			y[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<x;i++){
			if(y[i]>=0){
				sum+=y[i];
			}
			else
				sum1+=y[i];
		}
		System.out.println("the sum of positive no is"+sum);
	System.out.println("the sum of negative no is"+sum1);
	};
	a.insert(5);
	}	
}