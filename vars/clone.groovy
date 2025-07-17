def call(String url,String branch){
  sh "echo this is clonning the code"
  git url: url , branch: branch
  sh "clonning is completed"
}
