# kafka-demo
Order management with spring cloud stream kafka. Demo for project x.

To run the project-->
- Navigate to /saga-orchestration
- open terminal
- run 'docker compose up'
- after the kafka manager is up and running at port 9000
- run the microservices
- eureka server will be running at port 8721

Working Endpoints:
http://localhost:8080/order/create (make sure to add appropriate request body)
http://localhost:8080/order/all

Before closing the project make sure to stop docker compose
