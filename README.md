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
***Tests:***
* covert methode:
    ![test1](resources/test_convert.png)  
* getAccount methode:
    ![test2](resources/getAccount.png)
* getListAccount:
    ![test3](resources/getListAccount.png)
* getStreamOfAccountTransactions:
    ![test4](resources/getStreamOfaccountTransaction.png)

## Part 2:

**The second part contains an implementation of an chat server using java and two chat server clients ([`java`](grpc_partie2/src/main/java/me/grpc/client/ChatClient.java),[`python`](clientChatPython) )**

***Tests :***
* using BloomRPC :
    ![test1](resources/bloom_message1.png)  
    ![test2](resources/bloom_message2.png)  

* using java client :  

    ![test3](resources/messaging_javaclient.png)

* using python client :


## Part 3:

**The third part contains a server game.at starts the server select randomlly a number between 1 and 1000 than the grpc clients try to find the number selected**


***Tests :***

* game server :
    ![test1](resources/game_server.png)
* bloomrpc client first try : 
    ![test2](resources/game_firstTry.png)
* bloomrpc client second try :  
    ![test3](resources/game_secondTry.png)
* bloomrpc client first try :  
    ![test4](resources/game_lastTrypng.png)

