package com.jannbackendv2;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private long score;
    private long time;

    public Instant getCreatedAt() {
        return createdAt;
    }

    private Instant createdAt;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getScore() {
        return score;
    }

    public long getTime() {
        return time;
    }


    public Entry(String name, Long score, Long time) {
        this.name = name;
        this.score = score;
        this.time = time;
        this.createdAt = Instant.now();
    }

    public Entry(){

    }
}
