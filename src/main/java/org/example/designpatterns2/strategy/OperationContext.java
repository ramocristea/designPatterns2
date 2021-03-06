package org.example.designpatterns2.strategy;

public class OperationContext {
	
	public static int executeStrategy(int num1, int num2, Strategy strategy) {
		num1 = num2;
		return strategy.doOperation(num1, num2);
	}

}
