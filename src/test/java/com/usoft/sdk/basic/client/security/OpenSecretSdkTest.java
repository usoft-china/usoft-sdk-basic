package com.usoft.sdk.basic.client.security;

import com.usoft.sdk.basic.client.security.open.OpenSecretSdk;
import com.usoft.sdk.basic.utils.ProtoBufUtil;
import com.usoft.security.external.open.api.protobuf.GetEntSecretReq;
import com.usoft.security.external.open.api.protobuf.GetEntSecretResp;
import com.usoft.sso.external.open.api.protobuf.*;
import org.junit.Test;

/**
 * @author uas
 * @date 2020/6/19 16:26
 */
public class OpenSecretSdkTest {
    /**
     * 测试地址
     */
    private OpenSecretSdk openSecretSdk = new OpenSecretSdk("https://securityrest.uuzcc.cn", "10042875", "J5jL6X5hdc6FpzOYhxPIzqXfFvmE6D8JWYRCBW7kjK4=");

    /**
     * 正式地址
     */
//	private RatingSdk ratingSdk = new RatingSdk("http://api-product.usoftchina.com");

    @Test
    public void getEntSecret() throws Exception {
        GetEntSecretReq.Builder req = GetEntSecretReq.newBuilder();
        req.setEnuu(10050624);
        GetEntSecretResp resp = openSecretSdk.getEntSecret(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
