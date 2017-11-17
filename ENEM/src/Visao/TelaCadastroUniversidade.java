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

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TelaCadastroUniversidade implements EventHandler<ActionEvent>{

    private Button bCadUniversidade, bCadCursos, bCadPesos;
    private Label lTitulo, lTituloUniversidades, lTituloCursos, lTituloPesos;
    private GridPane grid;
    private Stage stage;
    
    public TelaCadastroUniversidade() {
        
        stage = new Stage();
        bCadUniversidade = new Button("Cadastrar Universidades");
        bCadCursos = new Button("Cadastrar Cursos");
        bCadPesos = new Button("Cadastrar Pesos");
        
        bCadUniversidade.setOnAction(this);
        bCadCursos.setOnAction(this);
        bCadPesos.setOnAction(this);
        
        bCadUniversidade.setId("font-button");
        bCadCursos.setId("font-button");
        bCadPesos.setId("font-button");
        
        lTitulo = new Label("Aplicação ENEM:");
        lTitulo.setId("label");
        
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(50);
        grid.setVgap(50);
        
        grid.add(lTitulo, 0, 0);
        grid.add(bCadUniversidade, 0, 1);
        grid.add(bCadCursos, 0, 2);
        grid.add(bCadPesos, 0, 3);
        
        Scene scene = new Scene(grid, grid.getMaxHeight(), grid.getMaxWidth());
        scene.getStylesheets().add
            (TelaPrincipal.class.getResource("Principal.css").toExternalForm());
        
        stage.setTitle("Cadastro Universidades");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        
    }
    
    
}
