package com.ycz.designpattern.principle.CRP;

import org.testng.annotations.Test;

@Test
public class CrpCustomerDaoTest {

    public void doAddCustomer() {
        //思路基本类似 通过注入成员(成员的功能)，制造新的行为
        //比如社团，社团引入拥有新技能的人才时，人才会带动社团产生变化，添加相应的词缀
        //如原本是简单的社团 加入了金刚狼时，这个社团可能就是 暴躁的金刚狼简单的社团QTQ...，社团多了能够释放金刚狼的能力
        CrpCustomerDao crpCustomerDao = new CrpCustomerDao();
        crpCustomerDao.setDbUtil(new OracleDBUtil());
        crpCustomerDao.addCustomer();
    }

}
