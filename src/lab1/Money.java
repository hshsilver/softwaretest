package lab1;

import java.util.Scanner;

public class Money {
	
	
	int count (int input) {
		
		int wushi = 50;
		int ershi = 20;
		int wu = 5;
		int yi = 1;
		int flag = 0;
		
		for(int a=0;a<2;a++) {
			for(int b=0;b<2;b++) {
				for(int c=0;c<3;c++) {
					for(int d=0;d<4;d++) {
						if(a*wushi + b*ershi + c*wu + d*yi==input) {
							System.out.println(a+"张50元，"+b+"张20元"+c+"张5元"+d+"张1元");
							flag=1;
						}
					}
				}
			}
		}
		//1 2 3 5 6 7 10 11 12 20 21 22 23 25 26 27 28 30 31 32 33 以及前面所有项加五十，最高为83 
		if(flag==1) {
			return 1;
		}else {
			return 0;
		}
	}

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("○开始");
//		Scanner scan = new Scanner(System.in);// 从键盘接收数据
//	    System.out.println("输入一个正数字：");
//	    String str = scan.next();
//	    int strint = Integer.parseInt(str);
//	    count(strint);
//	    scan.close();
//	    System.out.println("○结束");
//	}

}
