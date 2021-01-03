package pl.rakowiecki.springbootimageuploader.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.rakowiecki.springbootimageuploader.ImageUploader;


@Route("upload")
public class UploadGui extends VerticalLayout {

    private final ImageUploader imageUploader;

    @Autowired
    public UploadGui(ImageUploader imageUploader) {
        this.imageUploader = imageUploader;


        Label label = new Label();
        TextField textField = new TextField();
        Button button = new Button("upload");
        button.addClickListener(clickEvent -> imageUploader.uploadFile(textField.getValue()));

        add(textField);
        add(button);

    }
}
