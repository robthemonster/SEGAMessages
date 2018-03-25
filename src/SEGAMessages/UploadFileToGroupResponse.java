package SEGAMessages;

public class UploadFileToGroupResponse extends Response {
    public static final String TYPE = "UploadFileToGroupResponse";
    private boolean succeeded;

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "UploadFileToGroupResponse{" +
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
