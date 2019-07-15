package Cls_Sonido;

import java.applet.AudioClip;

public class Sonidos{
        AudioClip sonido;
     
       public void Sonido_Mouse(){
       
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Cls_Sonido/Mouse.wav"));
        sonido.play();
        System.out.println("Sonido Mouse ON");
      }
       public void Sonido_Alarm(){
       
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Cls_Sonido/Alarm.wav"));
        sonido.play();
        System.out.println("Sonido Alarm ON");
      }
   }


