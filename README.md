### Spring SSL

To access 'health' api via https :
- Open browser
- http://localhost:8443/status/health
  - this will show 'Bad Request'
- Open https://localhost:8443/status/health
- Process with insecure secure certificate

Reference :
- https://www.youtube.com/watch?v=rm9OKTSm-4A
- Added extra property from what is mentioned in this video : 'server.ssl.key-store-password'