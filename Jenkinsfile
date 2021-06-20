
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Johnonyango/MSSATSystem.git'
                sh 'cd MSSATSystem'
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
