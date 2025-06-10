package org.example.adapter;

import java.util.Scanner;

public class SistemaReproducao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Tipo do arquivo [mp3 / wav]: ");
        String tipoArquivo = scan.next();

        System.out.print("Nome do arquivo: ");
        String nomeArquivo = scan.next();

        scan.close();

        Mp3Player mp3Player;

        if(tipoArquivo.equals("mp3")){
            mp3Player = new Mp3Player();
            mp3Player.playMp3(nomeArquivo);
        }
        else if (tipoArquivo.equals("wav")) {
            mp3Player = new Mp3Adapter(new WavPlayerLib());
            mp3Player.playMp3(nomeArquivo);
        }
        else {
            System.out.println("Formato não suportado.");
        }

        /*
        PlugueDoisPinos plugue = new PlugueDoisPinos();
        TomadaTresPinos tomada = new AdaptadorTomada(plugue);

        tomada.conectaTresPinos();
         */
    }

}
