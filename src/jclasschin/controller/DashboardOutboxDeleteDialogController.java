/*
 * The MIT License
 *
 * Copyright 2014 HP.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package jclasschin.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import jclasschin.entity.Mail;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DashboardOutboxDeleteDialogController implements Initializable
{
    private Stage dashboardOutboxDeleteDialogStage;
    private Mail mail;
    
    @FXML
    private HBox yesHBox;
    @FXML
    private ImageView okImageView;
    @FXML
    private HBox noHBox;
    @FXML
    private ImageView cancelImageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void yesHBoxOnMouseExited(MouseEvent event)
    {
    }

    @FXML
    private void yesHBoxOnMouseEntered(MouseEvent event)
    {
    }

    @FXML
    private void yesHBoxOnMouseClicked(MouseEvent event)
    {
        dashboardOutboxDeleteDialogStage.close();
    }

    @FXML
    private void noHBoxOnMouseExited(MouseEvent event)
    {
    }

    @FXML
    private void noHBoxOnMouseEntered(MouseEvent event)
    {
    }

    @FXML
    private void noHBoxOnMouseClicked(MouseEvent event)
    {
        dashboardOutboxDeleteDialogStage.close();
    }

    /**
     * @return the dashboardOutboxDeleteDialogStage
     */
    public Stage getDashboardOutboxDeleteDialogStage()
    {
        return dashboardOutboxDeleteDialogStage;
    }

    /**
     * @param dashboardOutboxDeleteDialogStage the dashboardOutboxDeleteDialogStage to set
     */
    public void setDashboardOutboxDeleteDialogStage(Stage dashboardOutboxDeleteDialogStage)
    {
        this.dashboardOutboxDeleteDialogStage = dashboardOutboxDeleteDialogStage;
    }

    /**
     * @return the mail
     */
    public Mail getMail()
    {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(Mail mail)
    {
        this.mail = mail;
    }
    
}
