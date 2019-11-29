package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    public Button closeButton;
    //Stage stage = new Stage();
    Stage curstage = Main.stage;


    @FXML
    private void addScene(ActionEvent event)throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("Registration.fxml"));

        Scene scene2 = new Scene(view2,610,345);
        this.curstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        this.curstage.setScene(scene2);
        this.curstage.show();
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void For_Load_Page(ActionEvent event)throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("LoadPage.fxml"));

        Scene scene2 = new Scene(view2,610,345);
        this.curstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        this.curstage.setScene(scene2);
        this.curstage.show();
    }

    @FXML
    private void GoToLevel(ActionEvent event)throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("Level.fxml"));

        Scene scene2 = new Scene(view2,610,345);

        //Stage stage = new Stage();
        this.curstage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        this.curstage.setScene(scene2);
        this.curstage.show();

    }


}
