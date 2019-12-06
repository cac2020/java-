package mode.factorymethod.staticfactory;

import mode.factorymethod.normal.MailSender;
import mode.factorymethod.normal.Sender;
import mode.factorymethod.normal.SmsSender;

public class SendFactory {
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
