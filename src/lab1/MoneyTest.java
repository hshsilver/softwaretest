package lab1;

import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;

public class MoneyTest {
	
	 @Test
	    public void testCount(){
	        Money m = new Money();
	        System.out.println("○开始");
			Scanner scan = new Scanner(System.in);// 从键盘接收数据
		    System.out.println("输入一个正数字：");
		    String str = scan.next();
		    int strint = Integer.parseInt(str);
		    int result = m.count(strint);
		    scan.close();
		    System.out.println("○结束");
	        Assert.assertEquals(result, 1);//1表示能够凑出相应数目的钱。
	        
	    }

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
