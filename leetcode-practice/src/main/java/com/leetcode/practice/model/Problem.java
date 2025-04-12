package com.leetcode.practice.model;

import java.util.List;

public class Problem {
    private int id;
    private String title;
    private String difficulty; // Easy, Medium, Hard
    private List<String> tags;
    private String link;
    private boolean isSolved;

    public Problem(int id, String title, String difficulty, List<String> tags, String link) {
        this.id = id;
        this.title = title;
        this.difficulty = difficulty;
        this.tags = tags;
        this.link = link;
        this.isSolved = false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getLink() {
        return link;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " (" + difficulty + ") - " + (isSolved ? "Solved" : "Unsolved");
    }
}
