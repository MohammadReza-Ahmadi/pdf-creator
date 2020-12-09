package com.vsq.pdfcreator.htm_to_image;

import com.vsq.pdfcreator.ftl.FreeMarkerConsoleEx;
import freemarker.template.TemplateException;
import gui.ava.html.image.generator.HtmlImageGenerator;
import org.dom4j.DocumentException;

import java.io.File;
import java.io.IOException;

/**
 * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
 * 8/14/2020, 1:14 AM
 */

public class HtmlToImage {
    public static final String imgSrc = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-image-fa-2.png";
    public static final String pdfDest = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-image-fa-2.pdf";
    public static final String htmlSrc = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-pdf.html";

    public static void main(String[] args) throws IOException, DocumentException, TemplateException {
        String logoUrl = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\colourful.png";
        String personPhotoUrl = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\mohammad-reza-3.4.jpg";
        writeHtmlToImage(logoUrl,
                "ahmad-hosseini-document-name.pdf",
                "certname1234certname1234certname1234certname1234certname1234certname1234",
                "cerid987654321cerid987654321cerid987654321cerid987654321cerid987654321cerid987654321cerid987654321",
                "www.vsq.me/rt6WD91Qs",
                personPhotoUrl,
                "احمد حسینی"

        );
    }

    public static void writeHtmlToImage(String logoUrl, String certName, String certRetrieveId, String certId, String certUrl, String personPhotoUrl, String fullName) throws IOException, DocumentException, TemplateException, DocumentException {
        //        String html = "<body ><img src='http://nxcache.nexon.net/all/v1.5.2/img/gnt/games-dropdown/maplestory.jpg'></body>";
//        String html = "<body ><img src='file:///F:/MREZA_JAVA_PROJECT/GITHUB_PROJECTs/vosuq-projects/VSQ-LIVE/pdf-creator/imageConverted/colourful.png'></body>";

        String html = FreeMarkerConsoleEx.getFtlContent(logoUrl, certName, certRetrieveId, certId, certUrl, personPhotoUrl, fullName);
//        String html = ;

        HtmlImageGenerator hig = new HtmlImageGenerator();
        /**1'th load by html-content*/
        hig.loadHtml(html);

        hig.saveAsImage(new File(imgSrc));
        ImageToPdf.writeImageToPdf(imgSrc, pdfDest);
//        ImageToPdf_2.writeImageToPdf(imgSrc, pdfDest);
        System.out.println("Image wrote to pdf successfully.");

    }
}
