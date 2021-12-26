package com.mgt_amss.mgt_amss;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.File;
import java.io.IOException;


@SpringBootApplication()
@EnableJpaRepositories()
public class MAGATTech_AMSS {

    public static void main(String[] args) {

        SpringApplication.run(MAGATTech_AMSS.class, args);

    }

}