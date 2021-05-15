package com.mycompany.pss_prova_2.proxy;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImagemReal implements Imagem {
    
    private String ImagemPath;

    public ImagemReal(String imagemPath) {
        this.ImagemPath = imagemPath;
    }

    private Image carregarImagem() {

        // load Image from disk into memory
        // this is heavy and costly operation
        Image image = null;
//        try {
//            URL url = new URL("https://bit.ly/3fgPeCe");
//            image = ImageIO.read(url.openStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return image;
    }

    @Override
    public Image mostrarImagem() {
        return carregarImagem();
    }

}
