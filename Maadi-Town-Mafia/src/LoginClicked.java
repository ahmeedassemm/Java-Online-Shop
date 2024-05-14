import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import java.awt.*;

public class LoginClicked implements EventHandler<ActionEvent> {

    private Stage primaryStage;
    Text userNameText= new Text("User Name");
    Text passwordText = new Text("Password");
    TextField nameField= new TextField();
    TextField passwordField = new TextField();
    Background background = new Background(new BackgroundFill(Color.LIGHTBLUE, null,null));
    Button login = new Button("Login");
    Image img=new Image("background.jpg");
    Background background2 = new Background(new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,new BackgroundSize(700, 500, false, false, false, false)));
    LoginClicked(Stage s){
        this.primaryStage=s;
    }
    void createNewSceneLogin(Stage primaryStage){
        primaryStage.setTitle("Login Page");
        Pane pane1= new Pane();
        Scene scene1 = new Scene(pane1,700,500);
        login.setPrefSize(100,50);
        pane1.getChildren().addAll(userNameText,passwordText,nameField,passwordField,login);
        pane1.setBackground(background2);
        resize(pane1,scene1);
        scene1.widthProperty().addListener((obs,oldWidth,newWidth)->resize(pane1,scene1));
        scene1.heightProperty().addListener((obs,oldHeight,newHeight)->resize(pane1,scene1));

        userNameText.setFill(Color.BROWN);

        userNameText.setStrokeWidth(2);

        userNameText.setStroke(Color.GREEN);

        passwordText.setFill(Color.BROWN);

        passwordText.setStrokeWidth(2);

        passwordText.setStroke(Color.GREEN);

        Text errorMessage = new Text("invalid username or password");
        login.setOnMouseClicked(new EventHandler<MouseEvent>() {
            boolean validUser = false;

            @Override
            public void handle(MouseEvent mouseEvent) {
                if (pane1.getChildren().contains(errorMessage)) {
                    pane1.getChildren().remove(errorMessage);
                }
                for (int i = 0; i < User.getNumberOfUsers(); i++) {
                    User testClient = User.getUsers().get(i);

                    if (testClient.getName().equals(nameField.getText()) && testClient.getPassword().equals(passwordField.getText())) {
                        validUser = true;
                        primaryStage.setResizable(true);
                        ShoppingCart handle3 = new ShoppingCart(primaryStage);
//                        login.setOnAction(handle3);
//                        handle3.createNewSceneLogin(primaryStage);
                        handle3.start(primaryStage);
                        break;
                    }
                }
                if (!validUser) {

                    errorMessage.setFill(Color.RED);
                    errorMessage.setX(50);
                    errorMessage.setY(137);
                    pane1.getChildren().add(errorMessage);
                }

            }
        });

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public void resize(Pane p , Scene s) {
        double sceneWidth = s.getWidth();
        double sceneHeight = s.getHeight();
        passwordText.setLayoutX(sceneWidth/3);
        passwordText.setLayoutY(sceneHeight*0.9/3);
        passwordField.setLayoutX(sceneWidth*0.9/2);
        passwordField.setLayoutY((sceneHeight*0.8/3));

        userNameText.setLayoutX(sceneWidth/3);
        userNameText.setLayoutY(sceneHeight*0.9/5);
        nameField.setLayoutX(sceneWidth*0.9/2);
        nameField.setLayoutY((sceneHeight*0.8/5));

        login.setLayoutX(sceneWidth/2);
        login.setLayoutY(sceneHeight/2);


    }
        @Override
    public void handle(ActionEvent a){
        createNewSceneLogin(primaryStage);
    }

}
