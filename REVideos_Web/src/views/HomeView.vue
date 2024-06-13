<template>
  <div>
    <el-container>
      <el-header style="background-color: red">
        <el-row :gutter="30">

          <el-col :span="12" style="background-color: aqua">
            1
          </el-col>

          <el-col :span="12" class="user">
            <el-button type="primary" class="loginButton" circle>
              登录
            </el-button>
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


<script setup>

</script>

<style scoped>

.user {
  background-color: pink;
  height: 80px;
  text-align: right;
  .loginButton {
    width: 45px;
    height: 45px;
    margin-top: 20px;
  }
}

</style>