package mode.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态处理器
 */
public class ProxyHandler implements InvocationHandler {
	
	// 被代理对象
    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理开始");
        Object result = method.invoke(object, args);
        System.out.println("动态代理结束");
        return result;
	}

}
