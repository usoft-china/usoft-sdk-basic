package com.usoft.sdk.basic.sso.client.open;

import com.usoft.sdk.basic.sso.client.BaseSdk;

/**
 * 询报价sdk
 * @author open
 * @date 2020/6/19 13:59
 */
public class OpenDemandSdk extends BaseSdk {
    public OpenDemandSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public OpenDemandSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

//    /**
//     * 查询卖家询价单详情
//     *
//     * @param req
//     * @return
//     */
//    public GetSellerDemandDetailResp getSellerDemandDetail(GetSellerDemandDetailReq.Builder req) throws Exception {
//        String url = baseUrl + "/open/seller/demand/detail/get";
//        Map<String, String> params = genSignToMap(req);
//        String respJson = HttpUtil.doGet(url, params, timeout);
//        GetSellerDemandDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetSellerDemandDetailResp.newBuilder(), respJson);
//        return resp.build();
//    }
//
//    /**
//     * 询价单产品报价与修改
//     *
//     * @param req
//     * @return
//     */
//    public OfferDemandProductResp offerDemandProduct(OfferDemandProductReq.Builder req) throws Exception {
//        String url = baseUrl + "/open/demand/product/offer";
//        String paramJson = genSignToJson(req);
//        String respJson = HttpUtil.doPost(url, paramJson, timeout);
//        OfferDemandProductResp.Builder resp = ProtoBufUtil.toProtoBuf(OfferDemandProductResp.newBuilder(), respJson);
//        return resp.build();
//    }
}
