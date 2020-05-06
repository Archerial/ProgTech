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
abstract public class AComputer
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
    
     public abstract int getAr();

    public abstract void setAr(int ar) throws CannotBeNegative;

    public abstract String getProccesszorHűtő();

    public abstract void setProccesszorHűtő(String proccesszorHűtő);

    public abstract String getAlaplap();

    public abstract void setAlaplap(String alaplap);

    public abstract String getProcceszor();

    public abstract void setProcceszor(String procceszor);

    public abstract String getRamTipus();

    public abstract void setRamTipus(String ramTipus);

    public abstract int getRamMeret();

    public abstract void setRamMeret(int ramMeret) throws CannotBeNegative;

    public abstract String getVideoKartyaTipus();

    public abstract void setVideoKartyaTipus(String videoKartyaTipus);

    public abstract String getHatterTar();

    public abstract void setHatterTar(String hatterTar);

    public abstract int getVideoKartyaMeret();

    public abstract void setVideoKartyaMeret(int videoKartyaMeret) throws CannotBeNegative;

    public abstract String getTapegyseg();

    public abstract void setTapegyseg(String tapegyseg);

    public abstract int getTapegysegTeljesitmeny();

    public abstract void setTapegysegTeljesitmeny(int tapegysegTeljesitmeny) throws CannotBeNegative;

    public abstract String getHazTípus();

    public abstract void setHazTípus(String hazTípus);
    
    
    public abstract String print();
}
