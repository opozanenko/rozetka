package com.rozetka.data;

public final class UserRepository {

    public IUser getHahaha() {
        return User.get()
                .setEmail("hahahatest@ukr.net")
                .setPassword(System.getenv().get("MY_PASSWORD"))
                .build();
    }

}
