
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderAndPaymentOrderManager from "./components/listers/OrderAndPaymentOrderCards"
import OrderAndPaymentOrderDetail from "./components/listers/OrderAndPaymentOrderDetail"

import DeliveryManagementDeliveryManager from "./components/listers/DeliveryManagementDeliveryCards"
import DeliveryManagementDeliveryDetail from "./components/listers/DeliveryManagementDeliveryDetail"

import CustomerServiceCustomerInquiryManager from "./components/listers/CustomerServiceCustomerInquiryCards"
import CustomerServiceCustomerInquiryDetail from "./components/listers/CustomerServiceCustomerInquiryDetail"

import MarketingAdvertisingMarketingCampaignManager from "./components/listers/MarketingAdvertisingMarketingCampaignCards"
import MarketingAdvertisingMarketingCampaignDetail from "./components/listers/MarketingAdvertisingMarketingCampaignDetail"

import ItTechnologyServerManagementSystemManagementManager from "./components/listers/ItTechnologyServerManagementSystemManagementCards"
import ItTechnologyServerManagementSystemManagementDetail from "./components/listers/ItTechnologyServerManagementSystemManagementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderAndPayments/orders',
                name: 'OrderAndPaymentOrderManager',
                component: OrderAndPaymentOrderManager
            },
            {
                path: '/orderAndPayments/orders/:id',
                name: 'OrderAndPaymentOrderDetail',
                component: OrderAndPaymentOrderDetail
            },

            {
                path: '/deliveryManagements/deliveries',
                name: 'DeliveryManagementDeliveryManager',
                component: DeliveryManagementDeliveryManager
            },
            {
                path: '/deliveryManagements/deliveries/:id',
                name: 'DeliveryManagementDeliveryDetail',
                component: DeliveryManagementDeliveryDetail
            },

            {
                path: '/customerServices/customerInquiries',
                name: 'CustomerServiceCustomerInquiryManager',
                component: CustomerServiceCustomerInquiryManager
            },
            {
                path: '/customerServices/customerInquiries/:id',
                name: 'CustomerServiceCustomerInquiryDetail',
                component: CustomerServiceCustomerInquiryDetail
            },

            {
                path: '/marketingAdvertisings/marketingCampaigns',
                name: 'MarketingAdvertisingMarketingCampaignManager',
                component: MarketingAdvertisingMarketingCampaignManager
            },
            {
                path: '/marketingAdvertisings/marketingCampaigns/:id',
                name: 'MarketingAdvertisingMarketingCampaignDetail',
                component: MarketingAdvertisingMarketingCampaignDetail
            },

            {
                path: '/itTechnologyServerManagements/systemManagements',
                name: 'ItTechnologyServerManagementSystemManagementManager',
                component: ItTechnologyServerManagementSystemManagementManager
            },
            {
                path: '/itTechnologyServerManagements/systemManagements/:id',
                name: 'ItTechnologyServerManagementSystemManagementDetail',
                component: ItTechnologyServerManagementSystemManagementDetail
            },



    ]
})
