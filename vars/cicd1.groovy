def newGit(repo)
{
  git "${repo}"
}
def mavenbuild()
{
  sh "mvn package"
}

