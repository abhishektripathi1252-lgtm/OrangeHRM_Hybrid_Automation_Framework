pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/abhishektripathi1252-lgtm/OrangeHRM_Hybrid_Automation_Framework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}