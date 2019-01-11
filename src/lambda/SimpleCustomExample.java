package lambda;

import lambda.customInterface.FunctionInterface1;
import lambda.customInterface.FunctionInterface2;
import lambda.customInterface.FunctionInterface3;

public class SimpleCustomExample {

	public static void main(String[] args) {
		new SimpleCustomExample().func1((String x) -> System.out.println(x));
		new SimpleCustomExample().func2((String x) -> System.out.println(x));
		new SimpleCustomExample().func3((String x) -> {
			System.out.println(x);
			return x;
		});
	}

	public void func1(FunctionInterface1 functionInterface) {
		functionInterface.func("a");
	}

	public void func2(FunctionInterface2<String> functionInterface) {
		functionInterface.func("b");
	}

	public void func3(FunctionInterface3<String> functionInterface) {
		functionInterface.func("c");
	}
}
