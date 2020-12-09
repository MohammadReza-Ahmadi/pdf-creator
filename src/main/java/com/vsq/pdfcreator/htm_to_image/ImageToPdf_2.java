package com.vsq.pdfcreator.htm_to_image;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfArray;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Link;
import com.itextpdf.layout.element.Paragraph;
import org.dom4j.DocumentException;

import java.io.IOException;

import static com.vsq.pdfcreator.htm_to_image.HtmlToImage.imgSrc;

//import com.itextpdf.text.*;

/**
 * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
 * 8/14/2020, 1:26 AM
 */

public class ImageToPdf_2 {

    public static final String src = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-image-fa.png";
    public static final String dest = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\pdf-creator\\imageConverted\\html-to-image.pdf";


    public static void writeImageToPdf(String src, String dest) throws IOException, DocumentException {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document document = new Document(pdfDoc);
        ImageData img = ImageDataFactory.create(imgSrc);
        Image imgModel = new Image(img);
        float w = imgModel.getImageScaledWidth();
        float h = imgModel.getImageScaledHeight();
        PdfFormXObject xObject = new PdfFormXObject(new Rectangle(850, 600));
        PdfCanvas xObjectCanvas = new PdfCanvas(xObject, pdfDoc);
        xObjectCanvas.ellipse(0, 0, 850, 600);
        xObjectCanvas.clip();
        xObjectCanvas.newPath();
        xObjectCanvas.addImage(img, w, 0, 0, h, 0, -600);
        com.itextpdf.layout.element.Image clipped = new com.itextpdf.layout.element.Image(xObject);
        clipped.scale(0.5f, 0.5f);
        document.add(clipped);


        /** Add anchor hypertext*/
        Paragraph paragraph = new Paragraph();
        Style style = new Style();
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        Color color = Color.convertRgbToCmyk(new DeviceRgb(60,60,60));
        style.setFont(font).setFontSize(9).setFontColor(color);

        paragraph.setFirstLineIndent(50);
        paragraph.setFixedLeading(245);
        PdfAction pdfAction =  PdfAction.createURI("http://www.google.com");
        Link link = new Link("my link ..",pdfAction);
        link.addStyle(style);
        link.getLinkAnnotation().setBorder(new PdfArray(new int[]{0,0,0}));
        paragraph.add(link);
        document.add(paragraph);

        document.close();
    }
}
