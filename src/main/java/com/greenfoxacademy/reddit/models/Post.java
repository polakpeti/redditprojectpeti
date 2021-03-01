package com.greenfoxacademy.reddit.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Setter
@Getter
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    private Long timestamp;
    private int score;

    public Post() {
        this.timestamp = System.currentTimeMillis();
    }
}
