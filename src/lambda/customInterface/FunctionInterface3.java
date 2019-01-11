package lambda.customInterface;

/*
 * @author wp
 * 有参数有返回值泛型 函数接口
 */
@FunctionalInterface
public interface FunctionInterface3<T> {
	String func(T param);
}
