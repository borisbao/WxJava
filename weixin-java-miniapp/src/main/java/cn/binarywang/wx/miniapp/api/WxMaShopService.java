package cn.binarywang.wx.miniapp.api;

import cn.binarywang.wx.miniapp.bean.shop.request.WxMaShopAuditBrandRequest;
import cn.binarywang.wx.miniapp.bean.shop.request.WxMaShopAuditCategoryRequest;
import cn.binarywang.wx.miniapp.bean.shop.response.WxMaShopAuditResponse;
import me.chanjar.weixin.common.error.WxErrorException;

/**
 * 交易组件公共服务
 * @author leiin
 */
public interface WxMaShopService {
  WxMaShopAuditResponse auditBrand(WxMaShopAuditBrandRequest request) throws WxErrorException;

  WxMaShopAuditResponse auditCategory(WxMaShopAuditCategoryRequest request) throws WxErrorException;
}
