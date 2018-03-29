/**
 * <b>依赖倒转原则</b>抽象不应该依赖于细节，细节应该依赖于抽象(针对接口编程)<br>
 * 开闭原则的主要实现机制之一<br>
 * 传递参数或处理关联关系时（方法传参、返回类型、成员变量、局部变量等），应该引用层次更高的抽象层，如接口或抽象类<br>
 * 而具体类则只实现上层抽象的方法，不声明和实现自己的方法，否则这个实现也调用不到<br>
 * <strong style="color:red">DI(依赖注入)的思想</strong><br>
 */
package com.ycz.designpattern.principle.DIP;