// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sahil.shah/Desktop/play_framework/play_framework/conf/routes
// @DATE:Thu Jun 13 09:38:48 CDT 2019


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
