package pl.rakowiecki.springbootimageuploader.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.rakowiecki.springbootimageuploader.ImageUploader;


@Route("upload")
public class UploadGui extends VerticalLayout {

    @Autowired
    public UploadGui(ImageUploader imageUploader) {


        Label label = new Label();
        TextField textField = new TextField();
        Button button = new Button("upload");
        button.addClickListener(clickEvent -> {

            final String uploadedImage = imageUploader.uploadFileAndSaveToDb(textField.getValue());
            Image image = new Image(uploadedImage, "nie ma obrazka");
            label.setText("Udało się wrzucić obrazek!!");
            add(label);
            add(image);

        });

        add(textField);
        add(button);

    }
}
