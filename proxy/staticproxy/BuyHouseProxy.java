package mode.proxy.staticproxy;

/**
 * 代理类
 * 代理买房人去买房 比如中介
 */
public class BuyHouseProxy implements BuyHouse {

	private BuyHouse buyHouse;

	public BuyHouseProxy(final BuyHouse buyHouse) {
		this.buyHouse = buyHouse;
	}

	@Override
	public void buyHosue() {
		System.out.println("买房前准备");
		buyHouse.buyHosue();
		System.out.println("买房后装修");
	}

}
