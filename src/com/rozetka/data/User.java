package com.rozetka.data;

interface IEmail {
    IPassword setEmail(String email);
}

interface IPassword {
    IBuildUser setPassword(String password);
}

interface IBuildUser {
    IPassword setEmail(String email);
    IBuildUser setPassword(String password);

    IUser build();
}

public final class User
        implements IEmail, IPassword, IBuildUser, IUser {

    public final static String EMPTY_STRING = "";
    private String email;
    private String password;

    private User() {
        this.email = EMPTY_STRING;
        this.password = EMPTY_STRING;
    }

    public static IEmail get() {
        return new User();
    }

    @Override
    public IPassword setEmail(String email) {
        this.email = email;

        return this;
    }

    @Override
    public IBuildUser setPassword(String password) {
        this.password = password;

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
