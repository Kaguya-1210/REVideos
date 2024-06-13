import { createMemoryHistory, createRouter } from 'vue-router'


//根目录配置，路routes转向到Login
const routes = [
    {
        path: '/',
        redirect: 'Home',
    },
    //登录页占位
    {
        path: "/login",
        name: 'Login',
        component: () => import('../views/LoginView.vue'),
    },
    {
        path: '/home',
        name: 'Home',
        component: () => import('../views/HomeView.vue'),
    }
];

const router = createRouter(
    {
      history: createMemoryHistory(),
      routes,
    }
);

export default router