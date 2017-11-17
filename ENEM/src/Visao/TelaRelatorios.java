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

import Controle.ControleRelatorios;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TelaRelatorios implements EventHandler<ActionEvent>{

    private ControleRelatorios ctrRelatorios;
    private Button bRel1, bRel2, bRel3, bRel4;
    private Label lTitulo;
    private GridPane grid;
    private Stage stage;

    public TelaRelatorios(ControleRelatorios ctrRelatorios) {
        
        this.ctrRelatorios = ctrRelatorios;
        
        stage =  new Stage();
        bRel1 = new Button("Relatorio1");
        bRel2 = new Button("Relatorio2");
        bRel3 = new Button("Relatorio3");
        bRel4 = new Button("Relatorio4");

        bRel1.setOnAction(this);
        bRel2.setOnAction(this);
        bRel3.setOnAction(this);
        bRel4.setOnAction(this);

        bRel1.setId("font-button");
        bRel2.setId("font-button");
        bRel3.setId("font-button");
        bRel4.setId("font-button");

        lTitulo = new Label("Aplicação ENEM:");
        lTitulo.setId("label");

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(50);

        grid.add(lTitulo, 0, 0);
        grid.add(bRel1, 0, 1);
        grid.add(bRel2, 0, 2);
        grid.add(bRel3, 0, 3);
        grid.add(bRel4, 0, 4);

        Scene scene = new Scene(grid, grid.getMaxHeight(), grid.getMaxWidth());
        scene.getStylesheets().add(TelaPrincipal.class.getResource("Principal.css").toExternalForm());

        stage.setTitle("Relatórios");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == bRel1) {
            Relatorio1 rel1 = new Relatorio1(ctrRelatorios);
        } else if (event.getSource() == bRel2) {
            Relatorio2 rel2 = new Relatorio2(ctrRelatorios);
        } else if (event.getSource() == bRel3) {
            Relatorio3 rel3 = new Relatorio3(ctrRelatorios);
        } else if (event.getSource() == bRel4) {
            Relatorio4 rel4 = new Relatorio4(ctrRelatorios);
        }
    }

}
