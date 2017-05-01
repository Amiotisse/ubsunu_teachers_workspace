package com.amiotisse.ubsunu.teacher.workspace.model.builder;

import com.amiotisse.ubsunu.teacher.workspace.model.UserToken;
import com.amiotisse.ubsunu.teacher.workspace.model.UserType;

public class UserTokenBuilder {
    private String id;
    private String userName;
    private UserType userType;

    public UserTokenBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserTokenBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserTokenBuilder setUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    public UserToken build() {
        return new UserToken(id, userName, userType);
    }
}