def call(string dockerhubCred, string imageName,string tagName,string userName){
  withCredentials([usernamePassword(credentialsId:"${dockerhubCred}",passwordVariable: "dockerhubPass",usernameVariable:"dockerhubUser")]){
                sh "echo pushing the images to dockerhub"
                sh "docker login -u ${env. dockerhubUser} -p ${env.dockerhubPass}"
                sh "docker image tag ${imageName}:${tagName} ${userName}/${imageName}:${tagName}"
                sh "docker push ${env. dockerhubUser}/${imageName}:${tagName}"
                }
}
