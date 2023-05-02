# DISTRIBUTED SYSTEMS WITH GRPC


## Part 1:

**The first part contains the discount with the demo vedio that show a simple implentation of different models of GRPC.**

To build a web service using gRPC, we go through several steps:

1. you need to define the service interface and the method request and response types using protocol buffers.
    ![ebank_proto](resources/ebank_proto.png)

2. Then you use the protocol buffer compiler for your application's language to generate client and server code.  
Here i used a maven plugin to generate the code.

3. The server implements the service interface and runs a gRPC server to handle client calls.  
    ![ebank_server](resources/server.png)

4. The client has a stub (referred to as just a client in some languages) that provides the same methods as the server.

5. The client calls the stub and the server calls the corresponding method implementation to handle the call.  

we can also use some tools to test the service provided like BloomRPC :  
**Tests:**
* covert methode:
    ![test1](resources/test_convert.png)  
* getAccount methode:
    ![test2](resources/getAccount.png)
* getListAccount:
    ![test3](resources/getListAccount.png)
* getStreamOfAccountTransactions:
    ![test4](resources/getStreamOfaccountTransaction.png)

## Part 2:


