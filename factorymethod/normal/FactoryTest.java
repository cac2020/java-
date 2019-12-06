package mode.factorymethod.normal;

/**
 * @Desc
 * @author wangjy15
 */
public class FactoryTest {

	/**
	 * @Desc: TODO
	 * @author wangjy15
	 * @date 2019年12月5日 上午8:42:21
	 * @param args
	 */
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.send();
	}

}
