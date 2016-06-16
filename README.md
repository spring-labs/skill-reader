# Skill Reader
Read skills and endorsements from LinkedIn and builds a heatmap that can be included as svg.

# Features

- Presentation as heatmap or bubble chart
- Embeddable as SVG or image source (PNG, JPG)
- Connect to LinkedIn

# Extension points

- Connect to Xing, custom datasource

# Usage
 
 Accessing the root of the site will show a UI containing:
 
 - Description of the service
 - LinkedIn OAuth site to log in / connect with LinkedIn and allow access from SkillReader App
 
 After connecting with LinkedIn, the UI will automatically create a preview image and generate the URL to embed the image in different sizes:

```
<img src="https://skillreadr.herokuapp.com/fetch?user=AQXdSP_W41_UPs5ioT_t8HESyODB4FqbkJ8LrV_5mff4gPODzOYR&x=500&y=100" />
```

# Authentication

 Skill Reader uses OAuth2 to connect to LinkedIn.

# Development

 Start the Spring Boot application in IntelliJ and do a GET w/ your favorite REST client
 
```
http://localhost:8080
```

# Research

 We can build the app in many languages. Java with Spring Boot or Python are the favorite ones.
 
## Spring Boot
 
## Python libraries
 
 http://docs.python-requests.org/en/latest/
 
 https://plot.ly/python/bubble-charts/
 