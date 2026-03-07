# 🚀 Real-Time WebSocket Chat Application

A high-performance, full-stack chat application built with **Java** and **Spring Boot**. This project demonstrates real-time bidirectional communication using **WebSockets** and **STOMP** protocol.



## ✨ Features
* **Real-time Messaging:** Instant message delivery without page refreshes.
* **User Status:** Tracks when users join or leave the chat room.
* **Modern UI:** Responsive design crafted with **Tailwind CSS** for a sleek, professional look.
* **Topic-Based Messaging:** Uses a simple broker to manage message distribution.

## 🛠️ Tech Stack
* **Backend:** Java 17+, Spring Boot, Spring WebSocket.
* **Frontend:** HTML5, Tailwind CSS, SockJS, STOMP.js.
* **Build Tool:** Maven.

## 🚀 Getting Started

### Prerequisites
* JDK 17 or higher
* Maven 3.6+

### Installation & Run
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/SakshamK404/Websocket-chat.git](https://github.com/SakshamK404/Websocket-chat.git)
   cd Websocket-chat

```

2. **Build the project:**
```bash
mvn clean install

```


3. **Run the application:**
```bash
mvn spring-boot:run

```


4. **Access the App:** Open your browser and go to `http://localhost:8080`.

## 📂 Project Structure

```text
src/main/java/com/example/chat/
├── config/         # WebSocket & Message Broker configuration
├── controller/     # Chat Controller to handle message mapping
└── model/          # Message and Status data models

```

## 📝 Future Enhancements

* [ ] Integration with **Redis** for scaling to multiple server instances.
* [ ] Database persistence (MySQL/PostgreSQL) to store chat history.
* [ ] JWT-based Authentication for secure private messaging.

---

Developed by [Saksham](https://www.google.com/search?q=https://github.com/SakshamK404)

