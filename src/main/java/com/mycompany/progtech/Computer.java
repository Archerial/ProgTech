/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtech;

/**
 *
 * @author Adam
 */
public class Computer extends AComputer
{
    private String procceszor;
    private String ramTipus;
    private int ramMeret;
    private String videoKartyaTipus;
    private String hatterTar;
    private int videoKartyaMeret;
    private String tapegyseg;
    private int tapegysegTeljesitmeny;
    private String hazTípus; 
    private String alaplap;
    private String proccesszorHűtő;
    private int ar;

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public String getProccesszorHűtő() 
    {
        return proccesszorHűtő;
    }

    public void setProccesszorHűtő(String proccesszorHűtő) 
    {
        this.proccesszorHűtő = proccesszorHűtő;
    }

    public String getAlaplap() 
    {
        return alaplap;
    }

    public void setAlaplap(String alaplap) 
    {
        this.alaplap = alaplap;
    }

    public String getProcceszor() 
    {
        return procceszor;
    }

    public void setProcceszor(String procceszor) 
    {
        this.procceszor = procceszor;
    }

    public String getRamTipus() 
    {
        return ramTipus;
    }

    public void setRamTipus(String ramTipus) 
    {
        this.ramTipus = ramTipus;
    }

    public int getRamMeret() 
    {
        return ramMeret;
    }

    public void setRamMeret(int ramMeret) 
    {
        this.ramMeret = ramMeret;
    }

    public String getVideoKartyaTipus() 
    {
        return videoKartyaTipus;
    }

    public void setVideoKartyaTipus(String videoKartyaTipus) 
    {
        this.videoKartyaTipus = videoKartyaTipus;
    }

    public String getHatterTar() 
    {
        return hatterTar;
    }

    public void setHatterTar(String hatterTar) 
    {
        this.hatterTar = hatterTar;
    }

    public int getVideoKartyaMeret() 
    {
        return videoKartyaMeret;
    }

    public void setVideoKartyaMeret(int videoKartyaMeret) 
    {
        this.videoKartyaMeret = videoKartyaMeret;
    }

    public String getTapegyseg() 
    {
        return tapegyseg;
    }

    public void setTapegyseg(String tapegyseg) 
    {
        this.tapegyseg = tapegyseg;
    }

    public int getTapegysegTeljesitmeny() 
    {
        return tapegysegTeljesitmeny;
    }

    public void setTapegysegTeljesitmeny(int tapegysegTeljesitmeny) 
    {
        this.tapegysegTeljesitmeny = tapegysegTeljesitmeny;
    }

    public String getHazTípus() 
    {
        return hazTípus;
    }

    public void setHazTípus(String hazTípus) {
        this.hazTípus = hazTípus;
    }
    
    public Computer(String procceszor, String ramTipus, int ramMeret, String videoKartyaTipus, String hatterTar, int videoKartyaMeret, String tapegyseg, int tapegysegTeljesitmeny, String hazTípus, String alaplap, String proccesszorHűtő, int ar) {
        this.procceszor = procceszor;
        this.ramTipus = ramTipus;
        this.ramMeret = ramMeret;
        this.videoKartyaTipus = videoKartyaTipus;
        this.hatterTar = hatterTar;
        this.videoKartyaMeret = videoKartyaMeret;
        this.tapegyseg = tapegyseg;
        this.tapegysegTeljesitmeny = tapegysegTeljesitmeny;
        this.hazTípus = hazTípus;
        this.alaplap = alaplap;
        this.proccesszorHűtő = proccesszorHűtő;
        this.ar = ar;
    }
    
    

    @Override
    public String print() {
        return "Proccesszor típusa:" + procceszor + " RAM típusa: " + ramTipus + "" + ramMeret + " Gb" + " Videókáryta: " + videoKartyaTipus + " " +  videoKartyaMeret +" Gb";
    }
    
    
    
}
