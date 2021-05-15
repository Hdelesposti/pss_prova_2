package com.mycompany.pss_prova_2.proxy;

import java.awt.Image;

public class ImagemProxy implements Imagem{
    
    private String ImagemPath;
    
    private Imagem imagemReal;

    public ImagemProxy(String ImagemPath) {
        this.ImagemPath = ImagemPath;
    }

    @Override
    public Image mostrarImagem() {
        if (this.imagemReal == null) {
            this.imagemReal = new ImagemReal(ImagemPath);
        }
        return this.imagemReal.mostrarImagem();
    }
    
}
