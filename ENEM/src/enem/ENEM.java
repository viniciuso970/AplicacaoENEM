/**
 *  Projeto Final BDII
 *  Autores:
 *      Gabriel Oraboni Carvalho
 *      Matheus Santos Corrêa
 *      Pedro Spina Guemureman
 *      Renam Makoto Aono
 *      Vinícius de Oliveira Souza
 */

package enem;

import Controle.ControlePrincipal;
import Visao.TelaCRUDPesos;
import Visao.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ENEM extends Application{

    ControlePrincipal ctrPrincipal;
    
    private Button bCrud, bRel1, bRel2, bRel3, bRel4;
    private Label lTitulo;
    private GridPane grid;
    private TelaCRUDPesos crudPesos;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ControlePrincipal ctrPrincipal = new ControlePrincipal(primaryStage);
    }
    
}
