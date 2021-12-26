package com.mgt_amss.mgt_amss.dto;

import javax.persistence.*;

@Entity
@Table(name = "pm002200")
public class PomicnoMerilo002200 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int id;

    private String oonmS0;
    private String oonmV0;

    private String oonmS1;
    private String oonmV1;

    private String oonmS2;
    private String oonmV2;

    private String oonmS3;
    private String oonmV3;

    private String oonmS4;
    private String oonmV4;

    private String oonmS5;
    private String oonmV5;

    private String oonmS6;
    private String oonmV6;

    private String um1;
    private String um2;

    private String mszd;

    private String smcp;

    private String pmmpsm0;
    private String pmmpsm1;
    private String pmmpsm2;
    private String pmmpsm3;
    private String pmmpsm4;

    private String pmpsm;

    //AUTO GENERATED


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOonmS0() {
        return oonmS0;
    }

    public void setOonmS0(String oonmS0) {
        this.oonmS0 = oonmS0;
    }

    public String getOonmV0() {
        return oonmV0;
    }

    public void setOonmV0(String oonmV0) {
        this.oonmV0 = oonmV0;
    }

    public String getOonmS1() {
        return oonmS1;
    }

    public void setOonmS1(String oonmS1) {
        this.oonmS1 = oonmS1;
    }

    public String getOonmV1() {
        return oonmV1;
    }

    public void setOonmV1(String oonmV1) {
        this.oonmV1 = oonmV1;
    }

    public String getOonmS2() {
        return oonmS2;
    }

    public void setOonmS2(String oonmS2) {
        this.oonmS2 = oonmS2;
    }

    public String getOonmV2() {
        return oonmV2;
    }

    public void setOonmV2(String oonmV2) {
        this.oonmV2 = oonmV2;
    }

    public String getOonmS3() {
        return oonmS3;
    }

    public void setOonmS3(String oonmS3) {
        this.oonmS3 = oonmS3;
    }

    public String getOonmV3() {
        return oonmV3;
    }

    public void setOonmV3(String oonmV3) {
        this.oonmV3 = oonmV3;
    }

    public String getOonmS4() {
        return oonmS4;
    }

    public void setOonmS4(String oonmS4) {
        this.oonmS4 = oonmS4;
    }

    public String getOonmV4() {
        return oonmV4;
    }

    public void setOonmV4(String oonmV4) {
        this.oonmV4 = oonmV4;
    }

    public String getOonmS5() {
        return oonmS5;
    }

    public void setOonmS5(String oonmS5) {
        this.oonmS5 = oonmS5;
    }

    public String getOonmV5() {
        return oonmV5;
    }

    public void setOonmV5(String oonmV5) {
        this.oonmV5 = oonmV5;
    }

    public String getOonmS6() {
        return oonmS6;
    }

    public void setOonmS6(String oonmS6) {
        this.oonmS6 = oonmS6;
    }

    public String getOonmV6() {
        return oonmV6;
    }

    public void setOonmV6(String oonmV6) {
        this.oonmV6 = oonmV6;
    }

    public String getUm1() {
        return um1;
    }

    public void setUm1(String um1) {
        this.um1 = um1;
    }

    public String getUm2() {
        return um2;
    }

    public void setUm2(String um2) {
        this.um2 = um2;
    }

    public String getMszd() {
        return mszd;
    }

    public void setMszd(String mszd) {
        this.mszd = mszd;
    }

    public String getSmcp() {
        return smcp;
    }

    public void setSmcp(String smcp) {
        this.smcp = smcp;
    }

    public String getPmmpsm0() {
        return pmmpsm0;
    }

    public void setPmmpsm0(String pmmpsm0) {
        this.pmmpsm0 = pmmpsm0;
    }

    public String getPmmpsm1() {
        return pmmpsm1;
    }

    public void setPmmpsm1(String pmmpsm1) {
        this.pmmpsm1 = pmmpsm1;
    }

    public String getPmmpsm2() {
        return pmmpsm2;
    }

    public void setPmmpsm2(String pmmpsm2) {
        this.pmmpsm2 = pmmpsm2;
    }

    public String getPmmpsm3() {
        return pmmpsm3;
    }

    public void setPmmpsm3(String pmmpsm3) {
        this.pmmpsm3 = pmmpsm3;
    }

    public String getPmmpsm4() {
        return pmmpsm4;
    }

    public void setPmmpsm4(String pmmpsm4) {
        this.pmmpsm4 = pmmpsm4;
    }

    public String getPmpsm() {
        return pmpsm;
    }

    public void setPmpsm(String pmpsm) {
        this.pmpsm = pmpsm;
    }
}
