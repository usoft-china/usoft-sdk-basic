package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.client.BaseSdk;
import com.usoft.sdk.basic.utils.HttpUtil;
import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;

import java.util.Map;

/**
 * 企业sdk
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenEntSdk extends BaseSdk {
    public OpenEntSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public OpenEntSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

    /**
     * 获取企业信息
     *
     * @param req
     * @return
     */
    public GetEnterpriseInfoResp getEnterpriseInfo(GetEnterpriseInfoReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/info/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetEnterpriseInfoResp.Builder resp = ProtoBufUtil.toProtoBuf(GetEnterpriseInfoResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 修改企业信息
     *
     * @param req
     * @return
     */
    public UpdateEnterpriseResp updateEnterprise(UpdateEnterpriseReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/update";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateEnterpriseResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateEnterpriseResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 用户企业绑定
     *
     * @param req
     * @return
     */
    public BindUserEntResp bindUserEnt(BindUserEntReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/userent/bind";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        BindUserEntResp.Builder resp = ProtoBufUtil.toProtoBuf(BindUserEntResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 解绑用户企业关联
     *
     * @param req
     * @return
     */
    public UnbindUserEntResp unbindUserEnt(UnbindUserEntReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/enterprise/userent/unbind";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UnbindUserEntResp.Builder resp = ProtoBufUtil.toProtoBuf(UnbindUserEntResp.newBuilder(), respJson);
        return resp.build();
    }
}