package com.usoft.sdk.basic.client.sso.open;

import com.usoft.sdk.basic.client.BaseSdk;
import com.usoft.sdk.basic.utils.HttpUtil;
import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.sso.external.open.api.protobuf.*;

import java.util.Map;

/**
 * 用户sdk
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenUserSdk extends BaseSdk {

    public OpenUserSdk(String baseUrl, String secretKey) {
        super(baseUrl, secretKey);
    }

    public OpenUserSdk(String baseUrl, String secretKey, int timeout) {
        super(baseUrl, secretKey, timeout);
    }

    /**
     * 获取用户信息
     *
     * @param req
     * @return
     */
    public GetUserInfoResp getUserInfo(GetUserInfoReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/user/info/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetUserInfoResp.Builder resp = ProtoBufUtil.toProtoBuf(GetUserInfoResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 验证登录密码
     *
     * @param req
     * @return
     */
    public VerifyPasswordResp verifyPassword(VerifyPasswordReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/user/password/verify";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        VerifyPasswordResp.Builder resp = ProtoBufUtil.toProtoBuf(VerifyPasswordResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 修改登录密码
     *
     * @param req
     * @return
     */
    public UpdatePasswordResp updatePassword(UpdatePasswordReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/user/password/update";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdatePasswordResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdatePasswordResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 修改手机号
     *
     * @param req
     * @return
     */
    public UpdateMobileResp updateMobile(UpdateMobileReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/user/mobile/update";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateMobileResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateMobileResp.newBuilder(), respJson);
        return resp.build();
    }
}
