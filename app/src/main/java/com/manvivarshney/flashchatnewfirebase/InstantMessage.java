package com.manvivarshney.flashchatnewfirebase;

import android.support.v7.app.AppCompatActivity;

public class InstantMessage extends AppCompatActivity {
    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
