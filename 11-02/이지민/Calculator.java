interface Operation {
	double calculate(double a, double b);
}


class Addition implements Operation {
	@Override
	public double calculate(double a, double b) {
		return a + b;
	}
}

class Minus implements Operation {
	@Override
	public double calculate(double a, double b) {
		return a - b;
	}
}

class Division implements Operation {
	@Override
	public double calculate(double a, double b) {
		return a / b;
	}
}


class Multiply implements Operation {
	@Override
	public double calculate(double a, double b) {
		return a * b;
	}
}

class CalculatorOP {
	private Operation operation;
	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public double calculate(double a, double b) {
		return operation.calculate(a, b);
	}
}



public class Calculator {

	public static void main(String[] args) {
		CalculatorOP calculatorop = new CalculatorOP();
		
		calculatorop.setOperation(new Addition());
		System.out.println(calculatorop.calculate(10.5, 5));
		
		
		calculatorop.setOperation(new Minus());
		System.out.println(calculatorop.calculate(10, 5));
		
		calculatorop.setOperation(new Division());
		System.out.println(calculatorop.calculate(10, 5));
		
		calculatorop.setOperation(new Multiply());
		System.out.println(calculatorop.calculate(15, 5));
		
	}


}
