pipelineJob('Project-A/A2/pipeline_job_a2') {
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
              name('*/pipeline-a2')
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