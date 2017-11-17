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
import Controle.ControleRelatorios;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class TelaPrincipal implements EventHandler<ActionEvent>{

    private ControlePesos ctrPesos;
    private ControleRelatorios ctrRelatorios;
    private Button bRelatorios, bCadastrarPesos;
    private Label lTitulo;
    private GridPane grid;

    public TelaPrincipal(Stage primaryStage, ControlePesos ctrPesos, 
            ControleRelatorios ctrRelatorios) {
        
        this.ctrPesos = ctrPesos;
        this.ctrRelatorios = ctrRelatorios;
        
        bCadastrarPesos = new Button("Cadastrar Pesos");
        bRelatorios = new Button("Relatorios");

        bCadastrarPesos.setOnAction(this);
        bRelatorios.setOnAction(this);
        
        bCadastrarPesos.setId("font-button");
        bRelatorios.setId("font-button");

        lTitulo = new Label("Aplicação ENEM:");
        lTitulo.setId("label");

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(50);

        grid.add(lTitulo, 0, 0);
        grid.add(bRelatorios, 0, 1);
        grid.add(bCadastrarPesos, 0, 2);

        Scene scene = new Scene(grid, grid.getMaxHeight(), grid.getMaxWidth());
        scene.getStylesheets().add(TelaPrincipal.class.getResource("Principal.css").toExternalForm());

        primaryStage.setTitle("Tela Principal");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == bCadastrarPesos) {
            TelaCRUDPesos crudPesos = new TelaCRUDPesos(ctrPesos);
        } else if(event.getSource() == bRelatorios) {
            TelaRelatorios relatorios = new TelaRelatorios(ctrRelatorios);
        }
    }

}
