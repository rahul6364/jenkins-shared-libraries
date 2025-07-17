def call(String IMAGE_NAME,String tagName){
  sh "echo this is build step"
  sh "docker build -t ${IMAGE_NAME}:${tagName} ."
}
