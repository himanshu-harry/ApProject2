package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Level_Controller {


    Stage curstage = Main.stage;


    @FXML
    private void Gotofirstpage(ActionEvent event)throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene2 = new Scene(view2,610,345);

        this.curstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        this.curstage.setScene(scene2);
        //this.curstage.setResizable(false);
        this.curstage.show();

    }



}