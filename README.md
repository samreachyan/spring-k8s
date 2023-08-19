## Docker

# Maven

```cmd
mvn clean install
```

# Docker image
Create docker image
```bash
docker build -t [docker-image-name] .
```

# Docker run container
```bash
docker run -d -p 8080:8080 --name springkube-k8s
```
# List container all
```bash
docker ps -a
```

# Remove the docker container
```bash
docker rm -f [container-id]
```

# Remove the docker image
```bash
docker rmi -f [docker-image-id]
```

# docker logs running 
```bash
docker logs -f [container-id]
```

## Kubernate 

# apply
```bash
kubectl apply -f k8s-deployment.yaml
```

# check deployment
```bash
kubectl get deployments
# OR
kubectl get pods
```

View Cluster Info:

```bash
kubectl cluster-info
```

List Nodes:
```bash
kubectl get nodes
```
List Pods:

```bash
kubectl get pods
```
List Services:

```bash
kubectl get services
```
Create a Deployment:

```bash
kubectl create deployment my-deployment --image=image-name:tag
```
Scale a Deployment:

```bash
kubectl scale deployment my-deployment --replicas=3
```
Expose a Deployment as a Service:

```bash
kubectl expose deployment my-deployment --type=LoadBalancer --port=80
```
Delete a Resource:

```bash
kubectl delete deployment my-deployment
```
Describe a Resource:

```bash
kubectl describe pod/my-pod-name
```
Get Logs from a Pod:

```bash
kubectl logs my-pod-name
```
Run a Command in a Pod:

```bash
kubectl exec -it my-pod-name -- /bin/bash
```
Port Forwarding to a Pod:

```bash
kubectl port-forward my-pod-name 8080:80
```
Apply a Configuration from a YAML file:

```bash
kubectl apply -f my-config.yaml
```
List Namespaces:

```bash
kubectl get namespaces
```
Switch to a Different Namespace:

```bash
kubectl config set-context --current --namespace=new-namespace
```


## Create Service

```bash
kubectl apply -f k8s-service.yaml
```

# Check local IP kubernate
```bash
kubectl get nodes -o wide
```

# check service and port
```bash
kubectl get services
```

## Thank
I hope this quickstart may useful for fundamental command.