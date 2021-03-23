package cn.binarywang.wx.miniapp.api.impl;

import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_ADD_URL;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_DELISTING_URL;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_DEL_URL;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_GET_LIST_URL;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_GET_URL;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_LISTING_URL;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_UPDATE_URL;
import static cn.binarywang.wx.miniapp.constant.WxMaApiUrlConstants.Shop.Spu.SPU_UPDATE_WITHOUT_URL;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaShopSpuService;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopSpuInfo;
import cn.binarywang.wx.miniapp.bean.shop.WxMaShopSpuWithoutAuditInfo;
import cn.binarywang.wx.miniapp.bean.shop.request.WxMaShopSpuPageRequest;
import cn.binarywang.wx.miniapp.bean.shop.response.WxMaShopAddSpuResponse;
import cn.binarywang.wx.miniapp.bean.shop.response.WxMaShopBaseResponse;
import cn.binarywang.wx.miniapp.bean.shop.response.WxMaShopGetSpuListResponse;
import cn.binarywang.wx.miniapp.bean.shop.response.WxMaShopGetSpuResponse;
import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.json.GsonHelper;

/**
 * @author boris
 */
@RequiredArgsConstructor
@Slf4j
public class WxMaShopSpuServiceImpl implements WxMaShopSpuService {

  private final WxMaService wxMaService;

  @Override
  public WxMaShopAddSpuResponse addSpu(WxMaShopSpuInfo spuInfo) throws WxErrorException {
    String responseContent = this.wxMaService.post(SPU_ADD_URL, spuInfo);
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopAddSpuResponse.class);
  }

  @Override
  public WxMaShopBaseResponse deleteSpu(Integer productId, String outProductId)
    throws WxErrorException {
    String responseContent = this.wxMaService
      .post(SPU_DEL_URL, GsonHelper.buildJsonObject("product_id", productId,
        "out_product_id", outProductId));
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopBaseResponse.class);
  }

  @Override
  public WxMaShopGetSpuResponse getSpu(Integer productId, String outProductId, Integer needEditSpu)
    throws WxErrorException {
    String responseContent = this.wxMaService
      .post(SPU_GET_URL, GsonHelper.buildJsonObject("product_id", productId,
        "out_product_id", outProductId, "need_edit_spu", needEditSpu));
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopGetSpuResponse.class);
  }

  @Override
  public WxMaShopGetSpuListResponse getSpuList(WxMaShopSpuPageRequest request)
    throws WxErrorException {
    String responseContent = this.wxMaService.post(SPU_GET_LIST_URL, request);
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopGetSpuListResponse.class);
  }

  @Override
  public WxMaShopAddSpuResponse updateSpu(WxMaShopSpuInfo spuInfo) throws WxErrorException {
    String responseContent = this.wxMaService.post(SPU_UPDATE_URL, spuInfo);
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopAddSpuResponse.class);
  }

  @Override
  public WxMaShopAddSpuResponse updateSpuWithoutAudit(WxMaShopSpuWithoutAuditInfo spuInfo)
    throws WxErrorException {
    String responseContent = this.wxMaService.post(SPU_UPDATE_WITHOUT_URL, spuInfo);
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopAddSpuResponse.class);
  }

  @Override
  public WxMaShopBaseResponse listingSpu(Integer productId, String outProductId)
    throws WxErrorException {
    String responseContent = this.wxMaService
      .post(SPU_LISTING_URL, GsonHelper.buildJsonObject("product_id", productId,
        "out_product_id", outProductId));
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopBaseResponse.class);
  }

  @Override
  public WxMaShopBaseResponse delistingSpu(Integer productId, String outProductId)
    throws WxErrorException {
    String responseContent = this.wxMaService
      .post(SPU_DELISTING_URL, GsonHelper.buildJsonObject("product_id", productId,
        "out_product_id", outProductId));
    return WxMaGsonBuilder.create().fromJson(responseContent, WxMaShopBaseResponse.class);
  }
}
