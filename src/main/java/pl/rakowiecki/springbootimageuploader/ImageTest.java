package pl.rakowiecki.springbootimageuploader;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ImageTest {

    public static void main(String[] args) throws IOException {

        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "deulijail",
                "api_key", "126681229686252",
                "api_secret", "IIpcP6sWOe-RueFYiKg3UpZjGz0"));

        File file = new File("C:\\Users\\Domownicy\\Pictures\\Saved Pictures\\image.jpg");
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
    }
}
