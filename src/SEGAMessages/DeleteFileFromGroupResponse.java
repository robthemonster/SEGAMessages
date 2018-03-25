package SEGAMessages;

public class DeleteFileFromGroupResponse extends Response {
    public static final String TYPE = "DeleteFileFromGroupResponse";
    private boolean succeeded;

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "DeleteFileFromGroupResponse{" +
                "succeeded=" + succeeded +
                '}';
    }

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }
}
