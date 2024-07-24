package com.example.dsa.music_player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularLinkedList {
    Node head;
    Node tail;
    int currentState;
    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.currentState = 1;
    }


    void loadSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(Song.builder()
                          .sequence(1)
                          .artist("A")
                          .name("abc")
                          .next(String.valueOf(2))
                          .build());
        songs.add(Song.builder()
                          .sequence(2)
                          .artist("B")
                          .name("bcd")
                          .next(String.valueOf(3))
                          .build());
        songs.add(Song.builder()
                          .sequence(3)
                          .artist("C")
                          .name("cde")
                          .next(String.valueOf(4))
                          .build());
        songs.add(Song.builder()
                          .sequence(4)
                          .artist("D")
                          .name("def")
                          .next(String.valueOf(5))
                          .build());
        songs.add(Song.builder()
                          .sequence(5)
                          .artist("E")
                          .name("efg")
                          .next(String.valueOf(1))
                          .build());
        songs.forEach(s -> createSongs(s.getName(), s.getArtist(), s.getSequence()));
        listSongs();
    }

    void createSongs(String songName, String artistName, int rank) {
        Song song = Song.builder()
                .sequence(rank)
                .artist(artistName)
                .name(songName)
                .next(String.valueOf(rank+1))
                .build();
        Node newSong = new Node(song);
        if (head == null) {
            this.head = newSong;
            newSong.next = head;
            this.tail=newSong;
        } else {
            song.next = String.valueOf(rank+1);
            newSong.next = this.head;
            this.head = newSong;
            tail.next = this.head;
        }
    }

    void listSongs() {
        if (this.head == null) {
            System.out.printf("There are no songs in the playlist [%s]", ":(");
            return;
        }
        Node pointer = head;
        do {
            pointer=pointer.next;
            System.out.println(pointer.data);
        } while(pointer!=head); // traverse until head is found again
        System.out.println();

    }

    void next(Scanner scanner) {
        if (this.head == null) {
            System.out.printf("There are no songs in the playlist %s. Please add some songs", ":(");
            return;
        }
        boolean isFalse;
        Node pointer = head.next;
        do {
            System.out.println("Play Next? (y/n): ");
            String next = scanner.next();
            isFalse = next.equalsIgnoreCase("y");
            if (next.equalsIgnoreCase("y")) {
                pointer = pointer.next;
                System.out.println(pointer.data);
            }
        } while (isFalse);

    }

}