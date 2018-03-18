package SEGAMessages;

public class GrantAuthorizationForGroupResponse extends Response {
    public static final String TYPE = "GrantAuthorizationForGroupResponse";
    private boolean succeded;
    private String errorMessage;

    public boolean isSucceded() {
        return succeded;
    }

    public void setSucceded(boolean succeded) {
        this.succeded = succeded;
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
