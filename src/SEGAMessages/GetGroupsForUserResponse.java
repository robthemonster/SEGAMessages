package SEGAMessages;

import java.util.List;

public class GetGroupsForUserResponse extends Response {
    public static final String TYPE = "GetGroupsForUserReponse";
    private List<String> groups;
    private String errorMessage;

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String type() {
        return TYPE;
    }
}
