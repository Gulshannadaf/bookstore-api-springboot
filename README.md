
---

## 📚 Bookstore REST API

A full-featured **Spring Boot REST API** to manage books — including Create, Read, Update, and Delete operations — with:

* ✅ Integrated **Swagger API docs**
* ✅ In-memory **H2 Database**
* ✅ Included **Postman collection** for testing

---

### 🎯 Project Objective

> Design and implement a RESTful API for managing a simple bookstore system that allows clients to perform all CRUD operations via HTTP requests, and interact with it using tools like Postman and Swagger UI.

---

### 🧰 Tech Stack

| Layer      | Tools Used                     |
| ---------- | ------------------------------ |
| Language   | Java 21                        |
| Framework  | Spring Boot 3.5.3              |
| Database   | H2 (in-memory)                 |
| Build Tool | Maven                          |
| API Docs   | Springdoc OpenAPI (Swagger UI) |
| Testing    | Postman                        |
| IDE        | IntelliJ IDEA                  |

---

### 🗂️ Features

| Feature                                    | Status |
| ------------------------------------------ | ------ |
| ✅ RESTful CRUD API for Books               | Ready  |
| ✅ JPA Entity Mapping & Repository          | Ready  |
| ✅ H2 Database Console (`/h2-console`)      | Ready  |
| ✅ Swagger UI API Docs (`/swagger-ui.html`) | Ready  |
| ✅ Postman Collection Included              | Ready  |
| ✅ Clean, modular code structure            | Ready  |
| ✅ Runs on `localhost:8081`                 | Ready  |

---

### 📍 API Endpoints

| Method | Endpoint          | Description    |
| ------ | ----------------- | -------------- |
| GET    | `/api/books`      | Get all books  |
| GET    | `/api/books/{id}` | Get book by ID |
| POST   | `/api/books`      | Add a new book |
| PUT    | `/api/books/{id}` | Update a book  |
| DELETE | `/api/books/{id}` | Delete a book  |

---

### 🔗 Swagger UI

> Access the full API documentation here:
> 👉 [`http://localhost:8081/swagger-ui.html`](http://localhost:8081/swagger-ui.html)

Built using **Springdoc OpenAPI**.

---

### 📬 Postman Testing

#### Steps:

1. Open Postman → Import → Raw Text
2. Paste Postman collection JSON
3. Set variable `{{base_url}}` = `http://localhost:8081`
4. Use the 5 prebuilt endpoints

📦 **Collection File**: `Bookstore_API.postman_collection.json`

---

### 💻 Run Locally

```bash
git clone https://github.com/Gulshannadaf/bookstore-api-springboot.git
cd bookstore-api-springboot
mvn spring-boot:run
```

Or import into **IntelliJ IDEA** and run `BookstoreApiApplication`.

---

### 🛢️ H2 Database Console

Spring Boot comes pre-configured with H2 embedded DB.
You can access it via browser:

🔗 [http://localhost:8081/h2-console](http://localhost:8081/h2-console)

| Setting      | Value                           |
| ------------ | ------------------------------- |
| JDBC URL     | `jdbc:h2:mem:bookdb`            |
| Username     | `sa`                            |
| Password     | *(leave empty)*                 |
| Driver Class | `org.h2.Driver` *(auto-filled)* |

---

### 📸 Screenshots

| Swagger UI                          | H2 Console                       | Postman                             |
| ----------------------------------- | -------------------------------- | ----------------------------------- |
| ![Swagger](screenshots/Swagger.png) | ![H2](screenshots/H2console.png) | ![Postman](screenshots/Postman.png) |

---

### 📁 Project Structure

```
bookstore-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.bookstore/
│   │   └── resources/
├── pom.xml
├── README.md
└── Bookstore_API.postman_collection.json
```

---

