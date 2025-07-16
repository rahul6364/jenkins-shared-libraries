def call(string url,string branch){
  sh "echo this is clonning the code"
  git url: ${url} , branch: ${branch}
  sh "clonning is completed"
}
