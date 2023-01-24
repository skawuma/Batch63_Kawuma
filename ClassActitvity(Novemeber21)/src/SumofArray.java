
/**
 * @author samuelkawuma
 *Jan 24, 2023
 *12:30:53 AM
 */

public class SumofArray {
public static  int  sumarr(  int a[]) {
	int x= a.length;
	int sum = 0;
	for (int i=0; i<x;i++ ) {
		sum+=a[i];
		
	}
	
	return sum;
}

public static void main(String[] args) {
	int k[]= {1,2,4,5,};
	
	int p =SumofArray.sumarr(k)
;
	System.out.println(p);
} 




}

