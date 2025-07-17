def call(String url,String branch){
  sh "echo this is clonning the code"
  try{
      git url: url , branch: branch
      sh "clonning is completed"
  }catch(e){
    sh "echo there is errore in clonning of ${url} is  ${e.message()}"
  }
}
