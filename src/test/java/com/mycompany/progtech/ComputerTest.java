package com.mycompany.progtech;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
         testComp = new Computer("Intel i7","HyperX",16,"nVidia","SSD",8,"beQuiet",550,"Cougar","ASUS","Artic",300000);
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
        assertEquals(300000,testComp.getAr());
    }
    @Test
    public void testSetAr() throws CannotBeNegative{
        testComp.setAr(350000);
        assertEquals(350000,testComp.getAr());
    }
    @Test
    public void testGetProccesszorHűtő() {
        assertEquals("Artic",testComp.getProccesszorHűtő());
    }
    @Test
    public void testSetProccesszorHűtő() {
        testComp.setProccesszorHűtő("CoolerMaster");
        assertEquals("CoolerMaster",testComp.getProccesszorHűtő());
    }
    @Test
    public void testGetAlaplap() {
        assertEquals("ASUS",testComp.getAlaplap());
    }
    @Test
    public void testSetAlaplap() {
        testComp.setAlaplap("ASUS-TUF");
        assertEquals("ASUS-TUF",testComp.getAlaplap());
    }
    @Test
    public void testGetProcceszor() {
        assertEquals("Intel i7",testComp.getProcceszor());
    }
    @Test
    public void testSetProcceszor() {
        testComp.setProcceszor("AMD");
        assertEquals("AMD",testComp.getProcceszor());
    }
    @Test
    public void testGetRamTipus() {
        assertEquals("HyperX",testComp.getRamTipus());
    }
    @Test
    public void testSetRamTipus() {
        testComp.setRamTipus("Kingston");
        assertEquals("Kingston",testComp.getRamTipus());
    }
    @Test
    public void testGetRamMeret() {
        assertEquals(16,testComp.getRamMeret());
    }
    @Test
    public void testSetRamMeret() throws CannotBeNegative {
        testComp.setRamMeret(8);
        assertEquals(8,testComp.getRamMeret());
    }
    @Test
    public void testGetVideoKartyaTipus() {
        assertEquals("nVidia",testComp.getVideoKartyaTipus());
    }
    @Test
    public void testSetVideoKartyaTipus() {
        testComp.setVideoKartyaTipus("AMD-FX");
        assertEquals("AMD-FX",testComp.getVideoKartyaTipus());
    }
    @Test
    public void testGetHatterTar() {
        assertEquals("SSD",testComp.getHatterTar());
    }
    @Test
    public void testSetHatterTar() {
        testComp.setHatterTar("HDD");
        assertEquals("HDD",testComp.getHatterTar());
    }
    @Test
    public void testGetVideoKartyaMeret() {
        assertEquals(8,testComp.getVideoKartyaMeret());
    }
    @Test
    public void testSetVideoKartyaMeret() throws CannotBeNegative{
        testComp.setVideoKartyaMeret(16);
        assertEquals(16,testComp.getVideoKartyaMeret());
    }
    @Test
    public void testGetTapegyseg() {
        assertEquals("beQuiet",testComp.getTapegyseg());
    }
    @Test
    public void testSetTapegyseg() {
        testComp.setTapegyseg("TeslaX");
        assertEquals("TeslaX",testComp.getTapegyseg());
    }
    @Test
    public void testGetTapegysegTeljesitmeny() {
        assertEquals(550,testComp.getTapegysegTeljesitmeny());
    }
    @Test
    public void testSetTapegysegTeljesitmeny() throws CannotBeNegative {
        testComp.setTapegysegTeljesitmeny(500);
        assertEquals(500,testComp.getTapegysegTeljesitmeny());
    }
    @Test
    public void testGetHazTípus() {
        assertEquals("Cougar",testComp.getHazTípus());
    }
    @Test
    public void testSetHazTípus() {
        testComp.setHazTípus("Cougar");
        assertEquals("Cougar",testComp.getHazTípus());
    }
    
    //Exceptiont váró tesztek
    
    @Test(expected = CannotBeNegative.class)
    public void testSetArWithWrongNumber() throws CannotBeNegative {
        testComp.setAr(-100000);
        assertNotEquals(-100000,testComp.getAr());
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
    
    //Generátor tesztek
    
    @Test
    public void testSetArWithGeneratotGood() throws CannotBeNegative {
        for (int i = 1; i < 1000; i += 100){
            testComp.setAr(i);
            assertEquals(i,testComp.getAr());
        }
    }
    
    @Test
    public void testSetVideKartyaMeretGeneratorGood() throws CannotBeNegative{
        for (int i = 1; i < 256; i++){
            testComp.setVideoKartyaMeret(i);
            assertEquals(i,testComp.getVideoKartyaMeret());
        }
    }
    
    @Test
    public void testSetRamMeretGeneratorGood() throws CannotBeNegative {
        for (int i = 1; i < 256; i++){
            testComp.setRamMeret(i);
            assertEquals(i,testComp.getRamMeret());
        }   
    }
    
    @Test
    public void testSetTapegysegTeljesitmenyGeneratorGood() throws CannotBeNegative{
        for (int i = 1; i < 1000; i += 10) {
            testComp.setTapegysegTeljesitmeny(i);
            assertEquals(i,testComp.getTapegysegTeljesitmeny());
        }
        
    }
    
    //Exceptiont váró generátot tesztek
    
    @Test(expected = CannotBeNegative.class)
    public void testSetArWithCiklus() throws CannotBeNegative {
        for (int i = -1000; i != 0; i += 100) {
           testComp.setAr(i);
           assertNotEquals(i,testComp.getAr());
        }
    }
    
    @Test(expected = CannotBeNegative.class)
    public void testSetVideoKartyaMeretGenerator() throws CannotBeNegative {
        for (int i = -256; i != 0; i++) {
            testComp.setVideoKartyaMeret(i);
            assertNotEquals(i,testComp.getVideoKartyaMeret());
        }
    }
    
    @Test(expected = CannotBeNegative.class)
    public void testSetRamMeretGenerator() throws CannotBeNegative {
        for (int i = -256; i != 0; i++) {
            testComp.setRamMeret(i);
            assertNotEquals(i,testComp.getRamMeret());
        }
    }
    
    @Test(expected = CannotBeNegative.class)
    public void testSetTapegysegTeljesitmenyGenerator() throws CannotBeNegative {
        for (int i = -1000; i != 0; i += 10) {
            testComp.setTapegysegTeljesitmeny(i);
            assertNotEquals(i, testComp.getTapegysegTeljesitmeny());
        }
    }
    
     
    
}
