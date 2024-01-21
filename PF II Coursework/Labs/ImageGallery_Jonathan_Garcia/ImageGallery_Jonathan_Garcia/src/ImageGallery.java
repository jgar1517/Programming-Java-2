import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


            //call to the launch method
public class ImageGallery extends Application {
            //main method
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //declare the Images and the ImageViews in the class level scope
        Image genesis = new Image("GenesisAlbum.jpg");
        ImageView genesis1 = new ImageView(genesis);
        genesis1.setPreserveRatio(true);
        //image will be fit into this height parameter, 300
        genesis1.setFitHeight(300);

        Image thepolice = new Image("file:src/ThePoliceAlbum.jpg");
        ImageView thepolice2 = new ImageView(thepolice);
        thepolice2.setPreserveRatio(true);
        thepolice2.setFitHeight(300);

        Image petergabriel = new Image("file:src/PeterGabrielAlbum.jpg");
        ImageView petergabriel3 = new ImageView(petergabriel);
        petergabriel3.setPreserveRatio(true);
        petergabriel3.setFitHeight(300);

        Image billyjoel = new Image("file:src/BillyJoelAlbum.jpg");
        ImageView billyjoel4 = new ImageView(billyjoel);
        billyjoel4.setPreserveRatio(true);
        billyjoel4.setFitHeight(300);

        Image enya = new Image("file:src/EnyaAlbum.jpg");
        ImageView enya5 = new ImageView(enya);
        enya5.setPreserveRatio(true);
        enya5.setFitHeight(300);

        Image switchfoot = new Image("file:src/SwitchfootAlbum.jpg");
        ImageView switchfoot6 = new ImageView(switchfoot);
        switchfoot6.setPreserveRatio(true);
        switchfoot6.setFitHeight(300);

        //noargs constructor //column = x, row = y
        GridPane gridpane = new GridPane();
        gridpane.add(genesis1, 0, 0);
        gridpane.add(thepolice2, 1, 0);
        gridpane.add(petergabriel3, 2, 0);
        gridpane.add(billyjoel4,0 , 1);
        gridpane.add(enya5, 1, 1);
        gridpane.add(switchfoot6, 2, 1);

        //Set spacing
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        //set images to be centered on the gridpane
        gridpane.setAlignment(Pos.CENTER);

        //set padding
        gridpane.setPadding(new Insets(5,5,5,5));

        //set scene and images are arranged 3x2. To be fully visible; height of 750, and width of 1200
        Scene scene = new Scene(gridpane,1200, 750);

        //set name for scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Music Albums");
        primaryStage.show();
    }
}
