package com.rozetka.data;

interface IEmail {
    IPassword setEmail(String email);
}

interface IPassword {
    IBuildUser setPassword(String password);
}

interface IBuildUser {
//    IBuildUser setEmail(String email);
//    IBuildUser setPassword(String password);

    IUser build();
}

public final class User
        implements IEmail, IPassword, IBuildUser, IUser {

    private String email;
    private String password;


    public static IEmail get() {
        return new User();
    }

    @Override
    public IPassword setEmail(String email) {
        return this;
    }

    @Override
    public IBuildUser setPassword(String password) {
        return this;
    }

    @Override
    public IUser build() {
        return this;
    }


    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
