package Cls_Sonido;

import java.applet.AudioClip;

public class Sonido{
        AudioClip sonido;
     
       public void musica(){
       
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Cls_Sonido/Mouse.wav"));
        sonido.play();
        System.out.println("Sonido ON");
      }
   }

