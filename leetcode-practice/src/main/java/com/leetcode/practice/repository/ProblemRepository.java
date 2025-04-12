package com.leetcode.practice.repository;

import com.leetcode.practice.model.Problem;
import java.util.*;

public class ProblemRepository {
    private List<Problem> problems = new ArrayList<>();

    public void addProblem(Problem p) {
        problems.add(p);
    }

    public List<Problem> getUnsolvedProblems() {
        return problems.stream().filter(p -> !p.isSolved()).toList();
    }

    public List<Problem> getProblemsByTag(String tag) {
        return problems.stream().filter(p -> p.getTags().contains(tag)).toList();
    }

    public void markAsSolved(int id) {
        problems.stream().filter(p -> p.getId() == id).findFirst().ifPresent(p -> p.setSolved(true));
    }

    public List<Problem> getAllProblems() {
        return problems;
    }
}
