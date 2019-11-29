package sample;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LawnController implements Initializable   {
    private Stage curstage = Main.stage;

    private TextField Counter;

    @FXML
    private Button sun1;
    @FXML
    private Button mover11;
    @FXML
    private Button mover22;
    @FXML
    private Button mover33;
    @FXML
    private Button mover44;
    @FXML
    private Button mover55;
    @FXML
    private Button pea;
    @FXML
    private Button zombie1;
    @FXML
    private Button zombie2;
    @FXML
    private Label mymsg;





    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int x = 500;
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(10));
        transition.setNode(sun1);
        transition.setCycleCount(500);

        transition.setToX(+500);
        transition.setToY(x++);
        ///////////////////////////////////////////

        TranslateTransition transition2 = new TranslateTransition();
        transition2.setDuration(Duration.seconds(30));
        transition2.setNode(zombie1);

        transition2.setToX(-800);
        ////////////////////////////////////////////
        TranslateTransition transition3 = new TranslateTransition();
        transition3.setDuration(Duration.seconds(20));
        transition3.setNode(zombie2);

        transition3.setToX(-800);
        /////////////////////////////////////////////
        TranslateTransition transition4 = new TranslateTransition();
        transition4.setDuration(Duration.seconds(20));
        transition4.setNode(mover33);

        transition4.setToX(+500);
        //////////////////////////////////////////////////////
        TranslateTransition transition5 = new TranslateTransition();
        transition5.setDuration(Duration.seconds(20));
        transition5.setNode(mover55);

        transition5.setToX(+500);
        ////////////////////////////////////////////

        TranslateTransition transition6 = new TranslateTransition();
        transition6.setDuration(Duration.seconds(1.3));
        transition6.setNode(pea);
        transition6.setCycleCount(500);

        transition6.setToX(+500);

        transition.play();
        transition2.play();
        transition3.play();
        transition4.play();
        transition5.play();
        transition6.play();
        //transition.play();


    }

    @FXML
    private void PausePage (ActionEvent event)throws IOException {
        Parent view2 = FXMLLoader.load(getClass().getResource("PausePage.fxml"));
        Scene scene2 = new Scene(view2, 610, 345);
        this.curstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.curstage.setScene(scene2);
        this.curstage.show();
    }
    Timeline animation;
    int count = 60;
    String s = "";



    @FXML
    private void Counter (ActionEvent event)throws IOException {
        animation = new Timeline(new KeyFrame(Duration.seconds(1)));

        if(count > 0){
            count--;
        }
        s = count + "";
        mymsg.setText(s);
        animation.setCycleCount(Timeline.INDEFINITE);
    }

    @FXML
    private void Sun_disappear (ActionEvent event)throws IOException {
        sun1.setDisable(true);
        sun1.setVisible(false);
    }











}

