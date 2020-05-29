<template>
    <div class="an-login">
        <el-row>
            <el-col :span="16">
                <div :style="'background:url('+lg+') no-repeat; background-size: 100% 100%; width: 100%; height:'+height+'px;'"></div>
            </el-col>
            <el-col :span="8">
                <div>
            <div style="width: 100%; display: flex;
    justify-content: center; margin-top:30%;">
                <img :src="logo" width="50%" height="80%">
            </div>
        <div style="width: 100%; display: flex;
    justify-content: center;">
            <el-tabs v-model="activeName" @tab-click="handleClick" style="width:60%;">
                <el-tab-pane label="账号登录" name="account">
                    <el-form style="width:100%">
                        <el-form-item>
                            <el-input
                                placeholder="请输入用戶名"
                                v-model="input"
                                prefix-icon="el-icon-user"
                                clearable>
                            </el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-input placeholder="请输入密码" 
                                prefix-icon="el-icon-lock" v-model="input" show-password></el-input>
                        </el-form-item>
                        <el-button style="width:100%" type="primary">登录</el-button>
                    </el-form>
                </el-tab-pane>
                <el-tab-pane label="扫码登录" name="scan">扫码登录</el-tab-pane>
            </el-tabs>
            
        </div>
    </div>
                
            </el-col>
        </el-row>
    </div>
</template>

<script>
    import {Row, Col, Form, FormItem, Input, Tabs, TabPane, Button} from 'element-ui'
    import lg from "@/assets/sleek_thumb@2x.jpg";
    import logo from "@/assets/logo.png";

    export default {
        name: 'Login',
        components: {
            'elRow': Row,
            'elCol': Col,
            'elForm': Form,
            'elFormItem': FormItem,
            'elInput': Input,
            'elTabs': Tabs,
            'elTabPane': TabPane,
            'elButton': Button
        },
        data() {
            return {
                lg,
                logo,
                height: 900,
                activeName: 'account'
            }
        },
        methods:{
            getHeight(){
                this.height=document.body.clientHeight;
            },
        　　
        },
        created(){
            this.getHeight()
        }
    }
</script>

<style scoped>
    .el-tabs__nav-wrap::after{
        background-color: none!important;
    }
</style>