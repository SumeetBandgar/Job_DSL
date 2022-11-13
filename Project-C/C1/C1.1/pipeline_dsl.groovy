pipelineJob('Project-A/A1/jenkins-pipeline-job-c1.1') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('')
              name('')
              refspec('')
              url('https://github.com/SumeetBandgar/Job_DSL.git')
            }
          }
          branches {
            branchSpec {
              name('*/pipeline-c1.1')
            }
          }
          browser {
            gitWeb {
              repoUrl('')
            }
          }
          gitTool('')
        }
      }
      scriptPath('Jenkinsfile')
      lightweight(true)
    }
  }
}