package model;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;

/**
 * Created by 95 on 2015/11/29.
 */
public class User extends BmobObject {
    private String name;
    private String phone;
    private BmobDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(BmobDate date) {
        this.date = date;
    }

    public BmobDate getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
