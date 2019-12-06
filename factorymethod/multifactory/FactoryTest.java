package mode.factorymethod.multifactory;

import mode.factorymethod.normal.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.send();

	}

}
