import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
//1引入element-plus组件库
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
//3引入element-plus图标库
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
//4使用element-plus图标库
const app = createApp(App)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
//5遍历对象中的所有图表组件并且注册到app中
for(const [key,component] of Object.entries(ElementPlusIconsVue)){
    app.component(key,component)
}
//2使用element-plus组件库
createApp(App).use(ElementPlus).use(store).use(router).mount('#app')