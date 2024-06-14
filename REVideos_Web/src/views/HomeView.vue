<template>
  <div>
    <el-container>
      <!--顶栏布局-->
      <el-header style="background-color: red">
        <el-row :gutter="30">

          <el-col :span="12" style="background-color: aqua">
            1
          </el-col>
          <!--顶栏右侧布局-->
          <el-col :span="12" class="user">
            <!--用户登录-->
            <el-button type="primary" class="loginButton" circle @click="dialogVisible=true">登录</el-button>
            <!--登录弹窗-->
            <el-dialog :title="dialogTitle"
                       :show-close="false"
                       v-model="dialogVisible"
                       style="width: 770px;
                       height: 400px;
                       padding: 40px;
                       border-radius: 10px;
                       margin-top: 200px;
                       position: relative"
            >

              <el-button @click="test" :circle="true" style="position: absolute; right: 14px;top: 14px">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><g fill="none" fill-rule="evenodd"><path d="M24 0v24H0V0zM12.593 23.258l-.011.002l-.071.035l-.02.004l-.014-.004l-.071-.035c-.01-.004-.019-.001-.024.005l-.004.01l-.017.428l.005.02l.01.013l.104.074l.015.004l.012-.004l.104-.074l.012-.016l.004-.017l-.017-.427c-.002-.01-.009-.017-.017-.018m.265-.113l-.013.002l-.185.093l-.01.01l-.003.011l.018.43l.005.012l.008.007l.201.093c.012.004.023 0 .029-.008l.004-.014l-.034-.614c-.003-.012-.01-.02-.02-.022m-.715.002a.023.023 0 0 0-.027.006l-.006.014l-.034.614c0 .012.007.02.017.024l.015-.002l.201-.093l.01-.008l.004-.011l.017-.43l-.003-.012l-.01-.01z"/><path fill="currentColor" d="m12 13.414l5.657 5.657a1 1 0 0 0 1.414-1.414L13.414 12l5.657-5.657a1 1 0 0 0-1.414-1.414L12 10.586L6.343 4.929A1 1 0 0 0 4.93 6.343L10.586 12l-5.657 5.657a1 1 0 1 0 1.414 1.414z"/></g>
                </svg>
              </el-button>


              <el-form label-position="top" label-width="50px">
                <el-row :gutter="0">

                  <el-col :span="9" style="background-color: red;">
                    <span>二维码</span>
                  </el-col>

                  <el-col :span="15" style="background-color: aqua;">
                    2
                  </el-col>




                </el-row>
                <el-row :gutter="0">
                  <el-col :span="24" style="background-color: darkblue;
                  ">


                    3

                  </el-col>
                </el-row>

              </el-form>
            </el-dialog>

          </el-col>

          <el-col :span="12" style="background-color: fuchsia">
            3
          </el-col>
        </el-row>
      </el-header>

      <el-main>Main</el-main>
    </el-container>
  </div>

</template>


<script>

import {CloseBold} from "@element-plus/icons-vue";

export default {
  components: {CloseBold},
  data() {
    return {
      dialogVisible: false,
    }
  },
  methods: {
    test(){
      this.dialogVisible = false;
    }
  }
}


</script>


<style scoped>

.user {
  background-color: pink;
  height: 80px;
  text-align: right;
  .loginButton {
    width: 35px;
    height: 35px;
    margin-top: 20px;
  }
}

</style>