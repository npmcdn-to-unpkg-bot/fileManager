
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vhugo/apps/fileManager/conf/routes
// @DATE:Fri Aug 26 14:11:59 BRT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
