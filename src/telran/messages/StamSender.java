package telran.messages;

import telran.view.InputOutput;

public class StamSender implements Sender {

	@Override
	public void send(InputOutput io, String text) {
		System.out.printf("text \"%s\" has ben sent to stam messager\n",text);

	}

}
