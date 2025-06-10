package org.example.adapter;

public class SistemaReprodução {
    public static void main(String[] args) {

        String tipoArquivo = "wav";
        String nomeArquivo = "voz.wav";

        if(tipoArquivo.equals("mp3")){
            Mp3Player mp3 = new Mp3Player();
            mp3.playMp3(nomeArquivo);
        } else if (tipoArquivo.equals("wav")) {
            WavPlayerLib wav = new WavPlayerLib();
            wav.playWavArquivo(nomeArquivo);
        }else {
            System.out.println("Formato não suportado.");
        }

    }
}
