def gitdownload(repo)
{
  "https://github.com/intelliqittrainings/{repo}.git"
}
def mavenbuild()
{
  "sh mvn package"
}
def runselenium(jobname)
{
sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
