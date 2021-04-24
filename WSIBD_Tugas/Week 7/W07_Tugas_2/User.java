/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W07_Tugas_2;

/**
 *
 * @author DAFFA ALFIN NURILANBIYA
 */
public class User {
    public static void main (String[] args){
        Televisi tv = new Televisi ("TV LG, 24 inches", 10);
        String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
                                  "METRO TV", "TRANS TV", "TPI", "TV 7", 
                                  "TVRI", "TV G", "ANTV"};
        String [] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                    "METRO TV", "TRANS TV", "TPI", "TV 7"};
        System.out.println ("Daffa Alfin membeli Televisi : " + tv.getDeskripsi());
        
        tv.getchannel();
        tv.setchannel(semuaChannel);
        tv.setchannel(channelFavorit);
        
        tv.setchannelAktif(3);
        tv.setvolume(10);
        tv.setchannelAktif(2);
        tv.setchannelAktif(1);
        
    }
}