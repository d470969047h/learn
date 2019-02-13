<template>
  <div id="app">
    <img src="./assets/logo.png">
    <div>
      <button @click="next" type="button" name="button">前进</button>
      <button @click="back" type="button" name="button">后退</button>
      <button @click="home" type="button" name="button">首页</button>
    </div>
    <!-- <router-view name="left" style="float:left;width:50%;height:300px;background-color:#ccc"></router-view>
    <router-view name="right" style="float:left;width:50%;height:300px;background-color:#aaa"></router-view> -->
    <router-link :to="{ name: 'HelloWorld'}">Home</router-link>
    <router-link :to="{ name: 'params', params: { newsId: 111,newsTitle:'震惊！傻强居然......'}}">params page</router-link>
    <router-link to="/goHome">goHome</router-link>
    <router-link to="/goParams/22222/傻强居然对老人。。。">redirect params</router-link>
    <router-link to="/hi1">Hi1</router-link>
    <router-link to="/dh">dh</router-link>
    <router-link to="/sdfsdf">404</router-link>

    <transition name="fade" mode="out-in">
          <router-view></router-view>
    </transition>
  </div>
</template>

<script>
export default {
  name: 'App',
  methods: {
    back() {
      this.$router.go(-1);
    },
    next(){
      this.$router.go(1);
    },
    home(){
      this.$router.push('/');
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.fade-enter{
  opacity: 0;
}
.fade-enter-active{
  transition: opacity .5s;
}
.fade-leave{
  opacity: 1;
}
.fade-leave-active{
  opacity: 0;
  transition: opacity .5s;
}
</style>
