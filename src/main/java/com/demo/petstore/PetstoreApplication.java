package com.demo.petstore;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import com.demo.petstore.domain.Campaign;
import com.demo.petstore.domain.CampaignDetail;
import com.demo.petstore.domain.Dog;
import com.demo.petstore.domain.Pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetstoreApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(PetstoreApplication.class, args);

		Pet dog = new Dog();   // new Cat();
		dog.setName("뽀삐");

		System.out.println(dog.speak());

		System.out.println("pet is eating");
		dog.eat();

		System.out.println(dog);
		

		System.out.println("pet is sleeping");
		dog.sleep();

		System.out.println(dog);

		dog.save();
		
		Campaign campaign = new Campaign();
		campaign.setCampaignTitle("campaignTitle");
		campaign.setCampaignDesc("campaignDesc");
		campaign.setCreateDate(LocalDateTime.now(ZoneId.of("Asia/Seoul")));
		campaign.setModifyDate(LocalDateTime.now(ZoneId.of("Asia/Seoul")));
		campaign.setApproveYn("N");
		campaign.setCampaignStatus("1");
		campaign.setLeastPayAmount("100000");
		campaign.setTargetAmount("3000000000000");
		campaign.setAccountStaffId("asdf1234");
		campaign.setRepresentativeId("zxcv7890");
		campaign.setStartDate("20220310");
		campaign.setEndDate("20220409");
		campaign.save();


		CampaignDetail campaignDetail = new CampaignDetail();
		campaignDetail.setUserId("asdf1234");
		campaignDetail.setCampaignId(Long.valueOf(12));
		campaignDetail.setAmount(Double.valueOf(150000));
		campaignDetail.setPayDate(LocalDateTime.now(ZoneId.of("Asia/Seoul")));
		campaignDetail.save();
	}

}
