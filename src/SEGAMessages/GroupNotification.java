package SEGAMessages;

import java.io.Serializable;

public class GroupNotification implements Serializable {
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String topicName;
    private String message;
}
