pipeline {
    agent any
    environment{
	APP_DIR='${WORKSPACE}/demo_jenkins'
	JAR_FILE='demo-app-jenkins-1-0.0.1-SNAPSHOT.jar'
	}
    stages {
         stage('Clean workspace'){
            steps{
               cleanWs() 
            }
        }
        stage('Cloning Git Repo') {
            steps {
                    git branch:'main',url: 'https://github.com/afrozbanugit/demo_jenkins.git'
                }
        }
         stage('Building App') {
            steps {
                script{
                    bat 'cd demo_jenkins && mvn clean install -DskipTests'
                }
            }
        }
        stage('Run Application') {
            steps {
                script{
                    sh 'cd $APP_DIR/target && java -jar $JAR_FILE'
                }
            }
        }
    }
}
