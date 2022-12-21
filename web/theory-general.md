#### **`What is tcp ?`**

> TCP (Transmission Control Protocol) is responsible for transmitting data between devices over the Internet. It is a reliable, stream-oriented protocol that establishes a connection between two devices and guarantees that all data sent over the connection will be received by the other device in the same order it was sent. To maintain the state of the connection, TCP uses a variety of mechanisms, including sequence numbers and window sizes.


#### **`What is udp ?`**
> UDP (User Datagram Protocol) is another transport-layer protocol that is used to send data over the Internet. It is a connectionless, unreliable protocol that is used for real-time, low-latency communications. Unlike TCP, UDP does not establish a connection and does not guarantee that the packets of data it sends will be received. It is used for applications that require low latency and are tolerant of lost or corrupted data, such as real-time audio and video streaming.


#### **`What is ip ?`**
> IP is a network-layer protocol that is responsible for routing packets of data from one device to another over the Internet. When you send an email or open a web page, your device sends the data as a series of IP packets, which are then routed through a series of interconnected devices (such as routers and switches) until they reach their destination. IP does not maintain state in the sense of keeping track of the data that is being transmitted. Instead, it provides a means of routing the packets of data from one device to another by including the destination and source IP addresses in each packet.


#### **`What is tcp/ip ?`**
> TCP/IP (Transmission Control Protocol/Internet Protocol) is a suite of protocols that is used to transmit data over the Internet. It is the primary protocol that enables devices to communicate with each other and exchange information on the Internet.


#### **`How does tcp stores state ?`**

> To maintain the state of the connection, TCP uses a variety of mechanisms, including sequence numbers and window sizes.
> 
> Sequence numbers are used to ensure that the packets are received in the correct order. When a device sends a packet of data using TCP, it includes a sequence number in the packet. The receiving device acknowledges receipt of the packet by sending back an acknowledgement (ACK) packet with the next expected sequence number. If the receiving device does not receive a packet with the expected sequence number, it will request that the packet be resent. This ensures that the packets are received in the correct order and that any lost packets are retransmitted.
>
> Window sizes are used to regulate the amount of data that can be transmitted at any given time. When a device establishes a TCP connection, it advertises a window size to the other device, which indicates the maximum amount of data it is willing to receive at any given time. The sending device can then transmit up to the maximum window size, and the receiving device will send back an ACK packet with the next expected sequence number to indicate that it is ready to receive more data. This helps to prevent the sender from overwhelming the receiver with too much data at once.
>
> In addition to sequence numbers and window sizes, TCP also maintains state in the form of a connection state machine. When a connection is established, it goes through a series of states, such as SYN_SENT, SYN_RECEIVED, and ESTABLISHED, and transitions between these states as the connection is established, data is transmitted, and the connection is closed.


#### **`Why does http and udp does not store state ?`**

> HTTP is a stateless protocol, which means that it does not maintain state in the sense of keeping track of the data that is being transmitted or remembering information about the connection after it has been closed. Each request is treated as an independent unit, and the connection is closed once the data transmission is complete. This allows HTTP to be more efficient and scaleable, as it does not need to maintain a connection or keep track of state for each request.
>
> UDP (User Datagram Protocol) is a connectionless, unreliable protocol that is used to send data over the Internet. It is similar to TCP, but does not establish a connection before transmitting data and does not guarantee that the packets of data it sends will be received. Because UDP is an unreliable protocol, it is up to the application using UDP to handle any lost or corrupted data. This makes UDP useful for applications that require low latency and are tolerant of lost or corrupted data, such as real-time audio and video streaming.


#### **`If tcp stores state and http uses tcp how is it stateless ?`**

> HTTP doesn't 'inherit' from TCP, but rather uses it for a transport. HTTP uses TCP for a stateful connection, but then disconnects. Later it will connect again, if needed. So, while you browse through a web site you create many different connections. Each one of those connections is stateful, but the conversation as a whole is not, since you are dropping the connection with every conversation.
>
> HTTP is stateless because every request is independent of any other requests whether they are transported through the same connection or a different connection. In other words every request contains every information that is needed to process that request.


#### **`Connectionless vs Stateless ?`**

> Connectionless protocols do not establish a connection before transmitting data. This means that each packet of data is treated as an independent unit and is sent on its way without regard to any other packets that may have been sent before or after it. Connectionless protocols are typically faster and more efficient than connection-oriented protocols, but they are also less reliable because there is no way to guarantee that the packets will be received or that they will be received in the correct order.
>
> Stateless protocols do not maintain state in the sense of keeping track of the data that is being transmitted or remembering information about the connection after it has been closed. Each request is treated as an independent unit, and the connection is closed once the data transmission is complete. This allows stateless protocols to be more efficient and scaleable, as they do not need to maintain a connection or keep track of state for each request.



