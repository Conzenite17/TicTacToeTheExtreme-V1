package sample;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    public void boxClick(MouseEvent event){
        String id = event.getPickResult().getIntersectedNode().getId();
        System.out.println("Clicked! " + id);

    }

}
