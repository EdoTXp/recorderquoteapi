# Recorder Quote API 🎶

A RESTful API built with **Spring Boot** to calculate price quotes for musical recorders (Yamaha, Moeck, etc.), developed as a final challenge project.

## 🚀 Technologies Used

- **Java**
- **Spring Boot** (Spring Web, Spring Data JPA)
- **H2 Database** (In-memory database with automatic seeding via `CommandLineRunner`)
- **Lombok** (To reduce boilerplate code)
- **SpringDoc OpenAPI / Swagger** (For interactive API documentation)

## 🏛️ Design Patterns Implemented

- **Singleton:** Handled natively by the Spring IoC container for all application beans (`@Service`, `@Component`, `@RestController`).
- **Strategy Pattern:** Used for dynamic shipping cost calculations based on recorder size (`SMALL`, `MEDIUM`, `LARGE`), leveraging Spring's map injection capability.
- **Facade / Service Pattern:** `QuoteService` acts as a facade, orchestrating data retrieval from the repository and applying the business/shipping logic.

## 📡 API Endpoints

- `GET /quotes/{id}`: Retrieves a detailed price quote (including base price, material- and size-dependent shipping costs, and total price) for a specific recorder.

## 🛠️ Custom Exceptions

The application implements clean, targeted custom exceptions returning professional HTTP status codes:

- `RecorderNotFoundException` (`404 Not Found`)
- `ShippingStrategyNotFoundException` (`400 Bad Request`)

## 🏃‍♂️ How to Run

1. Clone the repository or open the project folder in your favorite IDE (VS Code, IntelliJ).
2. Run the main application class: `Application.java`.
3. Open **Swagger UI** in your browser to test the endpoints interactively:
   `http://localhost:8080/swagger-ui/index.html`
