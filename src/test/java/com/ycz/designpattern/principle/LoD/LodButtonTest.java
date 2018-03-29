package com.ycz.designpattern.principle.LoD;

import org.testng.annotations.Test;

@Test
public class LodButtonTest {

    public void doButtonClick() {
        //这种感觉吗?? 不确定 在Mediator中操作其他的lod组件
        Mediator mediator = new Mediator();
        mediator.setLodList(new LodList("lodList"));
        LodButton button = new LodButton(mediator);
        button.click();
    }
}
