package com.question.answer.jasper.report;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import java.util.HashMap;
import java.util.Map;

public class PrintJasperReport {
    void print() {
        String sourceFileName = "src/main/resources/print_file.jrxml";
        int id = Integer.parseInt("123");
        System.out.println("Compiling Report Design ...");
        try {
            JasperReport jr = JasperCompileManager.compileReport(sourceFileName);
            JRDataSource ds = new JREmptyDataSource();
            Map parameters = new HashMap<>();
            parameters.put("id", "Select c.name, c.phonenumber from customer c where c.id = "+id);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, ds);
            JasperExportManager.exportReportToPdfFile(jp, "x.pdf");
        } catch (JRException e) {
            e.printStackTrace();
        }
        System.out.println("Done compiling!!! ...");
    }
}
