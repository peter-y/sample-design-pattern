/**
 * <b>接口隔离原则</b>使用多个专门的接口，而不使用单一的总接口<br>
 * 接口太大时，应该进行拆分成独立的小接口,每个接口承担相对独立的角色<br>
 * 两种不同的含义<br>
 * <ul>
 * <li>逻辑上的划分，一个类型提供所有方法特征的集合，角色隔离原则</li>
 * <li>传统的接口定义，狭义上的接口拆分，划分职责，尽量少和单一(需要控制粒度)，称为定制服务<br>
 * 可为客户端提供宽窄不同的接口</li>
 * </ul>
 */
package com.ycz.designpattern.principle.ISP;