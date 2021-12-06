package com.steven.passingArgs;

/*
 * 变量的赋值
 * 
 * 
 */
public class ValueTransferTest {
	
	public static void main(String[] args) {
		int m = 10;
		int n = m;
		System.out.println("*******基本数据类型**********" );
		System.out.println("m = "+ m + ",n = "+ n );
		
		n = 20;
		System.out.println("m = "+ m + ",n = "+ n ); 
		
		System.out.println("*******引用数据类型**********" );
		
		Order o1 = new Order();
		o1.orderID = 1001;
		
		Order o2 = o1;   //!!!!! just pass the reference of o1 to o2 (address), so as long as you change o2.orderId, it 
							//changes o1.orderID as well since they are pointing to the same thing.
		
		System.out.println("o1.orderID = " + o1.orderID + ",or.orderID = "+o2.orderID ); 
		o2.orderID = 1002;
		System.out.println("o1.orderID = " + o1.orderID + ",or.orderID = "+o2.orderID ); 
	}
}

 
class Order {
	int orderID;
}
