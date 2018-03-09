package SEGAMessages;

import java.util.List;

public class GetUsersForGroupResponse extends Response {
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
}
