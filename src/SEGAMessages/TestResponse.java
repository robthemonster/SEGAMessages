package SEGAMessages;

import java.io.Serializable;

public class TestResponse implements Serializable {
    String messageBody;
    String payload;

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
