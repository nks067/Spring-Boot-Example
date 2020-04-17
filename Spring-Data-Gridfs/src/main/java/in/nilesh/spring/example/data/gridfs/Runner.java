package in.nilesh.spring.example.data.gridfs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nilesh.spring.example.data.gridfs.DAO.ProfileDetailsDAO;
@Component
public class Runner implements CommandLineRunner{
	@Autowired
	private ProfileDetailsDAO profileDetailsDAO;
	
	@Override
	public void run(String... args) throws Exception {
		profileDetailsDAO.deleteAll(); //delete all document
		
		//profileDetailsDAO.storeSimpleFile(); //store file without metadata 
		profileDetailsDAO.storeFileWithMetadata(); ////store file with metadata\
		profileDetailsDAO.getFileAndStoreLocally(); //fetch file
		
	}

}
