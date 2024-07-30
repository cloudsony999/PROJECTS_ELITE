@FunctionalInterface 
interface ReverseArray{
void reverse(int[] a);
static void swap(int[] arr,int x,int y){
	var temp=arr[x];
	arr[x]=arr[y];
	arr[y]=temp;
}
public static void main(String... args){
    ReverseArray a=(x)->{
		for(int i=0;i<x.length/2;i++){
		swap(x,i,x.length-i-1);
	}
		for(var i : x){
			System.out.println(i);
		}
		
		
	};
	int b[]=new int[Integer.parseInt(args[0])];
	for(int i=0;i<b.length;i++){
		b[i]=Integer.parseInt(args[i+1]);
	}
	a.reverse(b);
	}	
}