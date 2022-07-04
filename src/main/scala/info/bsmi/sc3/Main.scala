package info.bsmi.sc3
import sttp.client3._

object Main:

  def msg = "我是用Scala 3编译的. :)"

  @main
  def hello: Unit = 
    println("我们都能听见Hello world!")
    println(msg)
    val sort: Option[String] = None
    val query = "http language:scala"

// the `query` parameter is automatically url-encoded
// `sort` is removed, as the value is not defined
    val request = basicRequest.get(
      uri"https://api.github.com/search/repositories?q=$query&sort=$sort"
    )

    val backend = HttpClientSyncBackend()
    val response = request.send(backend)

// response.header(...): Option[String]
    println(response.header("Content-Length"))

// response.body: by default read into an Either[String, String] to indicate failure or success
    println(response.body)
  

