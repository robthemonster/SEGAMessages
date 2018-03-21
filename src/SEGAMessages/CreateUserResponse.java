package SEGAMessages;

public class CreateUserResponse extends Response {
    public static final String TYPE = "CreateUserResponse";
    private boolean succeeded;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }


    @Override
    public String type() {
        return TYPE;
    }
}
