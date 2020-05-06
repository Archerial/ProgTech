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
abstract public class ComputerPlus extends AComputer
{
    protected AComputer computer;
    public ComputerPlus(AComputer computer){
        this.computer = computer;
    }
    
     public RGB newInstance(AComputer computer){
        return new RGB(computer);
    }
    
    @Override
    public String print() {
        return computer.print() + printPlus();
    }
    
    public abstract String printPlus();
    
     @Override
    public int getAr() {
       return computer.getAr();
    }

    @Override
    public void setAr(int ar) throws CannotBeNegative {
       computer.setAr(ar);
    }

    @Override
    public String getProccesszorHűtő() {
        return computer.getProccesszorHűtő();
    }

    @Override
    public void setProccesszorHűtő(String proccesszorHűtő) {
        computer.setProccesszorHűtő(proccesszorHűtő);
    }

    @Override
    public String getAlaplap() {
        return computer.getAlaplap();
    }

    @Override
    public void setAlaplap(String alaplap) {
        computer.setAlaplap(alaplap);
    }

    @Override
    public String getProcceszor() {
        return computer.getProcceszor();
    }

    @Override
    public void setProcceszor(String procceszor) {
        computer.setProcceszor(procceszor);
    }

    @Override
    public String getRamTipus() {
        return computer.getRamTipus();
    }

    @Override
    public void setRamTipus(String ramTipus) {
        computer.setRamTipus(ramTipus);
    }

    @Override
    public int getRamMeret() {
        return  computer.getRamMeret();
    }

    @Override
    public void setRamMeret(int ramMeret) {
        computer.setRamMeret(ramMeret);
    }

    @Override
    public String getVideoKartyaTipus() {
        return computer.getVideoKartyaTipus();
    }

    @Override
    public void setVideoKartyaTipus(String videoKartyaTipus) {
        computer.setVideoKartyaTipus(videoKartyaTipus);
    }

    @Override
    public String getHatterTar() {
        return computer.getHatterTar();
    }

    @Override
    public void setHatterTar(String hatterTar) {computer.setHatterTar(hatterTar);
    }

    @Override
    public int getVideoKartyaMeret() {
        return computer.getVideoKartyaMeret();
    }

    @Override
    public void setVideoKartyaMeret(int videoKartyaMeret) {
        computer.setVideoKartyaMeret(videoKartyaMeret);
    }

    @Override
    public String getTapegyseg() {
        return computer.getTapegyseg();
    }

    @Override
    public void setTapegyseg(String tapegyseg) {
        computer.setTapegyseg(tapegyseg);
    }

    @Override
    public int getTapegysegTeljesitmeny() {
        return computer.getTapegysegTeljesitmeny();
    }

    @Override
    public void setTapegysegTeljesitmeny(int tapegysegTeljesitmeny) {
        computer.setTapegysegTeljesitmeny(tapegysegTeljesitmeny);
    }

    @Override
    public String getHazTípus() {
        return computer.getHazTípus();
    }

    @Override
    public void setHazTípus(String hazTípus) {
        computer.setHazTípus(hazTípus);
    }
    
}
