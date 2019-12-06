package mode.factorymethod.multifactory;

import mode.factorymethod.normal.MailSender;
import mode.factorymethod.normal.Sender;
import mode.factorymethod.normal.SmsSender;

public class SendFactory {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
