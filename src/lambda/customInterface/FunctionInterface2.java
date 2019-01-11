package lambda.customInterface;

/*
 * @author wp
 * 有参数无返回值泛型 函数接口
 */
@FunctionalInterface
public interface FunctionInterface2<T> {
	void func(T param);
}
