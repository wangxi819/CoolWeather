package cn.saywow.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WORK on 2018/2/24.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherID;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }


}
