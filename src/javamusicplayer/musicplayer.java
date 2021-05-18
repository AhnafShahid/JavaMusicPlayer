/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamusicplayer;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Ahnaf
 */
public class musicplayer {
    static musicplayer player = new musicplayer();
    static Clip clip;
    
    private musicplayer(){
        
    }
    
    public static musicplayer getInstance(){
        return player;
    }
    
    public static void loadMusic(String filepath)
    {
        
        try{
            
            File musicPath = new File (filepath);
            
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                
            }
           
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    
}
