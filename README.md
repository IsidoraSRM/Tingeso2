# 🏎️ Tingeso2 
Proyecto KartingRM con Mircroservicios

## 🚀 Comandos inicio de pods  
### 1) Arrancar Minikube
minikube start

### 2) Desplegar Config Server y esperar a que esté listo
kubectl apply -f .\config-server-deployment.yaml


### 3) Desplegar Eureka y esperar
kubectl apply -f .\eureka-server-deployment.yaml


### 4) Desplegar Postgres (Service + Deployment)
kubectl apply -f .\postgres-service.yaml
kubectl apply -f .\postgres-deployment.yaml


#### 5) Desplegar Gateway y esperar
kubectl apply -f .\gateway-deployment.yaml


### 6) Desplegar microservicios ms1…ms7
kubectl apply -f .\ms1-deployment.yaml
kubectl apply -f .\ms2-deployment.yaml
kubectl apply -f .\ms3-deployment.yaml
kubectl apply -f .\ms4-deployment.yaml
kubectl apply -f .\ms5-deployment.yaml
kubectl apply -f .\ms6-deployment.yaml
kubectl apply -f .\ms7-deployment.yaml

### 7) Desplegar Frontend (ConfigMap + Deployment + Service)
kubectl apply -f .\frontend-nginx-cm.yaml
kubectl apply -f .\frontend-deployment.yaml
kubectl apply -f .\frontend-service.yaml

### 8) Verificar
kubectl get pods -w
