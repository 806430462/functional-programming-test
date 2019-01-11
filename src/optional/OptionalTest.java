package optional;

import java.util.Optional;

/*
 * @author wp
 * 测试optional处理null值问题
 */
public class OptionalTest {
	public static void main(String[] args) {
		String param = null;
		String s = new OptionalTest().test(param);
		if(s!=null){
			System.out.println("result1:"+s);
		}
		param = "1";
		s = new OptionalTest().test(param);
		if(s!=null){
			System.out.println("result2:"+s);
		}
		param = null;
		Optional<String> ol = Optional.ofNullable(new OptionalTest().test(param));
		s = ol.orElse("2");
		System.out.println("result3:"+s);
	}
	public String test(String param){
		String a = null;
		if("1".equals(param)){
			a = "isnotnull";
		}
		return a;
	}
}
