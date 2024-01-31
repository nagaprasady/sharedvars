def newGit(repo)
{
  git "${repo}"
}
def mavenbuild()
{
  sh "mvn package"
}
def tomcatdeploy(jobname,ip,context)
{ 
 sh  "scp /var/lib/jenkins/workspace/{jobname}/webapp/target/webapp.war ubuntu${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
 
