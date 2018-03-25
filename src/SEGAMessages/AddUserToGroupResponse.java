package SEGAMessages;

public class AddUserToGroupResponse extends Response {

    public static final String TYPE = "AddUserToGroupResponse";

    private boolean succeeded;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    @Override
    public String toString() {
        return "AddUserToGroupResponse{" +
                "succeeded=" + succeeded +
                '}';
    }

    @Override
    public String type() {
        return TYPE;
    }

}
