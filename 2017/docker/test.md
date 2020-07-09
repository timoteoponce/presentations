

# Goal

Take an existing application and create a production-ready image for
running it.

- Clone the application from (node, typescript, react)

  git clone https://github.com/jaysoo/todomvc-redux-react-typescript

- Using the README.md description as basis, create an image called ypfb/todo

- Run the image and demostrate that it works

## References/Help

  - Sldes http://slides.com/timoteoponce/docker-workshop#/
  - You need to create a Dockerfile file and build an image from it
  - You can use https://hub.docker.com/ to search for an 
    image (nodejs) to be based on
  - The application needs to be built first
  - Docker commands that you will use:
    - docker build -t ypfb/todo .
    - docker run -p 3000:3000 ypfb/todo
