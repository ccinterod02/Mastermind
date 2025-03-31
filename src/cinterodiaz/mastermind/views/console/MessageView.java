package cinterodiaz.mastermind.views.console;

import cinterodiaz.mastermind.views.Message;
import cinterodiaz.utils.Console;

public class MessageView {

    public void writeln(Message message) {
        Console.getInstance().writeln(message.toString());
    }

    public void writeln(Message message, int attempts) {
        assert message == Message.ATTEMPTS;

        Console.getInstance().writeln(message.toString().replaceAll("#attempts", "" + attempts));
    }

    public void writeln(Message message, int blacks, int whites) {
        assert message == Message.RESULT;

        Console.getInstance()
                .writeln(message.toString().replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }

}
