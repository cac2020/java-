package mode.proxy.cglibproxy;

public class Test {

	public static void main(String[] args) {
		//目标对象
		TargetObj target = new TargetObj();

        //代理对象
		TargetObj proxy = (TargetObj)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.method();

	}

}
