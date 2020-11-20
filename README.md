# 优软Basic项目SDK

## sdk接入说明

#### A、私服方式
- 私服地址

```
<repository>
  <snapshots>
    <enabled>false</enabled>
  </snapshots>
  <id>release</id>
  <name>libs-release</name>
  <url>https://artifactory.uuzcc.cn/artifactory/libs-release</url>
</repository>
<repository>
  <snapshots />
  <id>snapshots</id>
  <name>libs-snapshot</name>
  <url>https://artifactory.uuzcc.cn/artifactory/libs-snapshot</url>
</repository>
```

- 版本引用

```
<dependency>
    <groupId>com.usoft.sdk</groupId>
    <artifactId>usoft-sdk-basic</artifactId>
    <!--测试环境-->
    <version>1.0-SNAPSHOT</version>
    <!--生产环境--> 
    <version>1.0</version>
</dependency>
```

#### B、单JAR包方式

- “版本号地址”里，后缀以“jar-with-dependencies.jar”为结尾的Jar包，直接下载即可

## 版本号地址

[snapshot 版本](https://artifactory.uuzcc.cn/artifactory/libs-snapshot/com/usoft/sdk/usoft-sdk-basic) 

[release 版本](https://artifactory.uuzcc.cn/artifactory/libs-release/com/usoft/sdk/usoft-sdk-basic)

## API文档地址

[账户中心 API文档地址](https://static.usoftchina.com/front/basic_sso.html#sso2.open.IOpenLoginService)

[权限服务 API文档地址](https://static.usoftchina.com/front/basic_security.html#security.open.IOpenSecretService)

## 使用示例地址

[使用示例地址](./src/test/java/com/usoft/sdk/basic)

## sdk开发规范

- 1、GitHub地址：[https://github.com/usoft-china/usoft-sdk-basic](https://github.com/usoft-china/usoft-sdk-basic)

-  2、当SDK开发完成后，合并代码入Master分支，并同步推送到GitHub地址

