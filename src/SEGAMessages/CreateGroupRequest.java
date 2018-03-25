package SEGAMessages;

public class CreateGroupRequest extends Request {
    private String groupName;
    private String creator;

    @Override
    public String toString() {
        return "CreateGroupRequest{" +
                "groupName='" + groupName + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
