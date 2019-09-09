package com.ritroorkee;

public class Main {
	public static void main(String [] args) {
		
			//4*7-8+9-2+21
			Calculator cal = new Calculator();
	int res = cal.add(2 ,3);
	System.out.println(res);
	res = cal.subtract (res ,4);
	System.out.println(res);
	int multiply = cal.multiply( 5,6);
	res = cal.add(res,multiply);
	System.out.println(res);
	//(4*7)-8+9-2+21
	int mul = cal.multiply(4,  7);
	System.out.println(mul);
	mul =cal.subtract(mul,8);
	System.out.println(mul);
	mul= cal.add(mul , 9);
	System.out.println(mul);
	mul = cal.subtract(mul , 2);
	System.out.println(mul);
	mul = cal.add(mul ,  21);
	System.out.println(mul);

	int m2=cal.add(3,4);
	System.out.println(m2);

	m2=cal.add(m2, 5);
	System.out.println(m2);
	m2=cal.add(m2, 8);
	System.out.println(m2);
	m2=cal.subtract(m2, 7);
System.out.println(m2);
	m2=cal.subtract(m2, 2);
	System.out.println(m2);
	m2=cal.subtract(m2,1);
	System.out.println(m2);
	
	
	
	
	
	
	
	
	}

}