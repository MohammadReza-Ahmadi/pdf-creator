package com.vsq.pdfcreator;

import com.aspose.pdf.Document;
import com.aspose.pdf.HtmlLoadOptions;

/**
 * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
 * 8/13/2020, 11:03 PM
 */

public class HtmlToPdfByAspose {

    public static final String src = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\e-signature-micro-service\\content-repo\\html-to-pdf.html";
    public static final String dest = "F:\\MREZA_JAVA_PROJECT\\GITHUB_PROJECTs\\vosuq-projects\\VSQ-LIVE\\e-signature-micro-service\\content-repo\\html-to-pdf.pdf";


    public static void main(String[] args) {
    // Create HTML load options
        HtmlLoadOptions htmloptions = new HtmlLoadOptions();
    // Load HTML file
        Document doc = new Document(src, htmloptions);
    // Convert HTML file to PDF
        doc.save(dest);
    }
}
