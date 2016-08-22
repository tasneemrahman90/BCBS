
package sort;

/**
 * Created by rrt on 8/6/2016.
 */
public class UseInsertionSort {
	public static void main(String[] args) {
		int [] list = {9,6,7,0,3,5};
		for(int i=1; i<list.length; i++){
			for(int j=i; j>0; j--){
				if(list[j]<list[j-1]){
					int temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
				}
			}
		}
		for(int n=0; n<list.length; n++){
			System.out.println(list[n]);
		}
	}
}