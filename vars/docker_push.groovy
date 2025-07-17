def call(String imageName,String tagName){
  withCredentials([usernamePassword(credentialsId:"dockerhubCred",passwordVariable: "dockerhubPass",usernameVariable:"dockerhubUser")]){
                sh "echo pushing the images to dockerhub"
                sh "docker login -u ${env. dockerhubUser} -p ${env.dockerhubPass}"
                sh "docker image tag ${imageName}:${tagName} ${env. dockerhubUser}/${imageName}:${tagName}"
                sh "docker push ${env. dockerhubUser}/${imageName}:${tagName}"
                }
}
