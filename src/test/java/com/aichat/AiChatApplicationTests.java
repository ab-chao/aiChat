package com.aichat;

import com.aichat.saveMgs.entity.SaveMgsEntity;
import com.aichat.saveMgs.service.SaveMgsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AiChatApplicationTests {

	@Autowired
	SaveMgsServiceImpl saveMgsServiceImpl;

	SaveMgsEntity saveMgsEntity = new SaveMgsEntity();

	public void setSaveMgsEntity(){
		saveMgsEntity.setId(1);
		java.util.Date d = new java.util.Date();

		Timestamp sqlDate = new Timestamp(d.getTime());
		saveMgsEntity.setCreation_date(sqlDate);
		saveMgsEntity.setFnd_id(4);
		saveMgsEntity.setUser_id(6);
		saveMgsEntity.setUuid("def");
		saveMgsEntity.setFile_location("abc");
	}

//	@Test
//	public void contextLoads() {
//		setSaveMgsEntity();
//		saveMgsServiceImpl.insertSaveMgs(saveMgsEntity);
//	}

//	@Test
//	public void contextLoads() {
//		SaveMgsEntity saveMgsEntity = saveMgsServiceImpl.getSaveMgs(1);
//		System.out.print(saveMgsEntity.getId());
//	}

//	@Test
//	public void contextLoads() {
//		saveMgsServiceImpl.deleteSaveMgs(1);
//	}

	@Test
	public void contextLoads() {
		setSaveMgsEntity();
		saveMgsServiceImpl.updateSaveMgs(saveMgsEntity);
	}

}
