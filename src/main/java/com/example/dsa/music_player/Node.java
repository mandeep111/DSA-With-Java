package com.example.dsa.music_player;

public class Node {
    Song data;
    Node next;

    public Node(Song data){
        this.data = data;
        next = null;
    }
}
