package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Controller {
    @FXML
    private javafx.scene.control.Label szamok;
    @FXML
    private boolean sorsolE;
    @FXML
    private Button btnSorsol;
    int i = 0;
    int[] votma = new int[5];
    int rnd;
    @FXML
    public void sorsolRendezClick() {
        if (i < 5) {
            Sorsol();
            i++;
        } else {
            Rendez();
        }
    }

    private void Sorsol() {
        Random rand = new Random();
        rnd = rand.nextInt(90);
        for (int i = 0; i <5; i++) {
            if (rnd == votma[i])
            {
                rnd++;
            }
            votma[votma.length-(1+i)] = rnd;
        }
        szamok.setText(Integer.toString(rnd));
        Arrays.sort(votma);
    }

    private void Rendez() {
        btnSorsol.setText("Rendez");
            szamok.setText(Arrays.toString(votma));

    }
}
