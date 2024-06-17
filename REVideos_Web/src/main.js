import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
//1引入element-plus组件库
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
//3引入element-plus图标库
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
//2使用element-plus组件库
createApp(App).use(ElementPlus).use(store).use(router).mount('#app');
//4使用element-plus图标库
const app = createApp(App)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
//5遍历对象中的所有图表组件并且注册到app中
for(const [key,component] of Object.entries(ElementPlusIconsVue)){
    app.component(key,component)
}
//6.1配置根路径
const BASE_URL = 'http://localhost:81';
//window里配置的都是全局内容，可以在任意script标签内部使用
window.BASE_URL = BASE_URL;
//在vue实例app中也添加全局属性BASE_URL,这样template标签中也可以使用根路径了
app.config.globalProperties.BASE_URL = BASE_URL;