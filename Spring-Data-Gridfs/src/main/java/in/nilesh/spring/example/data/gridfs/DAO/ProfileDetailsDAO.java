package in.nilesh.spring.example.data.gridfs.DAO;


import static org.springframework.data.mongodb.core.query.Query.*;
import static org.springframework.data.mongodb.gridfs.GridFsCriteria.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.stereotype.Service;

import com.mongodb.client.gridfs.model.GridFSFile;

import in.nilesh.spring.example.data.gridfs.Model.ProfileDetails;
@Service
public class ProfileDetailsDAO {
	@Autowired GridFsOperations gridFsOperations;

	public void storeSimpleFile() throws IOException {

		try (InputStream is = new BufferedInputStream(new ClassPathResource("./Nilesh_Profile_Pic.jpg").getInputStream())) {
			// store file
			gridFsOperations.store(is, "Nilesh_Profile_Pic.jpg");

		}

		// get file or resource by filename
		GridFSFile file = gridFsOperations.findOne(query(whereFilename().is("Nilesh_Profile_Pic.jpg")));
		System.out.println("Fatched Data :: "+file.getFilename());
		//assertThat(file.getFilename()).isEqualTo("example-file.txt");
	}



	public void storeFileWithMetadata() throws IOException {

		try (InputStream is = new BufferedInputStream(new ClassPathResource("./Nilesh_Profile_Pic.jpg").getInputStream())) {

			// store file with metaData
			ProfileDetails profileMetaData = new ProfileDetails("Nilesh", "Singh", "nks067", "945724028", "nilesh.kumar@iiitb.org", "Nilesh_Profile_Pic.jpg");
			gridFsOperations.store(is, "Nilesh_Profile_Pic.jpg",profileMetaData);
		}
		// search by metaData
		GridFSFile file = gridFsOperations.findOne(query(whereMetaData("fname").is("Nilesh")));
		System.out.println("Fatched Data :: "+file.getFilename()+" | MetaData"+file.getMetadata());
	}
	public void getFileAndStoreLocally() throws IOException{
		// search by metaData
		GridFSFile file = gridFsOperations.findOne(query(whereMetaData("fname").is("Nilesh")));
		System.out.println("Fetched Data :: "+file.getFilename()+" | MetaData"+file.getMetadata());
		GridFsResource resourse=gridFsOperations.getResource(file);
		BufferedImage image = ImageIO.read(resourse.getInputStream());
		ImageIO.write(image, "jpg", new File("/home/nilesh/Desktop/nilesh_profile_pic.jpg"));

	}
	public void deleteAll() {
		gridFsOperations.delete(new Query());
	}
}
