import java.util.ArrayList;

public class UAS1E {
    private String USERID;
    private String USERNAME;
    private ArrayList<String>MY_MESSAGES;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public ArrayList<String> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<String> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public UAS1E(){
    }

    public UAS1E(String USERID, String USERNAME, ArrayList<String> MY_MESSAGES) {
        this.USERID = USERID;
        this.USERNAME = USERNAME;
        this.MY_MESSAGES = MY_MESSAGES;
    }

}
