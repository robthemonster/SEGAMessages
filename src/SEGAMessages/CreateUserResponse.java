package SEGAMessages;

import java.io.Serializable;

public class CreateUserResponse implements Serializable {
    private boolean succeeded;
    private String errorMessage;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}