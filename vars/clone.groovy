def call(String url, String branch){
  echo 'Cloning code from GitHub'
  git url: "${url}", branch: "${branch}"  
  echo 'Code clone successful'
}
