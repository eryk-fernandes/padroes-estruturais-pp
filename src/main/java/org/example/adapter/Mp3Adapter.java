package org.example.adapter;

public class Mp3Adapter extends Mp3Player {

    private WavPlayerLib wavPlayer;

    public Mp3Adapter(WavPlayerLib wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    @Override
    public void playMp3(String nomeArquivo){
        System.out.println("Usando adaptador de wav para mp3...");
        wavPlayer.playWavArquivo(nomeArquivo);
    }

}
