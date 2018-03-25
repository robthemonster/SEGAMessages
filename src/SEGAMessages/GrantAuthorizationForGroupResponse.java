package SEGAMessages;

public class GrantAuthorizationForGroupResponse extends Response {
    public static final String TYPE = "GrantAuthorizationForGroupResponse";
    private boolean succeded;

    public boolean isSucceded() {
        return succeded;
    }

    public void setSucceded(boolean succeded) {
        this.succeded = succeded;
    }

    @Override
    public String toString() {
        return "GrantAuthorizationForGroupResponse{" +
                "succeded=" + succeded +
                '}';
    }

    @Override
    public String type() {
        return TYPE;
    }
}
