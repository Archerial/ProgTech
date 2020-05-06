package com.mycompany.progtech;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Adam
 */
public class ComputerTest {
    
    Computer testComp; 
    
    @Before
    public void setUp() throws Exception {
         testComp = new Computer("Intel i7","HyperX",16,"nVidia","SSD",8,"beQuiet",500,"Cougar","ASUS","Artic",300000);
         System.out.println(testComp.print());
    }
    @After
    public void tearDown() throws Exception {
        System.out.println(testComp.print());
        testComp = null;
    }
    
    //A modell mezőinek elérésé/módosítása érdekében létre hozott tesztek
    
    @Test
    public void testGetAr() {
        testComp.getAr();
    }
    @Test
    public void testSetAr() throws CannotBeNegative{
        testComp.setAr(350000);
    }
    @Test
    public void testGetProccesszorHűtő() {
        testComp.getProccesszorHűtő();
    }
    @Test
    public void testSetProccesszorHűtő() {
        testComp.setProccesszorHűtő("CoolerMaster");
    }
    @Test
    public void testGetAlaplap() {
        testComp.getAlaplap();
    }
    @Test
    public void testSetAlaplap() {
        testComp.setAlaplap("ASUS-TUF");
    }
    @Test
    public void testGetProcceszor() {
        testComp.getProcceszor();
    }
    @Test
    public void testSetProcceszor() {
        testComp.setProcceszor("AMD");
    }
    @Test
    public void testGetRamTipus() {
        testComp.getRamTipus();
    }
    @Test
    public void testSetRamTipus() {
        testComp.setRamTipus("Kingston");
    }
    @Test
    public void testGetRamMeret() {
        testComp.getRamMeret();
    }
    @Test
    public void testSetRamMeret() throws CannotBeNegative {
        testComp.setRamMeret(8);
    }
    @Test
    public void testGetVideoKartyaTipus() {
        testComp.getVideoKartyaTipus();
    }
    @Test
    public void testSetVideoKartyaTipus() {
        testComp.setVideoKartyaTipus("AMD-FX");
    }
    @Test
    public void testGetHatterTar() {
        testComp.getHatterTar();
    }
    @Test
    public void testSetHatterTar() {
        testComp.setHatterTar("HDD");
    }
    @Test
    public void testGetVideoKartyaMeret() {
        testComp.getVideoKartyaMeret();
    }
    @Test
    public void testSetVideoKartyaMeret() throws CannotBeNegative{
        testComp.setVideoKartyaMeret(16);
    }
    @Test
    public void testGetTapegyseg() {
        testComp.getTapegyseg();
    }
    @Test
    public void testSetTapegyseg() {
        testComp.setTapegyseg("TeslaX");
    }
    @Test
    public void testGetTapegysegTeljesitmeny() {
        testComp.getTapegysegTeljesitmeny();
    }
    @Test
    public void testSetTapegysegTeljesitmeny() throws CannotBeNegative {
        testComp.setTapegysegTeljesitmeny(500);
    }
    @Test
    public void testGetHazTípus() {
        testComp.getHazTípus();
    }
    @Test
    public void testSetHazTípus() {
        testComp.setHazTípus("Cougar");
    }
    
    //Exceptiont váró tesztek
    
    @Test(expected = CannotBeNegative.class)
    public void testSetArWithWrongNumber() throws CannotBeNegative {
        testComp.setAr(-100000);
    }
    @Test(expected = CannotBeNegative.class)
    public void testSetRamMeretWithWrongInput() throws CannotBeNegative {
        testComp.setRamMeret(-16);
    }
    @Test(expected = CannotBeNegative.class)
    public void testSetVideoKartyaMeretWithWrongInput() throws CannotBeNegative {
        testComp.setVideoKartyaMeret(-16);
    }
    @Test(expected = CannotBeNegative.class)
    public void testSetTapegysegTeljesitmenyWithWrongInput() throws CannotBeNegative {
        testComp.setTapegysegTeljesitmeny(-500);
    }
}
