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
public class FactoryMethodDemo {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = "duckyou.gif";
        String format = "gif";
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}