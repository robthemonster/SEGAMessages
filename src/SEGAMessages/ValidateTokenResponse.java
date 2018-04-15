package SEGAMessages;

public class ValidateTokenResponse extends Response {
    public static final String TYPE = "ValidateTokenResponse";
    private boolean tokenIsValid;

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "ValidateTokenResponse{" +
                "tokenIsValid=" + tokenIsValid +
                '}';
    }

    public boolean isTokenIsValid() {
        return tokenIsValid;
    }

    public void setTokenIsValid(boolean tokenIsValid) {
        this.tokenIsValid = tokenIsValid;
    }
}
