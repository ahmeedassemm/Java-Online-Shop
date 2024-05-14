//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import java.io.IOException;


public class Main extends Application{
    Background background = new Background(new BackgroundFill(Color.LIGHTBLUE, null,null));
    Image img=new Image("background.jpg");
    Background background2 = new Background(new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,new BackgroundSize(700, 500, false, false, false, false)));
    Button login= new Button("Login");
    Button signup= new Button("Signup");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Maadi Town Mafia");
        Pane pane1 = new Pane();
        Scene scene1 = new Scene(pane1,600,400);

        login.setPrefSize(100,50);
        signup.setPrefSize(100,50);
        pane1.getChildren().addAll(login,signup);
        resize(pane1,scene1);
        scene1.widthProperty().addListener((obs,oldWidth,newWidth)->resize(pane1,scene1));
        scene1.heightProperty().addListener((obs,oldHeight,newHeight)->resize(pane1,scene1));
        Background background2 = new Background(new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,new BackgroundSize(600, 400, false, false, false, false)));
        pane1.setBackground(background2);

        LoginClicked handle1 = new LoginClicked(primaryStage);
        login.setOnAction(handle1);

        SignupClicked handle2= new SignupClicked(primaryStage);
        signup.setOnAction(handle2);

        primaryStage.setResizable(false);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public void resize(Pane p , Scene s){
        double sceneWidth =s.getWidth();
        double sceneHeight = s.getHeight();

        login.setLayoutX(sceneWidth/2);
        login.setLayoutY(sceneHeight/3);
        signup.setLayoutX(sceneWidth/2);
        signup.setLayoutY(sceneHeight/2);

    }
}