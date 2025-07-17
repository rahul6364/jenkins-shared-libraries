def call(string IMAGE_NAME,string tagName){
  sh "echo this is build step"
  sh "docker build -t ${IMAGE_NAME}:${tagName} ."
}
