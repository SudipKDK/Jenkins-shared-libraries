def call(String Project, String ImageTag, String dockerHubUser) {
    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred", 
        usernameVariable: "DOCKER_USER",
        passwordVariable: "DOCKER_PASS")]) {
        
        sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
        sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
        
        // Logout for security
        sh "docker logout"
    }
}


  
