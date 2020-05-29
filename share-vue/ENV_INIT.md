## 开发环境准备

#### 1、安装 nodejs

> 自行百度安装

#### 2、安装Vue Cli

```shell
npm install --global vue-cli
# 如果网络慢，请安装cnpm
npm install -g cnpm --registry=https://registry.npm.taobao.org

cnpm install --global vue-cli

# 运行此命令如果出现如下错误：
cnpm : 无法加载文件 C:\Users\hp\AppData\Roaming\npm\cnpm.ps1，因为在此系统上禁止运行脚本。有关详细信息，请参阅 https:/go.microsoft.com/fwlink/?LinkID=135170 中的  
about_Execution_Policies。
所在位置 行:1 字符: 1
 cnpm install amfe-flexible
+ ~~~~
    + CategoryInfo          : SecurityError: (:) []，PSSecurityException
    + FullyQualifiedErrorId : UnauthorizedAccess

# 则用管理员运行powershell，输入回车，输入y，回车
set-ExecutionPolicy RemoteSigned
# 再执行 
cnpm install --global vue-cli
```

#### 3、 创建一个基于 webpack 模板的新项目敲命令行： 

```shell
vue init webpack test-vue-cli
```

#### 4、按照提示输入信息，如果不想使用预发检查，请不需要安装ESLint

#### 5、Test 可以根据自己喜欢使用，这里我选择先不安装，使用的时候直接配置

#### 6、添加Element UI 框架

```shell
npm install babel-preset-es2015 --save-dev
```