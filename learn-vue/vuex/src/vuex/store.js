// 导包
import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

// 声明状态
const state = {
  count:2
}
// 声明修改状态
const mutations = {
  add(state,n){
    state.count += n;
  },
  reduce(state,n){
    state.count -= n;
  }
}
// 声明过滤
const getters = {
   count: state=>state.count+=100
}
// 异步提交
const actions = {
  addAction(context){// 传入上下文
    context.commit('add',10);
    setTimeout(()=>{context.commit('reduce',1)},3000);
    console.log("我在reduce前执行");
  },
  reduceAction(commit){
    commit('reduce');
  }
}
const moduleA = {
  state,
  mutations,
  getters,
  actions
}
// 导出
export default new Vuex.Store({
  modules:{a:moduleA}
});
