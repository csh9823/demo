<template>
    <div>
        <h3>
            입고완료 리스트
        </h3>
    </div>
    <div v-if="loading">데이터를 로딩 중입니다...</div>
    <ListStockComItem v-else :datas="datas" />
</template>

<script setup>
import axios from 'axios';
import ListStockComItem from '../components/ListStockComItem.vue';
import { onMounted, ref } from 'vue';

const datas = ref([]);
const loading = ref(false);

const fetchData = async() => {
    try {
        loading.value = true;
        const response = await axios.post('/api/storeList');
        console.log(response);
        datas.value = response.data.data;
        console.log(datas)
        loading.value = false;
    } catch (error) {
        loading.value = false;
        console.log(error)
    }
}

onMounted(() => {
    fetchData();
})


</script>

<style lang="scss" scoped>

</style>