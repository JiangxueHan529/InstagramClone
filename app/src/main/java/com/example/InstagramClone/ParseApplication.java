package com.example.InstagramClone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QAF7ptTWE4dtQEttY4SOxbL7enSxFJnHlZ8dQqKf")
                .clientKey("jpNsHMKULCvOhlEgV6t6xJvb1PgpkIcOqRUfpw4v")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
