package cn.binarywang.wx.miniapp.bean.shop;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class WxMaShopCategoryInfo {
  /**
   * 一级类目
   * <pre>
   * 是否必填：是
   * </pre>
   */
  @SerializedName("level1")
  private Integer level1;

  /**
   * 二级类目
   * <pre>
   * 是否必填：是
   * </pre>
   */
  @SerializedName("level2")
  private Integer level2;

  /**
   * 三级类目
   * <pre>
   * 是否必填：是
   * </pre>
   */
  @SerializedName("level3")
  private Integer level3;

  /**
   * 资质材料，图片url
   * <pre>
   * 是否必填：是
   * </pre>
   */
  @SerializedName("certificate")
  private String certificate;
}
