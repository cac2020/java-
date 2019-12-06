package mode.factorymethod.staticfactory;

import mode.factorymethod.normal.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();  
        sender.send(); 
	}

}
