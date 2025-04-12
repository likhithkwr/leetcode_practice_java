package com.leetcode.practice;

import com.leetcode.practice.model.Problem;
import com.leetcode.practice.repository.ProblemRepository;

import java.util.*;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ProblemRepository repo = new ProblemRepository();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Problem\n2. View Unsolved\n3. By Tag\n4. Mark Solved\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addProblem();
                case 2 -> viewUnsolved();
                case 3 -> filterByTag();
                case 4 -> markSolved();
                case 5 -> System.exit(0);
            }
        }
    }
 
    private static void addProblem() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Difficulty: ");
        String difficulty = scanner.nextLine();

        System.out.print("Tags (comma-separated): ");
        String[] tags = scanner.nextLine().split(",");

        System.out.print("Link: ");
        String link = scanner.nextLine();

        int id = repo.getAllProblems().size() + 1;
        Problem p = new Problem(id, title, difficulty, List.of(tags), link);
        repo.addProblem(p);
        System.out.println("Problem added.");
    }

    private static void viewUnsolved() {
        repo.getUnsolvedProblems().forEach(System.out::println);
    }

    private static void filterByTag() {
        System.out.print("Enter tag: ");
        String tag = scanner.nextLine();
        repo.getProblemsByTag(tag).forEach(System.out::println);
    }

    private static void markSolved() {
        System.out.print("Enter problem ID to mark as solved: ");
        int id = scanner.nextInt();
        repo.markAsSolved(id);
        System.out.println("Marked as solved.");
    }
}
