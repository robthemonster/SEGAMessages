package SEGAMessages;

public class CreateGroupResponse extends Response {
    public static final String TYPE = "CreateGroupResponse";
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

    @Override
    public String type() {
        return TYPE;
    }
}
