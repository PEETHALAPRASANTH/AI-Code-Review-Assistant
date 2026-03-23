🤖 AI Code Review Assistant

AI-powered backend application built with Spring Boot that analyzes source code and provides intelligent review suggestions using OpenAI API.
🚀 Features
* Analyze code based on programming language
* Generate AI-based suggestions for code quality and best practices
* REST API for seamless integration
* Handles real-world API errors (rate limits, authentication)
🛠️ Tech Stack

Java | Spring Boot | Spring WebFlux (WebClient) | REST APIs | OpenAI API | MySQL | Spring Data JPA | Maven | Postman

📌 API Usage
POST /review
Request:

```json
{
  "code": "public class Test { public static void main(String[] args) {} }",
  "language": "java"
}
Response:

```json
{
  "review": "AI-generated feedback on code quality, readability, and improvements..."
}
```

---

## ⚙️ Setup

1. Clone the repository
2. Add API key in `application.properties`
   openai.api.key=YOUR_API_KEY
3. Run the application
4. Test using Postman

---

## 📈 Future Improvements

* Code scoring system
* Multi-language support
* UI integration

---

## 👨‍💻 Author

Prasanth
