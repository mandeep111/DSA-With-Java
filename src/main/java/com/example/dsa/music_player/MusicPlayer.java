package com.example.dsa.music_player;

import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Load Songs");
            System.out.println("2. Create Songs");
            System.out.println("3. List Songs");
            System.out.println("4. Play Songs");
            System.out.println("5. Exit");
            System.out.println("Enter Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> circularLinkedList.loadSongs();
                case 2 -> createSong(scanner, circularLinkedList);
                case 3 -> circularLinkedList.listSongs();
                case 4 -> circularLinkedList.next(scanner);
                default -> System.out.println("Exiting...");
            }
        } while (choice < 5 && choice > 0);
    }

    private static void createSong(Scanner scanner, CircularLinkedList circularLinkedList) {
        int exitCode;
        int rank = 0;
        do {
            System.out.println("1. Enter song name");
            String songName = scanner.nextLine();
            System.out.println("2. Enter artist name: ");
            String artistName = scanner.nextLine();
            circularLinkedList.createSongs(songName, artistName, rank);
            rank++;
            System.out.println("Press 1 to continue...");
            exitCode = scanner.nextInt();
            scanner.nextLine();
        } while (exitCode == 1);
    }

}
