package SEGAMessages;

import java.io.Serializable;

public abstract class Response implements Serializable {
    public abstract String type();

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public abstract String toString();
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
