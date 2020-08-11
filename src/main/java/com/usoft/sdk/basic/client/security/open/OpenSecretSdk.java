package com.usoft.sdk.basic.client.security.open;

import com.usoft.sdk.basic.client.BaseSdk;
import com.usoft.sdk.basic.utils.HttpUtil;
import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.security.external.open.api.protobuf.GetEntSecretReq;
import com.usoft.security.external.open.api.protobuf.GetEntSecretResp;

import java.util.Map;

/**
 * 企业密钥sdk
 * @author uas
 * @date 2020/8/11 15:59
 */
public class OpenSecretSdk extends BaseSdk {
    public OpenSecretSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public OpenSecretSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

    /**
     * 获取企业密钥
     *
     * @param req
     * @return
     */
    public GetEntSecretResp getEntSecret(GetEntSecretReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/secret/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetEntSecretResp.Builder resp = ProtoBufUtil.toProtoBuf(GetEntSecretResp.newBuilder(), respJson);
        return resp.build();
    }
}
