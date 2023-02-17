package com.lnnd.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
<<<<<<< HEAD
        int a=20;
        if (a>0 && a % 2 ==0)
=======
        int a = 10;
        if (a>0)
>>>>>>> demo
            App.setRoot("secondary");
    }
}
