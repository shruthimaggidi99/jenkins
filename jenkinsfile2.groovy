pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Building stage
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing...'
                // Testing stage
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Deployment stage
            }
        }
    }
}
