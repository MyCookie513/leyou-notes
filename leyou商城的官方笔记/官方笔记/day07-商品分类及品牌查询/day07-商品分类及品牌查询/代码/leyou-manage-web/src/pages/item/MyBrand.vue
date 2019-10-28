<template>
  <v-card>
    <v-card-title class="layout row">
      <v-btn color="primary">
        新增品牌
      </v-btn>
      <v-spacer/>
      <v-text-field
        label="输入搜索条件"
        append-icon="search"
        single-line
        hide-details
        class="flex sm3"
        v-model="search"
      />
    </v-card-title>
    <v-divider/>
    <v-data-table
      :headers="headers"
      :items="brands"
      :pagination.sync="pagination"
      :total-items="totalBrands"
      :loading="loading"
      class="elevation-1"
    >
      <template slot="items" slot-scope="props">
        <td class="text-xs-center">{{ props.item.id }}</td>
        <td class="text-xs-center">{{ props.item.name }}</td>
        <td class="text-xs-center"><img :src="props.item.image"/></td>
        <td class="text-xs-center">{{ props.item.letter }}</td>
        <td class="justify-center layout px-1">
          <v-btn small color="info">
            编辑
          </v-btn>
          <v-btn small color="warning">
            删除
          </v-btn>
        </td>
      </template>
    </v-data-table>
  </v-card>
</template>

<script>
  export default {
    name: "my-brand",
    data() {
      return {
        headers: [
          {text: "id", value: "id", align: 'center', sortable: true},
          {text: "名称", value: "name", align: 'center', sortable: false},
          {text: "LOGO", value: "image", align: 'center', sortable: false},
          {text: "首字母", value: "letter", align: 'center', sortable: false},
          {text: "操作", align: 'center', sortable: false},
        ],
        brands: [],
        pagination: {},
        totalBrands: 0,
        loading: false,
        search: ''
      }
    },
    watch: {
      pagination: {
        deep: true,
        handler() {
          this.getDataFromServer();
        }
      },
      search() {
        this.getDataFromServer();
      }
    },
    created() {
      this.getDataFromServer();
    },
    methods: {
      getDataFromServer() {
        // 开启进度条
        this.loading = true;

        // 发起ajax请求
        // page,rows,key,sortBy, desc
        this.$http.get("/item/brand/page", {
          params: {
            page: 1,
            rows: 5,
            sortBy: "id",
            desc: true,
            key: this.search,
          }
        }).then(resp => {
          console.log(resp.data);
        })
      }
    }
  }
</script>

<style scoped>

</style>
