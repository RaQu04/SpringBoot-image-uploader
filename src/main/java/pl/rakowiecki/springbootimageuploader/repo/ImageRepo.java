package pl.rakowiecki.springbootimageuploader.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rakowiecki.springbootimageuploader.model.AppUser;
import pl.rakowiecki.springbootimageuploader.model.Image;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {


}
