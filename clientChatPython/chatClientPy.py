import grpc
import serverchat_pb2 as chat_pb2
import time

def send_message(stub, message):
    chat_message = chat_pb2.ChatMessage(message=message)
    stub.sendChatMessage(chat_message)

def receive_messages(stub):
    response_iterator = stub.sendChatMessage(chat_pb2.ChatMessage())
    for response in response_iterator:
        print(f"Received message: {response.message}")

def run():
    channel = grpc.insecure_channel('localhost:8080')
    stub = chat_pb2.ChatServiceStub(channel)

    try:
        while True:
            message = input("Enter message: ")
            if not message:
                break
            send_message(stub, message)
    except KeyboardInterrupt:
        pass
    finally:
        channel.unsubscribe(close)

def close(channel):
    channel.close()

if __name__ == '__main__':
    run()