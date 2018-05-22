/**
 * <b style="color:#FFA500">组合模式(Composite Pattern)</b>：组合多个对象形成<span style="color:#FF4500">树形结构</span>以表示具有“整体—部分”关系的层次结构。<br>
 * 组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性，<br>
 * 组合模式又可以称为“整体—部分”(Part-Whole)模式，它是一种对象结构型模式。<br>
 * 1. 主要优点<br>
 *
 * 组合模式的主要优点如下：<br>
 *
 * (1) 组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。<br>
 *
 * (2) 客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。<br>
 *
 * (3) 在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。<br>
 *
 * (4) 组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。<br>
 *
 * 2. 主要缺点<br>
 *
 * 组合模式的主要缺点如下：<br>
 *
 * 在增加新构件时很难对容器中的构件类型进行限制。有时候我们希望一个容器中只能有某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须通过在运行时进行类型检查来实现，这个实现过程较为复杂。<br>
 *
 * 3. 适用场景<br>
 *
 * 在以下情况下可以考虑使用组合模式：<br>
 *
 * (1) 在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户端可以一致地对待它们。<br>
 *
 * (2) 在一个使用面向对象语言开发的系统中需要处理一个树形结构。<br>
 *
 * (3) 在一个系统中能够分离出叶子对象和容器对象，而且它们的类型不固定，需要增加一些新的类型。<br>
 */
package com.ycz.designpattern.structural.composite;