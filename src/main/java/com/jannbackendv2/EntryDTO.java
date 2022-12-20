package com.jannbackendv2;

import jakarta.annotation.Nonnull;

public class EntryDTO {

    @Nonnull
    private String _name;


    private Long _score;
    private Long _time;

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_score(Long _score) {
        this._score = _score;
    }

    public void set_time(Long _time) {
        this._time = _time;
    }

    public String get_name() {
        return _name;
    }

    public Long get_score() {
        return _score;
    }

    public Long get_time() {
        return _time;
    }


    public EntryDTO(String _name, Long _score, Long _time) {
        this._name = _name;
        this._score = _score;
        this._time = _time;
    }
}
