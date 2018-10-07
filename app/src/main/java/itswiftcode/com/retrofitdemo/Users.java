package itswiftcode.com.retrofitdemo;

import com.google.gson.annotations.SerializedName;

public class Users {

    @SerializedName("realname")
    private String name;
    @SerializedName("name")
    private String nickName;

    public Users(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
}
