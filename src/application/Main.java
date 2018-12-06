package application;

               

import java.io.IOException;

 

import javafx.application.Application;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.scene.effect.GaussianBlur;

import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;

 

 

public class Main extends Application {

                private AnchorPane mypane;

                @Override

                public void start(Stage stage)throws IOException {

                                               FXMLLoader loader = new FXMLLoader(getClass().getResource(

                                                                               "../view/forest.fxml"));

                                              

                                               loader.setController(new Metodos());

 

                                               // ahora sobre el panel mypane cargamos la vista que dejamos en el

                                               // FXMLLoader

                                               mypane = (AnchorPane) loader.load();

                                              

                                               // añade la escena al stage y la titula

                                               stage.setTitle("Where's the squirrel?");

                                               stage.setScene(new Scene(mypane));

                                               stage.show();
                }

                class Metodos {
                               private ImageView img;

 

                               @FXML

                               public void pulsar() {

                                               img.setEffect(new GaussianBlur(40));

                               }

                               @FXML

                               public void salir() {

                                               System.exit(0);

                               }

 

                }

               

                public static void main(String[] args) {

                               launch(args);

                }

}

