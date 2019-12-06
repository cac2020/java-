package mode.factorymethod.normal;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is mailsender!"); 
	}

}
