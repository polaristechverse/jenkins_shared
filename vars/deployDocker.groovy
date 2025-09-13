def call(String imageName, String containerName) {
    stage('Deploy Docker Container') {
        echo "Deploying Docker container: ${env.containerName}"
        // Stop old container if exists
        sh "docker rm -f ${env.containerName} || true"
        // Run new container
        sh "docker run -itd --name ${env.containerName} -p 5600:5600 ${env.imageName}"
    }
}
