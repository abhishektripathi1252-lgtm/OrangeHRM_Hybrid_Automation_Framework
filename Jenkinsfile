pipeline {

    agent any

    stages {

        stage('Checkout') {

            steps {

                git 'https://github.com/yourrepo.git'
            }
        }

        stage('Build') {

            steps {

                bat 'mvn clean test'
            }
        }
    }
}