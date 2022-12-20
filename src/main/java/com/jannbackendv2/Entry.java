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


    private String _name;
    private long _score;
    private long _time;

    public Instant getCreatedAt() {
        return createdAt;
    }

    private Instant createdAt;

    public long getId() {
        return id;
    }

    public String get_name() {
        return _name;
    }

    public long get_score() {
        return _score;
    }

    public long get_time() {
        return _time;
    }


    public Entry(String _name, Long _score, Long _time) {
        this._name = _name;
        this._score = _score;
        this._time = _time;
        this.createdAt = Instant.now();
    }

    public Entry(){

    }
}
