package pl.rakowiecki.springbootimageuploader;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class ImageUploader {

    private final Cloudinary cloudinary;

    public ImageUploader() {
        cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "deulijail",
                "api_key", "126681229686252",
                "api_secret", "IIpcP6sWOe-RueFYiKg3UpZjGz0"));
    }

    public String uploadFile(String path) {
        File file = new File(path);
        Map uploadResult = null;
        try {
            uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        } catch (IOException e) {
            e.printStackTrace();
            //TODO
        }
        return "";
    }


}
