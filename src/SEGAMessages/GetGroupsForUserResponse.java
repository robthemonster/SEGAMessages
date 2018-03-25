package SEGAMessages;

import java.util.List;

public class GetGroupsForUserResponse extends Response {
    public static final String TYPE = "GetGroupsForUserReponse";
    private List<String> groups;

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "GetGroupsForUserResponse{" +
                "groups=" + groups +
                '}';
    }

    @Override
    public String type() {
        return TYPE;
    }
}
