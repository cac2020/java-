package mode.proxy.staticproxy;

/**
 * 被代理类
 * 定义买房人
 */
public class BuyHouseImpl implements BuyHouse {

	@Override
	public void buyHosue() {
		System.out.println("我要买房");
	}
	
}
