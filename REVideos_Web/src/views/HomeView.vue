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
                       v-model="dialogVisible"
                       style="
          width: 800px;
  padding: 40px;
border-radius: 10px;
margin-top: 280px;
"
            >
              <el-form label-position="top" label-width="80px">
                <el-row :gutter="30">

                  <el-col :span="5" style="background-color: red">
                    <span>f324</span>

                  </el-col>
                  <el-col :span="5" style="background-color: aqua">2</el-col>
                  <el-col :span="5" style="background-color: darkblue">3</el-col>

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

export default {
  data() {
    return {
      dialogVisible: false,
    }
  },
  methods: {
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