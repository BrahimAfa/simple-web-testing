package com.mgt_amss.mgt_amss.dto;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "record")
public class RecordDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int id;
    @Column()
    private String brojSeta;
    @Column()
    private int pomicnoMerilo;
    @Column()
    private int mernaTraka50;
    @Column()
    private int mernaTraka30;
    @Column()
    private int mernaTraka5;
    @Column()
    private int mernaTraka3;
    @Column()
    private int kontrolnaVucneKuke1;
    @Column()
    private int kontrolnikVucneKuke2;
    @Column()
    private int opseg;
    @Column()
    private int minPodeljak;
    @Column()
    private int klasa;
    @Column()
    private String tip;
    @Column()
    private String serijskiBroj;
    @Column()
    private LocalDate datum;
    @Column()
    private Date datumAMSS;
    @Column()
    private String korisnik;
    @Column()
    private String naziv;
    @Column()
    private String adresa;
    @Column
    private String odobrio;
    @Column
    private String proizvodjac;
    @Column()
    private String PIB;
    @Column()
    private String telefon;
    @Column()
    private String email;
    @Column()
    private String fakturisano;
    @Column()
    private String podatkeUneo;
    @Column()
    private boolean stampano;
    @Column()
    private String inventarskiBroj;
    @Column()
    private String napomena;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrojSeta() {
        return brojSeta;
    }

    public void setBrojSeta(String brojSeta) {
        this.brojSeta = brojSeta;
    }

    public int getPomicnoMerilo() {
        return pomicnoMerilo;
    }

    public void setPomicnoMerilo(int pomicnoMerilo) {
        this.pomicnoMerilo = pomicnoMerilo;
    }

    public int getMernaTraka30() {
        return mernaTraka30;
    }

    public void setMernaTraka30(int mernaTraka30) {
        this.mernaTraka30 = mernaTraka30;
    }

    public int getMernaTraka3() {
        return mernaTraka3;
    }

    public void setMernaTraka3(int mernaTraka3) {
        this.mernaTraka3 = mernaTraka3;
    }

    public int getKontrolnaVucneKuke1() {
        return kontrolnaVucneKuke1;
    }

    public void setKontrolnaVucneKuke1(int kontrolnaRacva1) {
        this.kontrolnaVucneKuke1 = kontrolnaRacva1;
    }

    public int getKontrolnikVucneKuke2() {
        return kontrolnikVucneKuke2;
    }

    public void setKontrolnikVucneKuke2(int kontrolnaRacva2) {
        this.kontrolnikVucneKuke2 = kontrolnaRacva2;
    }

    public int getOpseg() {
        return opseg;
    }

    public void setOpseg(int opseg) {
        this.opseg = opseg;
    }

    public int getMinPodeljak() {
        return minPodeljak;
    }

    public void setMinPodeljak(int minPodeljak) {
        this.minPodeljak = minPodeljak;
    }

    public int getKlasa() {
        return klasa;
    }

    public void setKlasa(int klasa) {
        this.klasa = klasa;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getSerijskiBroj() {
        return serijskiBroj;
    }

    public void setSerijskiBroj(String serijskiBroj) {
        this.serijskiBroj = serijskiBroj;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getOdobrio() {
        return odobrio;
    }

    public void setOdobrio(String odobrio) {
        this.odobrio = odobrio;
    }

    public String getProizvodjac() {return proizvodjac;}

    public void setProizvodjac(String proizvodjac) {this.proizvodjac = proizvodjac;}

    public int getMernaTraka50() {
        return mernaTraka50;
    }

    public void setMernaTraka50(int mernaTraka50) {
        this.mernaTraka50 = mernaTraka50;
    }

    public int getMernaTraka5() {
        return mernaTraka5;
    }

    public void setMernaTraka5(int mernaTraka5) {
        this.mernaTraka5 = mernaTraka5;
    }

    public Date getDatumAMSS() {
        return datumAMSS;
    }

    public void setDatumAMSS(Date datumAMSS) {
        this.datumAMSS = datumAMSS;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFakturisano() {
        return fakturisano;
    }

    public void setFakturisano(String fakturisano) {
        this.fakturisano = fakturisano;
    }

    public String getPodatkeUneo() {
        return podatkeUneo;
    }

    public void setPodatkeUneo(String podatkeUneo) {
        this.podatkeUneo = podatkeUneo;
    }

   public boolean isStampano() {
        return stampano;
    }

    public void setStampano(boolean stampano) {
        this.stampano = stampano;
    }

    public String getInventarskiBroj() {
        return inventarskiBroj;
    }

    public void setInventarskiBroj(String inventarskiBroj) {
        this.inventarskiBroj = inventarskiBroj;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
}
