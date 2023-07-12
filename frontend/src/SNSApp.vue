

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="orders"
                        to="/orderAndPayments/orders"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        주문
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="deliveries"
                        to="/deliveryManagements/deliveries"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        배달
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="customerInquiries"
                        to="/customerServices/customerInquiries"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        고객 문의
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="marketingCampaigns"
                        to="/marketingAdvertisings/marketingCampaigns"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        마케팅 캠페인
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="systemManagements"
                        to="/itTechnologyServerManagements/systemManagements"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        시스템 관리
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container style="padding:0px;" v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container style="padding:0px;" v-else fluid>
                <div style="width:100%; margin:0px 0px 20px 0px; position: relative;">
                    <v-img style="width:100%; height:300px;"
                        src="https://oaidalleapiprodscus.blob.core.windows.net/private/org-IsZwoYj8yobpFySuytSuI26N/user-ha9EUDa76s1yoHT6JzgqOaFI/img-VUEKseLFXotkvgBsWLdNj8Ko.png?st=2023-07-12T06%3A13%3A08Z&se=2023-07-12T08%3A13%3A08Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-07-11T21%3A30%3A48Z&ske=2023-07-12T21%3A30%3A48Z&sks=b&skv=2021-08-06&sig=VOB2PUisPjy9GnodElaus/CIn5EtyTZ7qYZ3CFPvMK0%3D"
                    ></v-img>
                    <div class="App-main-text-overlap">배달의 민족 음식 배달 서비스</div>
                    <div class="App-sub-text-overlap">&quot;undefined 서비스로 모든 것을 해결하세요. 우리의 신속하고 효율적인 서비스로 당신의 모든 요구를 충족시켜드립니다. 지금 바로 방문하여 우리의 다양한 서비스를 경험하세요!&quot;</div>
                </div>
                <v-row>
                    <v-col cols="4" class="d-flex justify-center" v-for="(aggregate, index) in aggregate" :key="index">
                        <div 
                            class="flip-card"
                            @mouseover="flipCard(index)"
                            @mouseleave="unflipCard(index)"
                            :class="{ 'is-flipped': flipped[index] }"
                        >
                            <div class="flip-card-inner">
                                <div class="flip-card-front">
                                    <v-card
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <div style="text-align: left; padding:10px 15px 15px 15px; margin-top:-10px;">
                                            <h2>{{ aggregate.title }}</h2>
                                            <div>{{ aggregate.description }}</div>
                                        </div>
                                    </v-card>
                                </div>
                                <div class="flip-card-back">
                                    <v-card
                                        color="primary"
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                        :key="aggregate.key"
                                        :to="aggregate.route"
                                        @click="changeUrl()"
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <h2 style="color:white;">{{ aggregate.title }} 관리</h2>
                                    </v-card>
                                </div>
                            </div>
                        </div>
                    </v-col>
                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
        flipped: [],
        ImageUrl: 'https://oaidalleapiprodscus.blob.core.windows.net/private/org-IsZwoYj8yobpFySuytSuI26N/user-ha9EUDa76s1yoHT6JzgqOaFI/img-VUEKseLFXotkvgBsWLdNj8Ko.png?st=2023-07-12T06%3A13%3A08Z&se=2023-07-12T08%3A13%3A08Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-07-11T21%3A30%3A48Z&ske=2023-07-12T21%3A30%3A48Z&sks=b&skv=2021-08-06&sig=VOB2PUisPjy9GnodElaus/CIn5EtyTZ7qYZ3CFPvMK0%3D',
        aggregate: [
            { 
                title: '주문', 
                description: '사용자가 음식을 주문하는 도메인 객체입니다.', 
                key: 'orders', 
                route: '/orderAndPayments/orders',
                ImageUrl: '',
            },
            { 
                title: '배달', 
                description: '배달 기사가 음식을 배달하는 도메인 객체입니다.', 
                key: 'deliveries', 
                route: '/deliveryManagements/deliveries',
                ImageUrl: '',
            },
            { 
                title: '고객 문의', 
                description: '고객이 문의하는 도메인 객체입니다.', 
                key: 'customerInquiries', 
                route: '/customerServices/customerInquiries',
                ImageUrl: '',
            },
            { 
                title: '마케팅 캠페인', 
                description: '마케팅 및 광고 캠페인 도메인 객체입니다.', 
                key: 'marketingCampaigns', 
                route: '/marketingAdvertisings/marketingCampaigns',
                ImageUrl: '',
            },
            { 
                title: '시스템 관리', 
                description: 'IT 기술 및 서버 관리 도메인 객체입니다.', 
                key: 'systemManagements', 
                route: '/itTechnologyServerManagements/systemManagements',
                ImageUrl: '',
            },
            
        ],
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },
    watch: {
        cards(newCards) {
            this.flipped = new Array(newCards.length).fill(false);
        },
    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
            this.flipped.fill(false);
        },
        goHome() {
            this.urlPath = null;
        },
        flipCard(index) {
            this.$set(this.flipped, index, true);
        },
        unflipCard(index) {
            this.$set(this.flipped, index, false);
        },
    }
};
</script>
<style>
</style>
