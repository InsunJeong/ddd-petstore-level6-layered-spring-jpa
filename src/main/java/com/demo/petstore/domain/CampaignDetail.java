package com.demo.petstore.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import com.demo.petstore.PetstoreApplication;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CampaignDetail {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long campaignDetailId;         // 납부 ID
    Long campaignId;    // 캠페인 ID
    String userId;  // 회원 ID
    Double amount;  // 납부 금액
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime payDate;   // 납부 일시
    
    public Long getCampaignId() {
        return campaignId;
    }
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public LocalDateTime getPayDate() {
        return payDate;
    }
    public void setPayDate(LocalDateTime payDate) {
        this.payDate = payDate;
    }


    public void save(){
		CampaignDetailRepository repository = PetstoreApplication.getApplicationContext().getBean(CampaignDetailRepository.class);
		repository.save(this);
	}

}
