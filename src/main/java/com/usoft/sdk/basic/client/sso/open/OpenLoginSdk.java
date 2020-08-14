package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.client.BaseSdk;
import com.usoft.sdk.basic.utils.HttpUtil;
import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.SwitchEnterpriseReq;
import com.usoft.sso.external.open.api.protobuf.SwitchEnterpriseResp;
import com.usoft.sso.external.open.api.protobuf.UserLoginReq;
import com.usoft.sso.external.open.api.protobuf.UserLoginResp;

/**
 * 登录sdk
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenLoginSdk extends BaseSdk {

    public OpenLoginSdk(String baseUrl, String secretKey) {
        super(baseUrl, secretKey);
    }

    public OpenLoginSdk(String baseUrl, String secretKey, int timeout) {
        super(baseUrl, secretKey, timeout);
    }

    /**
     * 用户登录
     *
     * @param req
     * @return
     */
    public UserLoginResp userLogin(UserLoginReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/user/login";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UserLoginResp.Builder resp = ProtoBufUtil.toProtoBuf(UserLoginResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 用户切换企业
     *
     * @param req
     * @return
     */
    public SwitchEnterpriseResp switchEnterprise(SwitchEnterpriseReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/login/enterprise/switch";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        SwitchEnterpriseResp.Builder resp = ProtoBufUtil.toProtoBuf(SwitchEnterpriseResp.newBuilder(), respJson);
        return resp.build();
    }
}
