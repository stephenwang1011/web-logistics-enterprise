
package com.incito.logistics.pages;

import org.openqa.selenium.By;

/**
 * @author xy-incito-wy
 * @desprition  我的货源页面元素声明
 * */
public class MyGoodsPage {
	
	/**货源编号输入框*/
	public static final By MGP_INPUT_GOODSNO = By.name("goodsno");
	/**发货地输入框*/
	public static final By MGP_INPUT_ORIGINALCITY = By.name("localcity");
	/**收货地输入框*/
	public static final By MGP_INPUT_TARGETCITY= By.id("targetcity");
	/**搜索按钮*/
//	public static final By MGP_BUTTON_SEARCH = By.xpath("//button[@onclick='doSearch()']");	
	public static final By MGP_BUTTON_SEARCH = By.xpath("//*[@class='in-form-btn']/button[1]");//因为在企业版本的搜索按钮的onclick名称又改了，先改为统一格式	
	/**高级搜索按钮*/
	public static final By MGP_BUTTON_ADSEARCH = By.id("advancedBtn");
	/**高级搜索按钮中隐藏或者显示内容*/
	public static final By MGP_BUTTON_ADSEARCH_ARROW = By.xpath("//*[@id='advancedBtn']/span");
	//**********以下元素 是点击了高级搜索按钮出现的 我是分隔符*********************
	/**货物名称*/
	public static final By MGP_INPUT_GOODSNAME= By.name("goodsnames");
	/**单位-体积还是重量*/
	public static final By MGP_SELECT_GOODSUNIT = By.id("wvSwitch");
	/**开始吨位*/
	public static final By MGP_INPUT_STARTWEIGHT = By.name("startweight");
	/**结束吨位*/
	public static final By MGP_INPUT_ENDWEIGHT = By.name("endweight");
	/**开始体积*/
	public static final By MGP_INPUT_STARTVOLUME = By.name("startvolume");
	/**结束体积*/
	public static final By MGP_INPUT_ENDVOLUME = By.name("endvolume");
	/**发布开始时间*/
	public static final By MGP_INPUT_STARTDATE = By.name("startgoodstime");
	/**发布结束时间*/
	public static final By MGP_INPUT_ENDDATE = By.name("endgoodstime");
	//**********以上元素 是点击了高级搜索按钮出现的 我是分隔符*********************
	
	/**查看全部 新货源 已失效的货源 已交易的货源  四个radiobox*/
	public static final By MGP_RADIOBOX_GOODSTYPE = By.xpath("//label[@class='radio-inline']/input");
	/**判断每页条数的关键元素*/
	public static final By MGP_ITEM_GOODS = By.xpath("//*[@class='mygoods-inbox']");
	/**每条货源上的货物收发地址*/
	public static final By MGP_SPAN_ADDRESS = By.className("span-addr");
	/**每条货源上的顶部信息：货源剩余时间和发布时间等*/
	public static final By MGP_DIV_GOODSHEADER = By.className("mygoods-header");
	/**每条货源的  货源说明部分*/
	public static final By MGP_TEXT_INSTRUCTION = By.xpath("//*[@class='mygoods-basic']/p[3]");
	/**货源上的编辑按钮*/
	public static final By MGP_BUTTON_EDIT = By.xpath("//*[text()='编辑']");
	/**货源上的删除按钮*/
	public static final By MGP_BUTTON_DELETE = By.xpath("//*[text()='删除']");

	//******企业版本出现的页面元素****************************************
	/**tab标签：三个平台的标签*/
	public static final By MGP_TAB_GOODS_EP = By.cssSelector("ul[role='tablist']");
	/**tab标签：发布到平台的货源*/
	public static final By MGP_TAB_PLATFORMGOODS_EP = By.xpath("//*[text()='发布到平台的货源']");
	/**tab标签：发布到车队的货源*/
	public static final By MGP_TAB_CARSGOODS_EP = By.xpath("//*[text()='发布到车队的货源']");
	/**tab标签：从平台预定的货源*/
	public static final By MGP_TAB_PLATFORMORDERSGOODS_EP = By.xpath("//*[text()='从平台预订的货源']");
	/**每条货源上的货物收发地址*/
	public static final By MGP_SPAN_ADDRESS_EP = By.className("in-city-highlight");
	/**每条货源上的货物名称*/
	public static final By MGP_SPAN_GOODSNAME_EP = By.className("pl30");
	/**每条货源上的顶部信息：货源剩余时间和发布时间等*/
	public static final By MGP_DIV_GOODSTIME_EP = By.className("mygoods-center");
	
}
