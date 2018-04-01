package SEGAMessages;

public class DeleteUserFromGroupResponse extends Response {
    public static final String TYPE = "DeleteUserFromGroupResponse";
    private boolean succeeded;
    private String deletedUser;
    private String groupname;

    @Override
    public String toString() {
        return "DeleteUserFromGroupResponse{" +
                "succeeded=" + succeeded +
                ", deletedUser='" + deletedUser + '\'' +
                ", groupname='" + groupname + '\'' +
                '}';
    }

    public String getDeletedUser() {
        return deletedUser;
    }

    public void setDeletedUser(String deletedUser) {
        this.deletedUser = deletedUser;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

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
