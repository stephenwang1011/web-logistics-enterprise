package com.incito.logistics.testcase.findgoods;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.incito.logistics.base.BaseParpare;
import com.incito.logistics.pages.FindGoodsPage;
import com.incito.logistics.pages.HomePage;
import com.incito.logistics.pages.pageshelper.FindGoodsPageHelper;
import com.incito.logistics.pages.pageshelper.HomePageHelper;
import com.incito.logistics.pages.pageshelper.LoginPageHelper;
import com.incito.logistics.util.PropertiesDataProvider;

/**
 * @author xy-incito-wk
 * @Description 测试用例：在我的收藏页面取消当前页面的所有收藏
 * */
public class FindGoodsPage_621_PrivateGoods_Enterprise_CancelMyFavoriteGoods_Test extends BaseParpare {
	@Test
	public void CancelMyFavoriteGoods(ITestContext context) {
		String configFilePath = String.valueOf(context.getCurrentXmlTest().getParameter("userInfoPath"));
		int timeOut = Integer.valueOf(context.getCurrentXmlTest().getParameter("timeOut"));
		int sleepTime = Integer.valueOf(context.getCurrentXmlTest().getParameter("sleepTime"));
		String username = PropertiesDataProvider.getTestData(configFilePath, "enterprise_username");
		String password = PropertiesDataProvider.getTestData(configFilePath, "enterprise_password");

		HomePageHelper.waitHomePageToLoad(timeOut, seleniumUtil);
		HomePageHelper.enterPage(seleniumUtil, HomePage.HP_BUTTON_LOGIN);
		LoginPageHelper.waitLoginPageToLoad(timeOut, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, password);
		LoginPageHelper.checkUserInfo(timeOut, sleepTime, seleniumUtil, username);
		HomePageHelper.enterPage(seleniumUtil, HomePage.HP_LINK_FINDGOODS);
		FindGoodsPageHelper.waitFindGoodsPageToLoad(timeOut, seleniumUtil);
		FindGoodsPageHelper.enterPage(seleniumUtil, FindGoodsPage.FGP_BUTTON_MYFAVORITES);
		FindGoodsPageHelper.waitFindGoodsPageToLoad(timeOut, seleniumUtil);
		
		FindGoodsPageHelper.FavoGoodsChangepublicGoods(seleniumUtil, FindGoodsPage.FGP_GOODS_BUTTON_CANCELMYFAVO);
	}
}
