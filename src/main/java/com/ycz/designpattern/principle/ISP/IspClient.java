package com.ycz.designpattern.principle.ISP;

public class IspClient {

    private DataHandler dataHandler;
    private ChartHandler chartHandler;
    private ReportHandler reportHandler;

    public DataHandler getDataHandler() {
        return dataHandler;
    }

    public void setDataHandler(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public ChartHandler getChartHandler() {
        return chartHandler;
    }

    public void setChartHandler(ChartHandler chartHandler) {
        this.chartHandler = chartHandler;
    }

    public ReportHandler getReportHandler() {
        return reportHandler;
    }

    public void setReportHandler(ReportHandler reportHandler) {
        this.reportHandler = reportHandler;
    }

    public void readData() {
        dataHandler.dataRead();
    }

    public void displayReport() {
        reportHandler.createReport();
        reportHandler.displayReport();
    }
}
