
import javafx.application.Application;
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
import javafx.scene.image.ImageView;

public class ShoppingCart extends Application implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    Button tshirt= new Button("Tshirt");
    Button pants = new Button("Pants");
    Button shoes = new Button("Shoes");
    Button jacket = new Button("Jacket");
    Button accessories = new Button("Accessories");

    Image img=new Image("background.jpg");
    Image tshirtImg=new Image("tshirt.jpg");
    Image pantsImg=new Image("pants.jpg");
    Image shoesImg=new Image("shoes.jpg");
    Image jacketImg=new Image("jacket.jpg");
    Image accessoriesImg=new Image("accessories.jpg");
    ImageView tshirtview = new ImageView(tshirtImg);
    ImageView pantsview = new ImageView(pantsImg);
    ImageView shoesview = new ImageView(shoesImg);
    ImageView jacketview = new ImageView(jacketImg);
    ImageView accessoriesview = new ImageView(accessoriesImg);

    Background background2 = new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,new BackgroundSize(1000, 700, false, false, false, false)));
    ShoppingCart(Stage s){
        this.primaryStage=s;
    }
    public void start(Stage primaryStage){
        primaryStage.setTitle("Shopping Cart");
        Pane pane1= new Pane();
        Scene scene1 = new Scene(pane1,1000,700);
        pane1.getChildren().addAll(tshirt,pants,shoes,jacket,accessories,tshirtview,pantsview,shoesview,jacketview,accessoriesview);
        primaryStage.setResizable(false);
        tshirtview.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        tshirtview.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        pantsview.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        pantsview.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        shoesview.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        shoesview.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        jacketview.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        jacketview.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        accessoriesview.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        accessoriesview.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        tshirt.setPrefSize(100,50);
        pants.setPrefSize(100,50);
        jacket.setPrefSize(100,50);
        shoes.setPrefSize(100,50);
        accessories.setPrefSize(100,50);

        pane1.setBackground(background2);
        resize(pane1,scene1);
        scene1.widthProperty().addListener((obs,oldWidth,newWidth)->resize(pane1,scene1));
        scene1.heightProperty().addListener((obs,oldHeight,newHeight)->resize(pane1,scene1));

        TshirtClicked handle1 = new TshirtClicked(primaryStage);
        tshirt.setOnAction(handle1);

        PantsCLicked handle2 = new PantsCLicked(primaryStage);
        pants.setOnAction(handle2);

        JacketClicked handle3 = new JacketClicked(primaryStage);
        jacket.setOnAction(handle3);

        ShoesClicked handle4 = new ShoesClicked(primaryStage);
        shoes.setOnAction(handle4);

        AccessoriesCLicked handle5 = new AccessoriesCLicked(primaryStage);
        accessories.setOnAction(handle5);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public void resize(Pane p , Scene s) {
        double sceneWidth = s.getWidth();
        double sceneHeight = s.getHeight();
        tshirt.setLayoutX(sceneWidth*1.2/6);
        tshirt.setLayoutY(sceneHeight*0.8/2);

        pants.setLayoutX(sceneWidth*1.4/2);
        pants.setLayoutY((sceneHeight*0.8/2));

        shoes.setLayoutX(sceneWidth*1.5/2);
        shoes.setLayoutY(sceneHeight*1.7/2);

        jacket.setLayoutX(sceneWidth/6);
        jacket.setLayoutY((sceneHeight*1.7/2));

        accessories.setLayoutX(sceneWidth*0.9/2);
        accessories.setLayoutY(sceneHeight*1.7/2);

        tshirtview.setLayoutX(sceneWidth*0.9/6);
        tshirtview.setLayoutY(sceneHeight*0.7/6);

        pantsview.setLayoutX(sceneWidth*1.2/2);
        pantsview.setLayoutY(sceneHeight*0.7/6);

        shoesview.setLayoutX(sceneWidth*1.4/2);
        shoesview.setLayoutY(sceneHeight*1.1/2);

        jacketview.setLayoutX(sceneWidth*0.7/6);
        jacketview.setLayoutY(sceneHeight*1.1/2);

        accessoriesview.setLayoutX(sceneWidth*0.8/2);
        accessoriesview.setLayoutY(sceneHeight*1.1/2);

    }
    @Override
    public void handle(ActionEvent a){
        start(primaryStage);
    }

}
