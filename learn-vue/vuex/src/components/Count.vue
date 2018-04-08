<template>
  <div>
    <h2>{{msg}}</h2><hr/>
    <h3>{{$store.state.a.count}}</h3>
    <p>
      <button @click="add(2)" type="button" name="button">+</button>
      <button @click="reduce(10)" type="button" name="button">-</button>
      <!--   <button @click="$store.commit('add',5)" type="button" name="button">+</button>
      <button @click="$store.commit('reduce',3)" type="button" name="button">-</button> -->
    </p>
    <p>
      <button @click="addAction(10)" type="button" name="button">+</button>
      <button @click="reduceAction(1)" type="button" name="button">-</button>
    </p>
  </div>
</template>

<script>
  import store from '@/vuex/store';
  import {mapState,mapMutations,mapGetters,mapActions} from 'vuex'; // 状态和方法引用（固定写法）
  export default {
    data(){
      return{
        msg:'hello vuex!'
      }
    },
    // computed:{// 第一种方式
    //   mycouont(){
    //       return this.$store.state.count;
    //   }
    // },
    // computed:mapState({ // 第二种方式
    //   count:state=>state.count
    // }),
    computed:mapState(['count']), // 第三种方式
    methods: mapMutations(['add','reduce']),// 引用方法
    computed:{ // 扩展count
      ...mapState(['count'])
      // ,...mapGetters(['count'])
      // count(){
      //   return this.$store.getters.count;
      // }
    },
    methods: {
      ...mapMutations(['add','reduce']),
      ...mapActions(['addAction','reduceAction'])
    },
    store
  }
</script>
