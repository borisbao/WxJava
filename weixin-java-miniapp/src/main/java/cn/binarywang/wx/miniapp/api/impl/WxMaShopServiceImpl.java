package cn.binarywang.wx.miniapp.api.impl;

import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Common.AUDIT_BRAND;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Common.AUDIT_CATEGORY;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaShopService;
import cn.binarywang.wx.miniapp.bean.shop.request.WxMaShopAuditBrandRequest;
import cn.binarywang.wx.miniapp.bean.shop.request.WxMaShopAuditCategoryRequest;
import cn.binarywang.wx.miniapp.bean.shop.response.WxMaShopAuditResponse;
import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.enums.WxType;
import me.chanjar.weixin.common.error.WxError;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.json.GsonParser;

@RequiredArgsConstructor
@Slf4j
public class WxMaShopServiceImpl implements WxMaShopService {
  private static final String ERR_CODE = "errcode";
  private final WxMaService wxMaService;

  public WxMaShopAuditResponse auditBrand(WxMaShopAuditBrandRequest request) throws WxErrorException {
    String responseContent = this.wxMaService.post(AUDIT_BRAND, request);
    JsonObject jsonObject = GsonParser.parse(responseContent);
    if (jsonObject.get(ERR_CODE).getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent, WxType.MiniApp));
    }
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopAuditResponse.class);
  }

  public WxMaShopAuditResponse auditCategory(WxMaShopAuditCategoryRequest request) throws WxErrorException {
    String responseContent = this.wxMaService.post(AUDIT_CATEGORY, request);
    JsonObject jsonObject = GsonParser.parse(responseContent);
    if (jsonObject.get(ERR_CODE).getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent, WxType.MiniApp));
    }
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopAuditResponse.class);
  }
}
