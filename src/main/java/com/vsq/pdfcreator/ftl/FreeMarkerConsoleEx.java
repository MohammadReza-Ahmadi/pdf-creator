package com.vsq.pdfcreator.ftl;

/**
 * Author: MohammadReza Ahmadi,  m.reza79ahmadi@gmail.com
 * 8/14/2020, 4:37 AM
 */

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class FreeMarkerConsoleEx {

    public static void main(String[] args) throws IOException, TemplateException {
//
//        Configuration cfg = new Configuration(new Version("2.3.23"));
//        cfg.setClassForTemplateLoading(FreeMarkerConsoleEx.class, "/templates/");
//        cfg.setDefaultEncoding("UTF-8");
//
//        Template template = cfg.getTemplate("form.ftl");
//
//        Map<String, Object> templateData = new HashMap<>();
//        templateData.put("msg", "Today is a beautiful day");
//
//        try (StringWriter out = new StringWriter()) {
//            template.process(templateData, out);
//            String ftlContent = out.getBuffer().toString();
//            System.out.println(ftlContent);
//            out.flush();
//        }
    }

    public static String getFtlContent(String logoUrl,String certName,String certRetrieveId,String certId,String certUrl,String personPhotoUrl,String fullName) throws IOException, TemplateException {
        Configuration cfg = new Configuration(new Version("2.3.23"));
        cfg.setClassForTemplateLoading(FreeMarkerConsoleEx.class, "/templates/");
        cfg.setDefaultEncoding("UTF-8");

        Template template = cfg.getTemplate("form.ftl");

        Map<String, Object> templateData = new HashMap<>();
        templateData.put("logoUrl", logoUrl);
        templateData.put("certName", certName);
        templateData.put("certRetrieveId", certRetrieveId);
        templateData.put("certId", certId);
        templateData.put("certUrl", certUrl);
        templateData.put("personPhotoUrl", personPhotoUrl);

        templateData.put("email", "email");
        templateData.put("phone", "phone");
        templateData.put("fatherName", "fatherName");
        templateData.put("birthDate", "birthDate");
        templateData.put("certNumber", "certNumber");
        templateData.put("identityNumber", "identityNumber");
        templateData.put("fullName", fullName);

        try (StringWriter out = new StringWriter()) {
            template.process(templateData, out);
            String ftlContent = out.getBuffer().toString();
//            System.out.println(ftlContent);
            System.out.println("ftl parsed successfully.");
            out.flush();
            return ftlContent;
        }
    }

}