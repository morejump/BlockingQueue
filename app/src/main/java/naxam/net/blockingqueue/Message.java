package naxam.net.blockingqueue;

/**
 * Created by tuyen on 11/18/2017.
 */

public class Message {
    private String msg;

    public Message(String str){
        this.msg=str;
    }

    public String getMsg() {
        return msg;
    }
}
