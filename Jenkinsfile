pipeline {
    agent any

    tools {
        maven 'Maven399'    
        jdk   'JDK17'  
    }

    stages {

        stage('Clone Repository') {
            steps {
                echo 'Cloning repository...'
                git url: 'https://github.com/Kernashaat203/Cloud-Task4.git',
                    branch: 'main'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling source code...'
                sh 'mvn clean compile'
            }
        }

        stage('Run Unit Tests') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
            post {
                always {
                    // Shows test results in Jenkins UI
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }

    post {
        success {
            echo 'All tests passed!'
        }
        failure {
            echo 'Pipeline failed. Check test report for details.'
        }
    }
}
