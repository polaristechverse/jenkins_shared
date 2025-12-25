def call(String imageName, String containerName) {
    stage('Deploy Docker Container') {
        echo "Deploying Docker container: ${containerName}"
        // Stop old container if exists
        sh "docker rm -f ${containerName} || true"
        // Run new container
        sh "docker run -itd --name ${containerName} -p 5600:5600 ${imageName}"
    }
}
