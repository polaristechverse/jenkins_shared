def call() {
    stage('check software') {
        echo "checking the software"
        sh "terraform version"
        sh "packer version"
        sh "docker ps"
    }
}
