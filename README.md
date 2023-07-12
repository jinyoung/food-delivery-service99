# 

## Model
www.msaez.io/#/storming/74bdb9fc-ce60-5981-72c2-e49d0ab59ac0

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- order-and-payment
- delivery-management
- customer-service
- marketing-advertising
- it-technology-server-management


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- order-and-payment
```
 http :8088/orders userId="userId" menuId="menuId" amount="amount" 세부주문="세부주문" 
```
- delivery-management
```
 http :8088/deliveries orderId="orderId" deliveryDriverId="deliveryDriverId" deliveryLocation="deliveryLocation" 
```
- customer-service
```
 http :8088/customerInquiries inquiryId="inquiryId" userId="userId" inquiryType="inquiryType" 
```
- marketing-advertising
```
 http :8088/marketingCampaigns campaignId="campaignId" campaignType="campaignType" 
```
- it-technology-server-management
```
 http :8088/systemManagements 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

