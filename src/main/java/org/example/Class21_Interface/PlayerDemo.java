package org.example.Class21_Interface;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayerDemo {
    public static void main(String[] args) throws JavaLayerException, FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\TEMP.Hossain-PC\\Desktop\\idk\\SDETJavaBatch19\\src\\main\\java\\org\\example\\Class21\\Ambient-music-free (1).mp3");
        Player p = new Player(fis);
        p.play();
    }
}
