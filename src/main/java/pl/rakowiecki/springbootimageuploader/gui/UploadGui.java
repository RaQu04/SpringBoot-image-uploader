package pl.rakowiecki.springbootimageuploader.gui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.rakowiecki.springbootimageuploader.ImageUploader;

import java.awt.*;

@Route("/uploadImage")
public class UploadGui extends VerticalLayout {

    private ImageUploader imageUploader;

    @Autowired
    public UploadGui(ImageUploader imageUploader) {
        this.imageUploader = imageUploader;

        TextField textField = new TextField();
        Button button = new Button("upload");
        button.addActionListener(clickEvent -> imageUploader.uploadFile(textField.getText()));

        add(String.valueOf(textField));
        add(String.valueOf(button));
    }
}
