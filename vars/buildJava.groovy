def call() {
    stage('Build Java App') {
        echo "Building Java application using Maven..."
        sh 'mvn clean package -DskipTests'
    }
}
