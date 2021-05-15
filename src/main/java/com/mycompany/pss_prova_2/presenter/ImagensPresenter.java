package com.mycompany.pss_prova_2.presenter;

import com.mycompany.pss_prova_2.proxy.Imagem;
import com.mycompany.pss_prova_2.proxy.ImagemProxy;
import com.mycompany.pss_prova_2.view.ImagensView;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public final class ImagensPresenter {
    
    private ImagensView view;

    public ImagensPresenter() {
        configurarTela();
    }

    private void configurarTela() {
        this.view = new ImagensView();
        this.view.setTitle("Visualizar últimas imagens");
        
        this.view.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                view.setLocationRelativeTo(null);
            }
            
        });
        
        carregarImagem();
        
        this.view.setVisible(true);
    }

    private void carregarImagem() {
        Imagem imagem1 = new ImagemProxy("");
        //ImageIcon icon = new ImageIcon(imagem1.mostrarImagem());
        
        BufferedImage suaImagem = null;
        try {
            suaImagem = ImageIO.read(getClass().getResource("src/main/java/com/mycompany/pss_prova_2/imagens/imagem_1.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ImagensPresenter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageIcon imageIcon = new ImageIcon(suaImagem);
        this.view.getjLabelImagem().setIcon(imageIcon);
    }
    
}
