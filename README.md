# AI Email Writer – Backend (Spring Boot + Gemini)

This repository contains the **backend API** for an AI-powered Email Writer that generates smart, professional email replies using **Google Gemini** and **Spring Boot**.  
The backend exposes clean REST endpoints that your React frontend can call to send email context, tone, and subject, and receive an AI‑crafted reply in real time. [attached_file:1][web:32]

---

## 🌟 Key Features

- **AI‑generated email replies**  
  Sends email context and tone to the Gemini API and returns a refined, human‑like reply suitable for real communication. [web:25][web:31]

- **RESTful Spring Boot API**  
  Well‑structured controllers, services, and DTOs to keep the codebase clean and easy to extend. [attached_file:1][web:32]

- **Config‑driven Gemini integration**  
  Uses environment / properties configuration for Gemini base URL and API key, keeping secrets out of the code and ready for production deployment. [web:28][web:32]

- **Frontend‑friendly responses**  
  JSON‑based request/response schema designed to plug directly into a React/Next.js UI without heavy transformation. [attached_file:1][web:27]

- **Deployable backend**  
  Architected to run on cloud platforms like Render or similar PaaS providers, making it easy to host as a standalone microservice used by multiple clients. [attached_file:1][web:32]

---

## 🧠 High‑Level Architecture

- **Client (separate repo)**: React / Next.js app where the user writes prompts and selects tone.  
- **This Backend (Spring Boot)**:
  - Exposes endpoints like `POST /api/v1/email/generate`
  - Validates and normalizes input (subject, body, tone, extra instructions)
  - Calls Gemini with a well‑designed prompt
  - Returns a structured reply ready to render in the UI [web:28][web:31]

- **External Service**: Google Gemini API for natural language generation. [web:32]

This separation clearly showcases your **backend specialization** and makes the project easier to reason about for recruiters or collaborators.

---

## 📡 API Design (Example)

> Update paths/names to match your exact implementation.

### 1. Generate Email Reply

**Endpoint**

POST /api/email/generate
Content-Type: application/json


**Sample Request Body**

{
    "emailContent" : "Hi how are u shubham what are u doing",
    "tone" : "frindly"
}


**Sample Response**


> Adjust folder/module names to match your actual code layout.

