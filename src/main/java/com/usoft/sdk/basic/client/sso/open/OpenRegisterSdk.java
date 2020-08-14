package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.client.BaseSdk;
import com.usoft.sdk.basic.utils.HttpUtil;
import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;

/**
 * 注册sdk
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenRegisterSdk extends BaseSdk {

    public OpenRegisterSdk(String baseUrl, String secretKey) {
        super(baseUrl, secretKey);
    }

    public OpenRegisterSdk(String baseUrl, String secretKey, int timeout) {
        super(baseUrl, secretKey, timeout);
    }

    /**
     * 个人注册
     *
     * @param req
     * @return
     */
    public PersonRegisterResp personRegister(PersonRegisterReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/register/person";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        PersonRegisterResp.Builder resp = ProtoBufUtil.toProtoBuf(PersonRegisterResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 企业注册
     *
     * @param req
     * @return
     */
    public EnterpriseRegisterResp enterpriseRegister(EnterpriseRegisterReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/register/enterprise";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        EnterpriseRegisterResp.Builder resp = ProtoBufUtil.toProtoBuf(EnterpriseRegisterResp.newBuilder(), respJson);
        return resp.build();
    }
}
