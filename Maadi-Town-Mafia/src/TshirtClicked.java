import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
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

public class TshirtClicked  implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    Button small = new Button("S");
    Button medium = new Button("M");
    Button large = new Button("L");
    Button white = new Button("White");
    Button blue = new Button("Blue");
    Button black = new Button("Black");
    Button checkout = new Button("Checkout");
    Button Return = new Button("Return");
    Text size= new Text("Size");
    Text colour = new Text("Colour");
    Image tshirtImg=new Image("tshirt.jpg");
    ImageView tshirtview = new ImageView(tshirtImg);

    Background background = new Background(new BackgroundFill(Color.LIGHTBLUE, null,null));
    Image img=new Image("background.jpg");
    Background background2 = new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,new BackgroundSize(700, 500, false, false, false, false)));
    TshirtClicked(Stage s){
        this.primaryStage=s;
    }
    void createNewSceneLogin(Stage primaryStage){
        primaryStage.setTitle("Tshirt");
        Pane pane1= new Pane();
        Scene scene1 = new Scene(pane1,700,500);
        pane1.getChildren().addAll(small,medium,large,white,blue,black,size,colour,checkout,Return,tshirtview);
        tshirtview.fitHeightProperty().bind(scene1.heightProperty().divide(5));
        tshirtview.fitWidthProperty().bind(scene1.widthProperty().divide(5));
        pane1.setBackground(background2);
        resize(pane1,scene1);
        scene1.widthProperty().addListener((obs,oldWidth,newWidth)->resize(pane1,scene1));
        scene1.heightProperty().addListener((obs,oldHeight,newHeight)->resize(pane1,scene1));
        size.setFill(Color.BROWN);

        size.setStrokeWidth(2);

        size.setStroke(Color.RED);

        colour.setFill(Color.BROWN);

        colour.setStrokeWidth(2);

        colour.setStroke(Color.RED);


        ShoppingCart handle3 = new ShoppingCart(primaryStage);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public void resize(Pane p , Scene s) {
        double sceneWidth = s.getWidth();
        double sceneHeight = s.getHeight();
        small.setLayoutX(sceneWidth*0.9/2);
        small.setLayoutY(sceneHeight/3);

        medium.setLayoutX(sceneWidth/2);
        medium.setLayoutY((sceneHeight/3));

        large.setLayoutX(sceneWidth*1.1/2);
        large.setLayoutY(sceneHeight/3);

        white.setLayoutX(sceneWidth*0.8/2);
        white.setLayoutY((sceneHeight/2));

        black.setLayoutX(sceneWidth/2);
        black.setLayoutY(sceneHeight/2);

        blue.setLayoutX(sceneWidth*1.2/2);
        blue.setLayoutY(sceneHeight/2);

        size.setLayoutX(sceneWidth*0.8/2);
        size.setLayoutY(sceneHeight/3);

        colour.setLayoutX(sceneWidth*0.7/2);
        colour.setLayoutY(sceneHeight/2);

        checkout.setLayoutX(sceneWidth*0.8/2);
        checkout.setLayoutY(sceneHeight*1.2/2);

        Return.setLayoutX(sceneWidth*1.2/2);
        Return.setLayoutY(sceneHeight*1.2/2);

        tshirtview.setLayoutX(sceneWidth*1.2/3);
        tshirtview.setLayoutY(sceneHeight/9);
    }
    @Override
    public void handle(ActionEvent a){
        createNewSceneLogin(primaryStage);
    }

}