FROM node:20.11.0-slim
WORKDIR /src
COPY ./frontend/ ./
RUN npm ci && npm run build
RUN npm install -g serve

WORKDIR /app
RUN cp -r /src/build/ /app/
CMD serve -s build
EXPOSE 3000