package com.jannbackendv2;

import jakarta.annotation.Nonnull;

public class EntryDTO {

    @Nonnull
    private String name;


    private Long score;
    private Long time;

    public String getGameType() {
        return gameType;
    }

    private String gameType;

    public void set_name(String _name) {
        this.name = name;
    }

    public void set_score(Long _score) {
        this.score = score;
    }

    public void set_time(Long _time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public Long getScore() {
        return score;
    }

    public Long getTime() {
        return time;
    }


    public EntryDTO(String name, Long score, Long time, String gameType) {
        this.name = name;
        this.score = score;
        this.time = time;
        this.gameType = gameType;
    }
}
