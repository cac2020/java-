package mode.proxy.staticproxy;

public class ProxyTest {
	public static void main(String[] args) {
		//自己去买房
		BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHosue();
        
        //中介去买房
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
	}
}
