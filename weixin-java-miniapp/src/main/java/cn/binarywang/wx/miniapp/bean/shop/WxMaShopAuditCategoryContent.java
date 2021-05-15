package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WxMaShopAuditCategoryContent {
  /**
   * 营业执照或组织机构代码证，图片url/media_id
   * <pre>
   * 是否必填：是
   * </pre>
   */
  @SerializedName("license")
  private String license;

  @SerializedName("category_info")
  private WxMaShopCategoryInfo categoryInfo;
}
