package com.ycz.designpattern.principle.ISP;

import org.testng.annotations.Test;

@Test
public class IspClientTest {

    public void doRead() {
        //通过定义不同的接口 IspClient中调用方法时 方法相对隔离，也方便使用不同的接口装配Client的能力
        //即使实现类实现了多个方法，但是因为接口的拆分产生了隔离行为，通过接口实际调用时 只能操作接口关注的方法
        //接口中应该尽量避免 存在不相关的方法
        IspClient ispClient = new IspClient();
        ispClient.setChartHandler(new ConcreteClass());
        ispClient.setDataHandler(new ConcreteClass());
        ispClient.setReportHandler(new ReportClass());
        ispClient.readData();
        ispClient.displayReport();
    }
}
