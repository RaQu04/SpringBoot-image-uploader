package pl.rakowiecki.springbootimageuploader.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.rakowiecki.springbootimageuploader.ImageUploader;
import pl.rakowiecki.springbootimageuploader.model.Image;
import pl.rakowiecki.springbootimageuploader.repo.ImageRepo;

import java.util.List;


@Route("gallery")
public class GalleryGui extends VerticalLayout {

    private final ImageRepo imageRepo;

    @Autowired
    public GalleryGui(ImageRepo imageRepo) {
        this.imageRepo = imageRepo;

        final List<Image> allImage = imageRepo.findAll();
        allImage.forEach(element -> {
            com.vaadin.flow.component.html.Image image =
                    new com.vaadin.flow.component.html.Image(element.getImageAddress(), "brak");
            add(image);
        });


    }
}
