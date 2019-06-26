import mhtml._

object Main {

  def apply() = {

    var myBool: Boolean = true

    <div mhtml-onmount={() => myBool = false}>some div</div>

  }

}
