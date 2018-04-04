<template>
  <div>
    <h2>{{msg}}</h2>
    <h3>newsId: {{$route.params.newsId}}</h3>
    <h3>newsTitle: {{$route.params.newsTitle}}</h3>
  </div>
</template>

<script>
export default {
  name: 'params',
  data () {
    return {
      msg: 'params page'
    }
  },
  beforeRouteEnter:(to,from,next)=>{
    console.log("准备进入params路由模板");
    next();
  },
  beforeRouteLeave:(to,from,next)=>{
    console.log("准备离开params路由模板");
    next();
  }
}
</script>
