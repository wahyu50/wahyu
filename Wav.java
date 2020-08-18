/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_8;

import java.applet.Applet;
import java.applet.AudioClip;

import java.net.URL;


/**
 *
 * @author Lintang Dwi
 */

public class Wav {
    
    private static AudioClip musik ;
    
    public void mainwav(String source){
        URL url = this.getClass().getResource(source) ;
        musik = Applet.newAudioClip(url);
        musik.play();
    }
    public void stopwav(String source){
        URL url = this.getClass().getResource(source) ;
        musik = Applet.newAudioClip(url) ;
        musik.stop();
    }
    
    public static void main(String[] args) {
        Wav sik = new Wav();
        sik.mainwav("file_example_WAV_1MG.wav");
    }
}