@FunctionalInterface
interface SumOfEven{
void insert(int n);
public static void main(String... args){
    SumOfEven a=(x)->{
		var sum=0;
		int[] y=new int[x];
		for(int i=0;i<x;i++){
			y[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<x;i++){
			if(y[i]%2==0){
				sum+=y[i];
			}
		}
		System.out.println(sum);
	};
	a.insert(5);
	}	
}