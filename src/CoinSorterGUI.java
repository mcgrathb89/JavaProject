import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;  

public class CoinSorterGUI extends Application{
	
	DropShadow shadow = new DropShadow();  
	Scene scene2;
	
	@Override
	public void start(Stage stage) {
		Button coinCalculatorButton = new Button();         
		coinCalculatorButton.setText("Coin Calculator"); 
		coinCalculatorButton.setStyle(
                "-fx-background-color: black;" + 
                "-fx-text-fill: white");
		

		coinCalculatorButton.setOnAction((ActionEvent event) -> {
			CoinSorter mainProgram = new CoinSorter();
			mainProgram.coinCalculator(mainProgram.changeEntry, mainProgram.type);
		});
		
		coinCalculatorButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  coinCalculatorButton.setEffect(shadow);
	            	  coinCalculatorButton.setStyle(
	                        "-fx-background-color: white;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: black");
	              }
	            });
		
		coinCalculatorButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  coinCalculatorButton.setEffect(null);
	            	  coinCalculatorButton.setStyle(
	          				"-fx-background-color: black;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		
		Button multiCoinCalculatorButton = new Button();         
		multiCoinCalculatorButton.setText("Multi Coin Calculator"); 
		
		multiCoinCalculatorButton.setStyle(
                "-fx-background-color: black;" + 
                "-fx-text-fill: white");
		
		multiCoinCalculatorButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  multiCoinCalculatorButton.setEffect(shadow);
	            	  multiCoinCalculatorButton.setStyle(
	                        "-fx-background-color: white;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: black");
	              }
	            });
		
		multiCoinCalculatorButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  multiCoinCalculatorButton.setEffect(null);
	            	  multiCoinCalculatorButton.setStyle(
	          				"-fx-background-color: black;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		
		Button printCoinListButton = new Button();         
		printCoinListButton.setText("Print Coin List"); 
		
		printCoinListButton.setStyle(
                "-fx-background-color: black;" + 
                "-fx-text-fill: white");
		
		printCoinListButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  printCoinListButton.setEffect(shadow);
	            	  printCoinListButton.setStyle(
	                        "-fx-background-color: white;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: black");
	              }
	            });
		
		printCoinListButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  printCoinListButton.setEffect(null);
	            	  printCoinListButton.setStyle(
	          				"-fx-background-color: black;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		Button setDetailsButton = new Button();         
		setDetailsButton.setText("Set Details"); 
		
		setDetailsButton.setStyle(
                "-fx-background-color: black;" + 
                "-fx-text-fill: white");
		
		setDetailsButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setDetailsButton.setEffect(shadow);
	            	  setDetailsButton.setStyle(
	                        "-fx-background-color: white;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: black");
	              }
	            });
		
		setDetailsButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setDetailsButton.setEffect(null);
	            	  setDetailsButton.setStyle(
	          				"-fx-background-color: black;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		
		Button displayProgramConfigsButton = new Button();         
		displayProgramConfigsButton.setText("Display Program Configurations");		
		
		displayProgramConfigsButton.setStyle(
                "-fx-background-color: black;" + 
                "-fx-text-fill: white");
		
		displayProgramConfigsButton.setOnAction((ActionEvent event) -> {
			stage.setScene(scene2);
			stage.setTitle("*** Set Details - Sub Menu ***");
        });
		
		displayProgramConfigsButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  displayProgramConfigsButton.setEffect(shadow);
	            	  displayProgramConfigsButton.setStyle(
	                        "-fx-background-color: white;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: black");
	              }
	            });
		
		displayProgramConfigsButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  displayProgramConfigsButton.setEffect(null);
	            	  displayProgramConfigsButton.setStyle(
	          				"-fx-background-color: black;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		
		Button quitProgramButton = new Button();         
		quitProgramButton.setText("Quit the Program"); 
		
		quitProgramButton.setStyle(
                "-fx-background-color: black;" + 
                "-fx-text-fill: white");
		
		quitProgramButton.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });
		
		quitProgramButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  quitProgramButton.setEffect(shadow);
	            	  quitProgramButton.setStyle(
	                        "-fx-background-color: white;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: black");
	              }
	            });
		
		quitProgramButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  quitProgramButton.setEffect(null);
	            	  quitProgramButton.setStyle(
	          				"-fx-background-color: black;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		             
		HBox layoutOne = new HBox();         
		layoutOne.setSpacing(10);         
		layoutOne.setAlignment(Pos.CENTER);
		layoutOne.getChildren().addAll(coinCalculatorButton, multiCoinCalculatorButton,
				printCoinListButton, setDetailsButton, displayProgramConfigsButton, quitProgramButton); 
		Scene scene = new Scene(layoutOne, 750, 150);  
		
		Button setCurrencyButton = new Button();         
		setCurrencyButton.setText("Set Currency");
		
		setCurrencyButton.setStyle(
                "-fx-background-color: grey;" + 
                "-fx-text-fill: white");
		
		setCurrencyButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setCurrencyButton.setEffect(shadow);
	            	  setCurrencyButton.setStyle(
	                        "-fx-background-color: black;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: white");
	              }
	            });
		
		setCurrencyButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setCurrencyButton.setEffect(null);
	            	  setCurrencyButton.setStyle(
	          				"-fx-background-color: grey;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		
		Button setMinCoinValueButton = new Button();         
		setMinCoinValueButton.setText("Set Minimum Coin Value"); 
		
		setMinCoinValueButton.setStyle(
                "-fx-background-color: grey;" + 
                "-fx-text-fill: white");
		
		setMinCoinValueButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setMinCoinValueButton.setEffect(shadow);
	            	  setMinCoinValueButton.setStyle(
	                        "-fx-background-color: black;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: white");
	              }
	            });
		
		setMinCoinValueButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setMinCoinValueButton.setEffect(null);
	            	  setMinCoinValueButton.setStyle(
	          				"-fx-background-color: grey;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		Button setMaxCoinValueButton = new Button();         
		setMaxCoinValueButton.setText("Set Maximum Coin Value"); 
		
		setMaxCoinValueButton.setStyle(
                "-fx-background-color: grey;" + 
                "-fx-text-fill: white");
		
		setMaxCoinValueButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setMaxCoinValueButton.setEffect(shadow);
	            	  setMaxCoinValueButton.setStyle(
	                        "-fx-background-color: black;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: white");
	              }
	            });
		
		setMaxCoinValueButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  setMaxCoinValueButton.setEffect(null);
	            	  setMaxCoinValueButton.setStyle(
	          				"-fx-background-color: grey;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		
		Button returnToMainMenuButton = new Button("Return to Main Menu");
		
		returnToMainMenuButton.setStyle(
                "-fx-background-color: grey;" + 
                "-fx-text-fill: white");
		
		returnToMainMenuButton.setOnAction((ActionEvent event) -> {
			stage.setScene(scene);
			stage.setTitle("*** Coin Sorter - Main Menu ***");
        });
		
		returnToMainMenuButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  returnToMainMenuButton.setEffect(shadow);
	            	  returnToMainMenuButton.setStyle(
	                        "-fx-background-color: black;" + 
	            	        "-fx-font-weight: bold;" + 
	                        "-fx-text-fill: white");
	              }
	            });
		
		returnToMainMenuButton.addEventHandler(MouseEvent.MOUSE_EXITED,
	            new EventHandler<MouseEvent>() {
	              @Override
	              public void handle(MouseEvent e) {
	            	  returnToMainMenuButton.setEffect(null);
	            	  returnToMainMenuButton.setStyle(
	          				"-fx-background-color: grey;" + 
	          				"-fx-text-fill: white");
	              }
	            });
		

		HBox layout2 = new HBox();         
		layout2.setSpacing(10);         
		layout2.setAlignment(Pos.CENTER); 
		layout2.getChildren().addAll(setCurrencyButton, setMinCoinValueButton, setMaxCoinValueButton, returnToMainMenuButton);
		scene2 = new Scene(layout2, 600, 150);
		        
		stage.setScene(scene);         
		stage.setTitle("*** Coin Sorter - Main Menu ***");         
		stage.show(); 
	}
}
