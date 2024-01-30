def gitdownload(repo)
{
  "https://github.com/intelliqittrainings/{repo}.git"
}
def mavenbuild()
{
  "sh mvn package"
}
stage('continous deployment')
    {    
        cicd.tomcatdeploy("sharedlibrary2","172.31.42.144","test2app")
        
    }
