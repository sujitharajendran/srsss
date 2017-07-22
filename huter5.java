package test;

import java.util.Scanner;

public class huter5 {

	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n5=s.nextInt(),n2=s.nextInt();
		int i,j,count1=0,count3=0;
		int[] ss=new int[n5];
		int[] rr=new int[n2];
		for(i=0;i<n5;i++){
			ss[i]=s.nextInt();
			count1++;
		}
		for(i=0;i<n2;i++){
			rr[i]=s.nextInt();
		}
		for(i=0;i<n5;i++){
			for(j=0;j<n2;j++){
				if(ss[i]==rr[j]){
				     count3++;
				     break;
				     }
			}
		}
		if(count1==count3){
			System.out.println("The ss subset is there in rr");
		}else{
			System.out.println("ss is not a subset of rr");
		}
	}

}