package easycsv;

import java.io.BufferedReader;
import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayerBuilder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;	

public class SceneMain {
	
	public static Scene sceneMain(Stage stage){
		BorderPane layout = new BorderPane();
		//design menu
		VBox topContainer = new VBox();
		MenuBar mainMenu = new MenuBar();
		
		topContainer.getChildren().add(mainMenu);
		
		layout.setTop(topContainer);
		
		//menu
		Menu file = new Menu("File");
		MenuItem openFile = new MenuItem("Open File");
		MenuItem exit = new MenuItem("Exit");
		file.getItems().addAll(openFile, exit);
		mainMenu.getMenus().addAll(file);

		//File Chooser
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open File");
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
		fileChooser.getExtensionFilters().add(extFilter);
		
		openFile.setOnAction(e -> {
			File readfile = fileChooser.showOpenDialog(stage);
			System.out.println(readfile.getAbsolutePath());
			//BufferedReader BR = new BufferedReader(new Reader(readfile));
			
		});
		
		exit.setOnAction(e -> {
			stage.close();
		});
		 
		
		
		Scene res = new Scene(layout, 700, 700);
		return res;
	}

}
