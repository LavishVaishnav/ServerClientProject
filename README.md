# ServerClientProject

This repository contains two implementations of a server-client architecture:
1. **Single-threaded Server-Client**: A simple server that handles one client at a time.
2. **Multi-threaded Server-Client**: A server that handles multiple clients concurrently using threads.

## Table of Contents
- [Project Overview](#project-overview)
- [Single-threaded Server-Client](#single-threaded-server-client)
- [Multi-threaded Server-Client](#multi-threaded-server-client)
- [Comparison](#comparison-between-single-threaded-and-multi-threaded)
- [How to Clone and Run](#how-to-clone-and-run)
- [Learning Objectives](#learning-objectives)

## Project Overview
In this project, we will learn the basics of client-server communication in Java. We explore two models: single-threaded and multi-threaded. Both versions allow a client to connect to a server, exchange messages, and then close the connection. However, the multi-threaded version allows handling multiple clients simultaneously.

## Single-threaded Server-Client
The **Single-threaded** version can only handle one client at a time. When a client connects, the server processes the request, responds, and then waits for the next client after the current client disconnects.

### Key Features:
- Handles one client at a time.
- Simpler code structure.
- Use case: Suitable for lightweight applications or environments where only one connection is required at a time.

### Files:
- `Singlethreaded/Server.java`: The server code.
- `Singlethreaded/Client.java`: The client code.

## Multi-threaded Server-Client
The **Multi-threaded** version spawns a new thread for each client, allowing multiple clients to connect and interact with the server simultaneously.

### Key Features:
- Handles multiple clients concurrently.
- Each client gets its own thread for processing.
- Use case: Suitable for real-time applications, chat servers, or any scenario where multiple clients might need to be handled at the same time.

### Files:
- `MultiThreaded/Server.java`: The multi-threaded server code.
- `MultiThreaded/Client.java`: The client code.

## Comparison Between Single-threaded and Multi-threaded
| Aspect                         | Single-threaded                   | Multi-threaded                     |
| ------------------------------ | ---------------------------------- | ---------------------------------- |
| **Client Handling**             | One client at a time               | Multiple clients simultaneously    |
| **Complexity**                  | Simple code structure              | Requires thread management         |
| **Performance**                 | Slow if multiple clients try to connect | Efficient for concurrent connections |
| **Use Case**                    | Simple applications                | Real-time applications with high concurrency |
| **Scalability**                 | Low scalability                    | High scalability                    |

## How to Clone and Run
To clone and run this project on your local machine:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/LavishVaishnav/ServerClientProject.git
   cd ServerClientProject


2. **Navigate to the relevant folder** (either `Singlethreaded` or `MultiThreaded`).

3. **Compile and run the server and client**:

   - **For Single-threaded**:
     - In one terminal, compile and run the server:
       ```bash
       javac Singlethreaded/Server.java
       java Singlethreaded.Server
       ```
     - In another terminal, compile and run the client:
       ```bash
       javac Singlethreaded/Client.java
       java Singlethreaded.Client
       ```

   - **For Multi-threaded**:
     - In one terminal, compile and run the server:
       ```bash
       javac MultiThreaded/Server.java
       java MultiThreaded.Server
       ```
     - In another terminal, compile and run the client:
       ```bash
       javac MultiThreaded/Client.java
       java MultiThreaded.Client
       ```

## Learning Objectives
By working through this project, we will:
- Understand the basic principles of client-server communication using Java sockets.
- Learn the difference between single-threaded and multi-threaded architectures.
- Implement multi-threaded applications that handle concurrent connections efficiently.
- Gain experience with Java networking and multi-threading concepts.
