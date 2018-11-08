# How to use this  project

 1. install redis (if redis is already installed,skip this step)
 2. update redis infomation in bootstrap.yml from order and  zuulway.(if redis is hosted in localhost,then skip this step)
 3. start up three projects.
 4. webbrowser to localhost:8080/order-management/orders
 5. you will be directed to http://localhost:8080/login, input name and password with gateway:password
 6. you will be redirected to localhost:8080/order-management/orders and see the data.
 7. close the webbrowser and browse http://localhost:8080/order-management/orders, in  this step  you DONT need to  input username password again.

 you can also see the sessionid stored in redis with commands:

 redis-cli
 keys *