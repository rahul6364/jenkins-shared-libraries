def call(){
  sh "echo this is deploy step"
  sh "docker compose down ||true "
  sh "docker compose up --build --remove-orphans -d"
}
