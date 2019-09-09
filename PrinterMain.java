package com.ritroorkee;

public class PrinterMain {
	public static void main(String[] args) {

		Executive e = new Executive();
		
		IPrinter cp = new CannonPrinter();
		IPrinter dp = new DotMatrixPrinter();
		IPrinter fp = new FixPrinter();
		
		e.setPrinter(cp);
		e.print();
		e.setPrinter(dp);
		e.print();
		e.setPrinter(fp);
		e.print();
	}
}

