package SEGAMessages;

public class DeleteUserFromGroupRequest extends Request {
    private String requestor;
    private String userToDelete;
    private String groupname;

    @Override
    public String toString() {
        return "DeleteUserFromGroupRequest{" +
                "requestor='" + requestor + '\'' +
                ", userToDelete='" + userToDelete + '\'' +
                ", groupname='" + groupname + '\'' +
                '}';
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    public String getUserToDelete() {
        return userToDelete;
    }

    public void setUserToDelete(String userToDelete) {
        this.userToDelete = userToDelete;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}
