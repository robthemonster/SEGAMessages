package SEGAMessages;

import java.util.List;

public class GetUsersForGroupResponse extends Response {
    public static final String TYPE = "GetUsersForGroupResponse";

    @Override
    public String toString() {
        return "GetUsersForGroupResponse{" +
                "users=" + users +
                ", groupname='" + groupname + '\'' +
                '}';
    }

    private List<String> users;
    private String groupname;

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Override
    public String type() {
        return TYPE;
    }
}
