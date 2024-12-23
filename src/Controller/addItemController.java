package Controller;

import DBConnection.DBConnection;
import Model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class addItemController {


    public TextField txtId;
    public TextField txtName;
    public TextField txtQuatity;
    public TextField txtPrice;
    public TextField txtDescription;
    public TableView tblitem;
    public TableColumn colName;
    public TableColumn colid;
    public TableColumn colQuantity;
    public TableColumn colPrice;
    public TableColumn colDescription;
    public Button btnViewTable;
    public Button btnAddItem;




    public void btnAddItemOnAction(ActionEvent actionEvent) {
        String id= txtId.getText();
        String name = txtName.getText();
        int quality = Integer.parseInt(txtQuatity.getText());
        double price = Double.parseDouble(txtPrice.getText());
        String description = txtDescription.getText();

        System.out.println(id+","+name+","+quality+","+price+","+description);

        txtId.setText("");
        txtName.setText("");
        txtQuatity.setText("");
        txtPrice.setText("");
        txtDescription.setText("");

        System.out.println(new Item(id,name,quality,price,description));
        DBConnection.getInstance().getConnection().add(new Item(id,name,quality,price,description));
        System.out.println(DBConnection.getInstance().getConnection());




    }



    public void btnViewTableOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/View_Table.fxml"))));
        stage.show();
        }


    public void btnDeleteOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/delete_Item.fxml"))));
        stage.show();
    }
    }

