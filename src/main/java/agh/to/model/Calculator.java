package agh.to.model;

import java.util.Scanner;

public class Calculator {
	private Mode mode = Mode.SIMPLE;
	private Basic operator;
	private Scientific operatorSc;
	private char op;
	private int num1;
	private int num2;

	Scanner input = new Scanner(System.in);


	public void chooseMode() {
		System.out.println("Choose mode:\n 1. Simple\n 2. Scientific");
		op = input.next().charAt(0);
		if (op == '2') {
			setMode(Mode.SCIENTIFIC);
		}
	}

	public void chooseOperation() {
		if (this.mode == Mode.SCIENTIFIC) {
			System.out.println("Enter the operator:\n a. Power\n b. Sinus\n c. Fibb");
			op = input.next().charAt(0);
			switch (op) {
				case 'a' -> setOperatorSc(Scientific.POWER);
				case 'b' -> setOperatorSc(Scientific.SINUS);
				case 'c' -> setOperatorSc(Scientific.FIBB);
			}
		} else {
			System.out.println("Enter the operator +, -, *, /");
			op = input.next().charAt(0);
			switch (op) {
				case '+' -> setOperator(Basic.ADD);
				case '-' -> setOperator(Basic.SUBTRACT);
				case '*' -> setOperator(Basic.MULTIPLY);
				case '/' -> setOperator(Basic.DIVIDE);
			}
		}
	}

	public void setInput() {
		System.out.println("Enter two numbers: ");
		this.num1 = input.nextInt();
		this.num2 = input.nextInt();

	}

	public void run() {
		chooseMode();
		chooseOperation();
		setInput();
		if(mode == Mode.SCIENTIFIC){
			System.out.println(operatorSc.calc(num1,num2));
		} else {
			System.out.println(operator.calc(num1, num2));
		}
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public void setOperator(Basic operator) {
		this.operator = operator;
	}

	public void setOperatorSc(Scientific operatorSc) {
		this.operatorSc = operatorSc;
	}
}
