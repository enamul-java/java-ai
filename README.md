
# AI Chat Boot with a Java Spring Boot and a local LLM Model 

## Project Architecture
<img width="631" height="311" alt="Untitled Diagram" src="https://github.com/user-attachments/assets/86f610ef-ff0b-42bf-a8a6-3683f6099233" />

### Summary

This project is an implementation of AI with Spring Boot and a local LLM Model
The following tech stack is used in the project:
 - Spring AI
 - Ollama (Docker image)
 - Gemma3 LLM 4b Parameter Model
 - Docker

### Step 1

Go to Spring Initializer, create a project with Spring Web and Ollama AI

<img width="1291" height="382" alt="Screenshot 2026-06-14 at 2 53 25 PM" src="https://github.com/user-attachments/assets/47378a1a-99a6-4e24-9da6-7a85e6c12094" />

and copy code from this project 
### OR Clone and Run the project

### Step 2
Open the Docker Desktop app and run the Docker Compose file (docker-compose.yml) from the project directory 

```
docker compose -f docker-compose.yml up
```
Ollama container will download and run in port: 11434 as mentioned in the compose file

You can check the ollama running status by the URL

```
http://localhost:11434
```

### Step 3
Run the command below to download and execute the gemma3 model via ollama

```
ocker exec -it ollama ollama run gemma3
```

### Step 4
Run the Spring Boot project 

THE REST API endpoint will be

```
http://localhost:9191/java-ai/v1/chat/ask/your_query
```

 

 ### Screenshots
 
  ### Answer for asking 'tell me about yourself.' in browser
  
 <img width="1278" height="286" alt="Screenshot 2026-06-14 at 3 15 30 PM" src="https://github.com/user-attachments/assets/3ac0f53a-e802-47d7-bd93-e98093d7b592" />

 ### Answer for asking 'tell me about yourself.' in CLI
  
 
<img width="850" height="409" alt="Screenshot 2026-06-14 at 3 16 40 PM" src="https://github.com/user-attachments/assets/d99c92e1-b7da-4612-8e1f-becf1f916afa" />


