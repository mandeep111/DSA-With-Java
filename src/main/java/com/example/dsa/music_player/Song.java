package com.example.dsa.music_player;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Song {
    int sequence;
    String name;
    String artist;
    String next;
}
