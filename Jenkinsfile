pipeline {

    agent any

    triggers {
        pollSCM('* * * * *')
    }

    stages {
        stage("build") {
            steps {
                echo 'build the application.....'
            }
        }
        
        stage("test") {
            steps {
                echo 'test the application....'
            }
        }
    }
}