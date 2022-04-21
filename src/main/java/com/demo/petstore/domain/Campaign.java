package com.demo.petstore.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import com.demo.petstore.PetstoreApplication;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Campaign {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long campaignId;         // 캠페인 ID
    String campaignTitle;   // 캠페인명
    String campaignDesc;    // 캠페인 설명
    String startDate; // 캠페인 시작일자
    String endDate;   // 캠페인 종료일자
    String targetAmount;    // 목표금액
    String leastPayAmount;  // 개인별 납부 최소금액
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime createDate;    // 작성일자
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime modifyDate;    // 최종 수정일자
    String approveYn;   // 승인여부
    String campaignStatus;  // 캠페인 상태
    String accountStaffId;  // 총무
    String representativeId;    // 대표

    
    public String getCampaignTitle() {
        return campaignTitle;
    }
    public void setCampaignTitle(String campaignTitle) {
        this.campaignTitle = campaignTitle;
    }
    public String getCampaignDesc() {
        return campaignDesc;
    }
    public void setCampaignDesc(String campaignDesc) {
        this.campaignDesc = campaignDesc;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getTargetAmount() {
        return targetAmount;
    }
    public void setTargetAmount(String targetAmount) {
        this.targetAmount = targetAmount;
    }
    public String getLeastPayAmount() {
        return leastPayAmount;
    }
    public void setLeastPayAmount(String leastPayAmount) {
        this.leastPayAmount = leastPayAmount;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public LocalDateTime getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate(LocalDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }
    public String getApproveYn() {
        return approveYn;
    }
    public void setApproveYn(String approveYn) {
        this.approveYn = approveYn;
    }
    public String getCampaignStatus() {
        return campaignStatus;
    }
    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }
    public String getAccountStaffId() {
        return accountStaffId;
    }
    public void setAccountStaffId(String accountStaffId) {
        this.accountStaffId = accountStaffId;
    }
    public String getRepresentativeId() {
        return representativeId;
    }
    public void setRepresentativeId(String representativeId) {
        this.representativeId = representativeId;
    }

    
    public void save(){
		CampaignRepository repository = PetstoreApplication.getApplicationContext().getBean(CampaignRepository.class);
		repository.save(this);
	}


    
}