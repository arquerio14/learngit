package org.example.ilkjava;

import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    public void beniTiklaMetotu(ActionEvent actionEvent){

        String butonYazisi = ((Button) (actionEvent.getSource())).getText();

        if (butonYazisi == "Beni tıkla"){
            System.out.println("1. Butona tıklandı.");
        }else if (butonYazisi == "2. buton"){
            System.out.println("2. Butona tıklandı.");
        }else {
            System.out.println("3. Butona tıklandı.");
        }
    }
}
