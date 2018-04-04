import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Hi1 from '@/components/Hi1'
import Hi2 from '@/components/Hi2'
import Params from '@/components/params'
import Error from '@/components/Error'


Vue.use(Router)

export default new Router({
  // mode:'history',// ‘history’去掉地址栏的/#
  mode:'hash',// 有#
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component:HelloWorld
    }
    ,{ // 参数传递
      name:'params',
      path:'/params/:newsId(\\d+)/:newsTitle',
      component:Params
      ,beforeEnter:(to,from,next)=>{ // 钩子函数
        console.log(to);
        console.log(from);
        next();
        // next('/');
      }
    }
    ,{ // 重定向
      path:'/goHome',
      redirect:'/'
    }
    ,{ // 参数重定向
      path:'/goParams/:newsId(\\d+)/:newsTitle',
      redirect:'/params/:newsId(\\d+)/:newsTitle'
    }
    ,{ // 别名
      path:'/hi1',
      component:Hi1,
      alias:'/dh'
    }
    ,{ // 404
      path:'*',
      component:Error
    }
  ]
});
