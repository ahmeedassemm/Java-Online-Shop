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

public class AccessoriesCLicked implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    Button cap = new Button("Cap");
    Button sunglasses = new Button("Sunglasses");
    Button belt = new Button("Belt");
    Button white = new Button("White");
    Button blue = new Button("Blue");
    Button black = new Button("Black");
    Button checkout = new Button("Checkout");
    Text type= new Text("Type");
    Text colour = new Text("Colour");
    Image accessoriesImg=new Image("accessories.jpg");
    ImageView accessoriesview = new ImageView(accessoriesImg);

    Background background = new Background(new BackgroundFill(Color.LIGHTBLUE, null,null));
    Image img=new Image("background.jpg");
    Background background2 = new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,new BackgroundSize(700, 500, false, false, false, false)));
    AccessoriesCLicked(Stage s){
        this.primaryStage=s;
    }
    void createNewSceneLogin(Stage primaryStage){
        primaryStage.setTitle("Accessories");
        Pane pane1= new Pane();
        Scene scene1 = new Scene(pane1,700,500);
        pane1.getChildren().addAll(cap,belt,sunglasses,white,blue,black,type,colour,checkout,accessoriesview);
        pane1.setBackground(background2);
        resize(pane1,scene1);
        scene1.widthProperty().addListener((obs,oldWidth,newWidth)->resize(pane1,scene1));
        scene1.heightProperty().addListener((obs,oldHeight,newHeight)->resize(pane1,scene1));
        accessoriesview.fitHeightProperty().bind(scene1.heightProperty().divide(5));
        accessoriesview.fitWidthProperty().bind(scene1.widthProperty().divide(5));
        type.setFill(Color.BROWN);

        type.setStrokeWidth(2);

        type.setStroke(Color.RED);

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
        cap.setLayoutX(sceneWidth*0.8/2);
        cap.setLayoutY(sceneHeight/3);

        belt.setLayoutX(sceneWidth/2);
        belt.setLayoutY((sceneHeight/3));

        sunglasses.setLayoutX(sceneWidth*1.2/2);
        sunglasses.setLayoutY(sceneHeight/3);

        white.setLayoutX(sceneWidth*0.8/2);
        white.setLayoutY((sceneHeight/2));

        black.setLayoutX(sceneWidth/2);
        black.setLayoutY(sceneHeight/2);

        blue.setLayoutX(sceneWidth*1.2/2);
        blue.setLayoutY(sceneHeight/2);

        type.setLayoutX(sceneWidth*0.7/2);
        type.setLayoutY(sceneHeight/3);

        colour.setLayoutX(sceneWidth*0.7/2);
        colour.setLayoutY(sceneHeight/2);

        checkout.setLayoutX(sceneWidth*0.8/2);
        checkout.setLayoutY(sceneHeight*1.2/2);

        accessoriesview.setLayoutX(sceneWidth*1.2/3);
        accessoriesview.setLayoutY(sceneHeight/9);
    }
    @Override
    public void handle(ActionEvent a){
        createNewSceneLogin(primaryStage);
    }

}