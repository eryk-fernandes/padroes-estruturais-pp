package org.example.adapter;

import java.util.Scanner;

public class SistemaReproducao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeArquivo = "song.wav";

        Mp3Player mp3Player = new Mp3Adapter(new WavPlayerLib());
        mp3Player.playMp3(nomeArquivo);

    }

}
