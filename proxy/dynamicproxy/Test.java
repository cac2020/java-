package mode.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import mode.proxy.staticproxy.BuyHouse;
import mode.proxy.staticproxy.BuyHouseImpl;

public class Test {

	public static void main(String[] args) {
		/**
		 * 第一个参数是指定被代理对象所使用的类加载器,获取加载器的方法是固定的，
		 * 第二个参数是指定被代理对象实现的接口的类型,使用泛型方式确认类型，是一个数组，因为一个类可以实现多个接口嘛，
		 * 第三个参数是我们自己创建的动态处理器，在执行被代理对象的方法时,会触发动态处理器里面的方法
		 * 
		 * 因为这种方式实现动态代理，是使用了java的反射机制，
		 * 所以有两个要求，一就是被代理对象必须要实现接口，二就是代理对象必须要指定接口类型，否则无法实现动态代理
		 */
		BuyHouse as = (BuyHouse) Proxy.newProxyInstance(Test.class.getClassLoader(),
				new Class[] { BuyHouse.class }, 
				new ProxyHandler(new BuyHouseImpl()));
		as.buyHosue();
	}

}
