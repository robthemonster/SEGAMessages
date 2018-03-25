package SEGAMessages;

public class AddUserToGroupRequest extends Request {
    private String userToAdd;
    private String requestor;
    private String groupname;

    @Override
    public String toString() {
        return "AddUserToGroupRequest{" +
                "userToAdd='" + userToAdd + '\'' +
                ", requestor='" + requestor + '\'' +
                ", groupname='" + groupname + '\'' +
                '}';
    }

    public String getUserToAdd() {
        return userToAdd;
    }

    public void setUserToAdd(String userToAdd) {
        this.userToAdd = userToAdd;
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}
