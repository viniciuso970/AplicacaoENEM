/**
 *  Projeto Final BDII
 *  Autores:
 *      Gabriel Oraboni Carvalho
 *      Matheus Santos Corrêa
 *      Pedro Spina Guemureman
 *      Renam Makoto Aono
 *      Vinícius de Oliveira Souza
 */
package Visao;

import Controle.ControlePesos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TelaCRUDPesos implements EventHandler<ActionEvent> {

    private ControlePesos ctrPesos;
    private Button bCadPesos;
    private Label lTitulo, lNome, lPesoCN, lPesoCH, lPesoLC, lPesoM, lPesoR;
    private TextField textNome, textPesoCN, textPesoCH, textPesoLC,
            textPesoM, textPesoR;
    private GridPane grid;
    private Stage stage;

    public TelaCRUDPesos(ControlePesos ctrPesos) {
        
        this.ctrPesos = ctrPesos;
        
        stage = new Stage();

        bCadPesos = new Button("Cadastrar Pesos");

        bCadPesos.setOnAction(this);

        bCadPesos.setId("font-button");

        lTitulo = new Label("Cadastro de Pesos");
        lTitulo.setId("font-button");
        lNome = new Label("Nome dos Pesos:");
        lNome.setId("font-button");
        lPesoCN = new Label("Ciências da Natureza:");
        lPesoCN.setId("font-button");
        lPesoCH = new Label("Ciências Humanas:");
        lPesoCH.setId("font-button");
        lPesoLC = new Label("Linguagens e Códigos:");
        lPesoLC.setId("font-button");
        lPesoM = new Label("Matemática:");
        lPesoM.setId("font-button");
        lPesoR = new Label("Redação:");
        lPesoR.setId("font-button");

        textNome = new TextField();
        textPesoCN = new TextField();
        textPesoCH = new TextField();
        textPesoLC = new TextField();
        textPesoM = new TextField();
        textPesoR = new TextField();

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(50);

        grid.add(lTitulo, 0, 0);
        grid.add(lNome, 0, 1);
        grid.add(textNome, 1, 1);
        grid.add(lPesoCH, 0, 2);
        grid.add(textPesoCH, 1, 2);
        grid.add(lPesoCN, 0, 3);
        grid.add(textPesoCN, 1, 3);
        grid.add(lPesoLC, 0, 4);
        grid.add(textPesoLC, 1, 4);
        grid.add(lPesoM, 0, 5);
        grid.add(textPesoM, 1, 5);
        grid.add(lPesoR, 0, 6);
        grid.add(textPesoR, 1, 6);
        grid.add(bCadPesos, 0, 7);

        Scene scene = new Scene(grid, grid.getMaxHeight(), grid.getMaxWidth());
        scene.getStylesheets().add(TelaPrincipal.class.getResource("Principal.css").toExternalForm());

        stage.setTitle("Cadastro de Pesos");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == bCadPesos) {
            try {
                int pesoCH = Integer.parseInt(textPesoCH.getText());
                int pesoCN = Integer.parseInt(textPesoCN.getText());
                int pesoLC = Integer.parseInt(textPesoLC.getText());
                int pesoM = Integer.parseInt(textPesoM.getText());
                int pesoR = Integer.parseInt(textPesoR.getText());
                ctrPesos.cadastrarPesos(pesoCH, pesoCN, pesoLC, pesoM, pesoR);
            } catch (ArithmeticException arithmetic) {
                
            } catch (Exception e) {
                
            }
        }
    }

}
