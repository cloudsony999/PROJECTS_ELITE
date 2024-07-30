@FunctionalInterface
interface InsertArray{
void insert(int n);
public static void main(String... args){
    InsertArray a=(x)->{
		int[] y=new int[x];
		for(int i=0;i<x;i++){
			y[i]=Integer.parseInt(args[i]);
		}
		for(var i : y){
			System.out.println(i);
		}
	};
	a.insert(5);
	}	
}