pipeline {
    agent any
    stages {
        stage("build-product") {
            when {
                anyOf {
                    changeset "**/Jenkinsfile"
                    changeset "hu/bk/**"
                }
            }
            steps {
                script {
                    sh "echo building product with changes"
                    sh "echo setting new project displayname"
                    currentBuild.rawBuild.project.setDisplayName("pipeline-test-3")
                }
            }
        }
        stage("build-project") {
            steps {
                sh "echo building project"
            }
        }
        stage("deploy") {
            steps {
                sh "echo finally deploying project..."
            }
        }
    }
}
