
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -version'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        Post{
            Always {
                cleanWs()
            }
        }
    }
}
