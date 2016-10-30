# distributed_data_service
Distributed service for data exchange. This is a practice homework.


When data comes in a huge quantity, standalone service or framework will not satisfy business.

Thus, service needs to break up vertically, which complied with business, and scale up horizontally.

Here comes the distributed services, SOA services, CAP theory etc.

This framework, uses **`ZooKeeper`** to coordinate distributed services, **`dubbo`** to facilitate SOA such as publishing services and consuming services asynchronously.  



    -- parent,common  --> base public function and constant
     |
     |--system  --> service consumer
     |
     |--system-facade  -->  service interface
     |
     |--system-service  --> service provider




I used  `dubbox` here so as to make REST interface avaiable. But `dubbox` is not published in maven centeral repository. To compile `dubbox`,see [here](http://dangdangdotcom.github.io/dubbox/demo.html).